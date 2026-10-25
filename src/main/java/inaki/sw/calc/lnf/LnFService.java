package inaki.sw.calc.lnf;

import inaki.sw.calc.i18n.I18nService;
import javax.swing.UIManager;

/**
 *
 * @author inaki
 * @since 3.2
 */
public class LnFService {

    private static LnF lnf;

    public static void init(LnF lnf) {
        LnFService.lnf = lnf;
        try {
            UIManager.setLookAndFeel(new com.formdev.flatlaf.FlatLightLaf());
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            // empty
        }
        // https://www.formdev.com/flatlaf/customizing/
        UIManager.put("Button.arc", 20); // Rounded buttons
        UIManager.put("Button.default.foreground", lnf.getColorTxtDark());
        UIManager.put("Button.default.background", lnf.getColorMainLight());
        UIManager.put("Button.default.focusedBackground", lnf.getColorMainLight());
        UIManager.put("Component.arrowType", "triangle");
        UIManager.put("Menu.foreground", lnf.getColorTxtDark());
        UIManager.put("Menu.selectionForeground", lnf.getColorTxtLight());
        UIManager.put("Menu.selectionBackground", lnf.getColorMainDark());
        UIManager.put("MenuItem.foreground", lnf.getColorTxtDark());
        UIManager.put("MenuItem.selectionForeground", lnf.getColorTxtLight());
        UIManager.put("MenuItem.selectionBackground", lnf.getColorMainDark());
        UIManager.put("OptionPane.messageForeground", lnf.getColorTxtDark());
        UIManager.put("OptionPane.okButtonText", "<html><body><h3>" + I18nService.getMessage("ok", "") + "</h3></body></html>");
        UIManager.put("TitledBorder.titleColor", lnf.getColorTxtDark());
    }

    public static LnF getLnF() {
        return lnf;
    }

    public static void setLnF(LnF lnf) {
        init(lnf);
    }

    private LnFService() {
    }

}
