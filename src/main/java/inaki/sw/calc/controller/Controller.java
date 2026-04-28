package inaki.sw.calc.controller;

import inaki.sw.calc.view.IMainView;
import static inaki.sw.calc.view.IMainView.MV_ADD;
import static inaki.sw.calc.view.IMainView.MV_ANS;
import static inaki.sw.calc.view.IMainView.MV_B0;
import static inaki.sw.calc.view.IMainView.MV_B1;
import static inaki.sw.calc.view.IMainView.MV_B2;
import static inaki.sw.calc.view.IMainView.MV_B3;
import static inaki.sw.calc.view.IMainView.MV_B4;
import static inaki.sw.calc.view.IMainView.MV_B5;
import static inaki.sw.calc.view.IMainView.MV_B6;
import static inaki.sw.calc.view.IMainView.MV_B7;
import static inaki.sw.calc.view.IMainView.MV_B8;
import static inaki.sw.calc.view.IMainView.MV_B9;
import static inaki.sw.calc.view.IMainView.MV_BACKSPACE;
import static inaki.sw.calc.view.IMainView.MV_CLEAN;
import static inaki.sw.calc.view.IMainView.MV_DIVIDE;
import static inaki.sw.calc.view.IMainView.MV_DOT;
import static inaki.sw.calc.view.IMainView.MV_EQUAL;
import static inaki.sw.calc.view.IMainView.MV_MENU_PREFERENCES;
import static inaki.sw.calc.view.IMainView.MV_MENU_QUIT;
import static inaki.sw.calc.view.IMainView.MV_MULTIPLY;
import static inaki.sw.calc.view.IMainView.MV_PLUS_MINUS;
import static inaki.sw.calc.view.IMainView.MV_POW;
import static inaki.sw.calc.view.IMainView.MV_QUIT;
import static inaki.sw.calc.view.IMainView.MV_SUBSTRACT;
import inaki.sw.calc.view.IPreferencesView;
import static inaki.sw.calc.view.IPreferencesView.PV_CANCEL;
import static inaki.sw.calc.view.IPreferencesView.PV_OK;
import inaki.sw.calc.view.swing.MainView;
import inaki.sw.calc.view.swing.PreferencesView;
import inaki.sw.lib.utils.VChecker;
import static inaki.sw.lib.utils.VChecker.VC_VERSION_AVAILABLE;
import java.awt.Desktop;
import static java.awt.event.KeyEvent.VK_BACK_SPACE;
import java.io.IOException;
import static java.lang.Double.parseDouble;
import static java.lang.Math.pow;
import static java.lang.System.exit;
import java.net.URI;
import static java.util.Locale.ENGLISH;
import javax.swing.JOptionPane;

/**
 *
 * @author inaki
 * @version 1.1.1
 * @since 1.0
 */
public class Controller implements java.awt.event.ActionListener, java.awt.event.KeyListener {

    private final IMainView mv;
    private final IPreferencesView pv;
    private final String version = this.getClass().getPackage().getImplementationVersion();
    private double ans = 0.0d;
    private boolean equalPressed = false;

    private final VChecker vChecker;

    /**
     * @since 1.06
     */
    public Controller() {
        this.mv = new MainView();
        this.pv = new PreferencesView((MainView) mv, false);
        this.vChecker = new VChecker("isw-calc", this.version);
    }

    public void startController() {
        mv.setController(this);
        pv.setController(this);
        vChecker.setActionlistener(this);

        mv.startView();
        mv.setAnsEnabled(false);
        mv.setVersion(this.version);

        if (this.version != null) {
            Thread vCheckerThread = new Thread(vChecker);
            vCheckerThread.start();
        }
    }

    @Override
    public void actionPerformed(java.awt.event.ActionEvent e) {
        doCommand(e.getActionCommand());
    }

    @Override
    public void keyTyped(java.awt.event.KeyEvent e) {
        doCommand((e.getKeyChar() + "").toUpperCase(ENGLISH));
    }

    @Override
    public void keyPressed(java.awt.event.KeyEvent e) {
        // empty
    }

