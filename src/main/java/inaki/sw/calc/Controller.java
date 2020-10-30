package inaki.sw.calc;

import inaki.sw.calc.view.ViewInterface;
import static inaki.sw.calc.view.ViewInterface.ADD;
import static inaki.sw.calc.view.ViewInterface.ANS;
import static inaki.sw.calc.view.ViewInterface.B0;
import static inaki.sw.calc.view.ViewInterface.B1;
import static inaki.sw.calc.view.ViewInterface.B2;
import static inaki.sw.calc.view.ViewInterface.B3;
import static inaki.sw.calc.view.ViewInterface.B4;
import static inaki.sw.calc.view.ViewInterface.B5;
import static inaki.sw.calc.view.ViewInterface.B6;
import static inaki.sw.calc.view.ViewInterface.B7;
import static inaki.sw.calc.view.ViewInterface.B8;
import static inaki.sw.calc.view.ViewInterface.B9;
import static inaki.sw.calc.view.ViewInterface.BACKSPACE;
import static inaki.sw.calc.view.ViewInterface.CLEAN;
import static inaki.sw.calc.view.ViewInterface.DIVIDE;
import static inaki.sw.calc.view.ViewInterface.DOT;
import static inaki.sw.calc.view.ViewInterface.EQUAL;
import static inaki.sw.calc.view.ViewInterface.MULTIPLY;
import static inaki.sw.calc.view.ViewInterface.PLUS_MINUS;
import static inaki.sw.calc.view.ViewInterface.POW;
import static inaki.sw.calc.view.ViewInterface.QUIT;
import static inaki.sw.calc.view.ViewInterface.SUBSTRACT;
import inaki.sw.calc.view.swing.MainView;
import static java.awt.event.KeyEvent.VK_BACK_SPACE;
import static java.lang.Double.parseDouble;
import static java.lang.Math.pow;
import static java.lang.System.exit;
import static java.util.Locale.ENGLISH;

/**
 *
 * @author inaki
 * @version 1.0.2
 * @since 1.0
 */
public class Controller implements java.awt.event.ActionListener, java.awt.event.KeyListener {

    private final ViewInterface v;
    private double ans = 0.0d;
    private boolean equalPressed = false;

    /**
     * @since 1.0
     */
    public Controller() {
        this.v = new MainView();
    }

    void startController() {
        v.setController(this);
        v.startView();
        v.setAnsEnabled(false);
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
    }

    @Override
    public void keyReleased(java.awt.event.KeyEvent e) {
        if (e.getKeyCode() == VK_BACK_SPACE) {
            doCommand(BACKSPACE);
        }
    }

    private void doCommand(String action) {
        String top = v.getTopText();
        String op = v.getOpText();
        String main = v.getMainText();
        switch (action) {
            case B0:
            case B1:
            case B2:
            case B3:
            case B4:
            case B5:
            case B6:
            case B7:
            case B8:
            case B9:
                if (main.equals("0")) {
                    main = "";
                }
                if (main.equals("-0")) {
                    main = "-";
                }
                v.setMainText(main + action);
                equalPressed = false;
                break;
            case DOT:
                if (!main.contains(".")) {
                    v.setMainText(main + action);
                }
                break;
            case ADD:
            case SUBSTRACT:
            case MULTIPLY:
            case DIVIDE:
            case POW:
                if (!equalPressed) {
                    doEqual(op, main);
                }
                v.setOpText(action);
                equalPressed = false;
                break;
            case EQUAL:
                doEqual(op, main);
                break;
            case PLUS_MINUS:
                if (main.charAt(0) == '-') {
                    v.setMainText(main.replace("-", ""));
                } else {
                    v.setMainText("-" + main);
                }
                break;

            case BACKSPACE:
                int limit = main.contains("-") ? 2 : 1;
                if (main.length() > limit) {
                    v.setMainText(main.substring(0, main.length() - 1));
                } else if (main.length() == limit) {
                    if (!top.equals("") && !op.equals("")) {
                        v.setTopText("");
                        v.setOpText("");
                        v.setMainText(top);
                    } else {
                        v.setMainText("0");
                    }
                }
                main = v.getMainText();
                if (main.substring(main.length() - 1).equals(".")) {
                    v.setMainText(main.substring(0, main.length() - 1));
                }
                break;
            case QUIT:
                exit(0);
                break;
            case ANS:
                v.setTopText(this.ans + "");
                equalPressed = true;
                break;
            case CLEAN:
                v.clean();
                this.equalPressed = false;
                break;
            default:
                break;
        }
    }

    private void doEqual(String op, String main) {
        double d1;
        double d2;
        switch (op) {
            case ADD:
                d1 = this.ans;
                d2 = parseDouble(main);
                this.ans = d1 + d2;
                break;
            case SUBSTRACT:
                d1 = this.ans;
                d2 = parseDouble(main);
                this.ans = d1 - d2;
                break;
            case MULTIPLY:
                d1 = this.ans;
                d2 = parseDouble(main);
                this.ans = d1 * d2;
                break;
            case DIVIDE:
                d1 = this.ans;
                d2 = parseDouble(main);
                this.ans = d1 / d2;
                break;
            case POW:
                d1 = this.ans;
                d2 = parseDouble(main);
                this.ans = pow(d1, d2);
                break;
            default:
                this.ans = parseDouble(main);
                break;
        }
        v.clean();
        v.setTopText(this.ans + "");
        v.setAnsEnabled(true);
        equalPressed = true;
    }
}