    @Override
    public void keyReleased(java.awt.event.KeyEvent e) {
        if (e.getKeyCode() == VK_BACK_SPACE) {
            doCommand(MV_BACKSPACE);
        }
    }

    private void doCommand(String action) {
        System.out.println("Action: " + action);
        String top = mv.getTopText();
        String op = mv.getOpText();
        String main = mv.getMainText();
        switch (action) {
            case MV_B0, MV_B1, MV_B2, MV_B3, MV_B4, MV_B5, MV_B6, MV_B7, MV_B8, MV_B9 -> {
                if (main.equals("0")) {
                    main = "";
                }
                if (main.equals("-0")) {
                    main = "-";
                }
                mv.setMainText(main + action);
                equalPressed = false;
            }
            case MV_DOT -> {
                if (!main.contains(".")) {
                    mv.setMainText(main + action);
                }
            }
            case MV_ADD, MV_SUBSTRACT, MV_MULTIPLY, MV_DIVIDE, MV_POW -> {
                if (!equalPressed) {
                    doEqual(op, main);
                }
                mv.setOpText(action);
                equalPressed = false;
            }
            case MV_EQUAL ->
                doEqual(op, main);
            case MV_PLUS_MINUS -> {
                if (main.charAt(0) == '-') {
                    mv.setMainText(main.replace("-", ""));
                } else {
                    mv.setMainText("-" + main);
                }
            }
            case MV_BACKSPACE -> {
                int limit = main.contains("-") ? 2 : 1;
                if (main.length() > limit) {
                    mv.setMainText(main.substring(0, main.length() - 1));
                } else if (main.length() == limit) {
                    if (!top.equals("") && !op.equals("")) {
                        mv.setTopText("");
                        mv.setOpText("");
                        mv.setMainText(top);
                    } else {
                        mv.setMainText("0");
                        equalPressed = !mv.getTopText().isEmpty();
                    }
                }
                main = mv.getMainText();
                if (main.substring(main.length() - 1).equals(".")) {
                    mv.setMainText(main.substring(0, main.length() - 1));
                }
            }
            case MV_MENU_QUIT, MV_QUIT ->
                exit(0);
            case MV_ANS -> {
                mv.setTopText(this.ans + "");
                equalPressed = true;
            }
            case MV_CLEAN -> {
                mv.clear();
                this.equalPressed = false;
            }
            case VC_VERSION_AVAILABLE -> {
                final int option = JOptionPane.showConfirmDialog(null, "<html><p>There is a newer version available.</p>"
                        + "<p>Do you want to download it?</p></html>", "New version", JOptionPane.YES_NO_OPTION);
                if (option == 0) {
                    // YES
                    try {
                        Desktop.getDesktop().browse(URI.create("https://inaki-sw.xyz/web/downloads#isw-calc"));
                    } catch (IOException ex) {
                        JOptionPane.showMessageDialog(null, "An error occurred", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
            case MV_MENU_PREFERENCES ->
                pv.startView();
            case PV_OK ->
                pv.close();
            case PV_CANCEL ->
                pv.close();
            default ->
                System.err.println("Action " + action + " not supported.");
        }
    }

    private void doEqual(String op, String main) {
        double d1;
        double d2;
        switch (op) {
            case MV_ADD -> {
                d1 = this.ans;
                d2 = parseDouble(main);
                this.ans = d1 + d2;
            }
            case MV_SUBSTRACT -> {
                d1 = this.ans;
                d2 = parseDouble(main);
                this.ans = d1 - d2;
            }
            case MV_MULTIPLY -> {
                d1 = this.ans;
                d2 = parseDouble(main);
                this.ans = d1 * d2;
            }
            case MV_DIVIDE -> {
                d1 = this.ans;
                d2 = parseDouble(main);
                this.ans = d1 / d2;
            }
            case MV_POW -> {
                d1 = this.ans;
                d2 = parseDouble(main);
                this.ans = pow(d1, d2);
            }
            default ->
                this.ans = parseDouble(main);
        }
        mv.clear();
        mv.setTopText(this.ans + "");
        mv.setAnsEnabled(true);
        equalPressed = true;
    }
}
