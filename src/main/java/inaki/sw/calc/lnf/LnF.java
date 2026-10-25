package inaki.sw.calc.lnf;

import inaki.sw.calc.i18n.I18nService;
import java.awt.Color;

/**
 *
 * @author inaki
 */
public enum LnF {

    BLUE("blue", Colors.BLUE_LIGHT, Colors.BLUE_DARK, Colors.LIGHT, Colors.DARK),
    DARK("dark", Colors.DARK_LIGHT, Colors.DARK_DARK, Colors.LIGHT, Colors.DARK),
    GOLD("gold", Colors.GOLD_LIGHT, Colors.GOLD_DARK, Colors.LIGHT, Colors.DARK),
    GREEN("green", Colors.GREEN_LIGHT, Colors.GREEN_DARK, Colors.LIGHT, Colors.DARK),
    LIME("lime", Colors.LIME_LIGHT, Colors.LIME_DARK, Colors.LIGHT, Colors.DARK),
    ORANGE("orange", Colors.ORANGE_LIGHT, Colors.ORANGE_DARK, Colors.LIGHT, Colors.DARK),
    PINK("pink", Colors.PINK_LIGHT, Colors.PINK_DARK, Colors.LIGHT, Colors.DARK),
    PURPLE("purple", Colors.PURPLE_LIGHT, Colors.PURPLE_DARK, Colors.LIGHT, Colors.DARK),
    RED("red", Colors.RED_LIGHT, Colors.RED_DARK, Colors.LIGHT, Colors.DARK),
    TURQUOISE("turquoise", Colors.TURQUOISE_LIGHT, Colors.TURQUOISE_DARK, Colors.LIGHT, Colors.DARK);

    private final String key;
    private final Color colorMainLight;
    private final Color colorMainDark;
    private final Color colorTxtLight;
    private final Color colorTxtDark;

    private LnF(String key, Color colorMainLight, Color colorMainDark, Color colorTxtLight, Color colorTxtDark) {
        this.key = key;
        this.colorMainLight = colorMainLight;
        this.colorMainDark = colorMainDark;
        this.colorTxtLight = colorTxtLight;
        this.colorTxtDark = colorTxtDark;
    }

    public String getKey() {
        return key;
    }

    public Color getColorMainLight() {
        return colorMainLight;
    }

    public Color getColorMainDark() {
        return colorMainDark;
    }

    public Color getColorTxtLight() {
        return colorTxtLight;
    }

    public Color getColorTxtDark() {
        return colorTxtDark;
    }

    public String getNameHTML() {
        return "<html><body><h3><span style=\"background: rgb("
                + colorMainDark.getRed() + ", " + colorMainDark.getGreen() + ", " + colorMainDark.getBlue()
                + ");\">&nbsp;&nbsp;</span><span style=\"background: rgb("
                + colorMainLight.getRed() + ", " + colorMainLight.getGreen() + ", " + colorMainLight.getBlue()
                + ");\">&nbsp;&nbsp;</span>&nbsp;"
                + I18nService.getMessage("theme_" + key, key) + "</h3></body></html>";
    }

    /**
     * Returns the complete enum object based on a key
     *
     * @param key
     * @return
     */
    public static LnF getLnFByKey(String key) {
        for (LnF lnf : LnF.values()) {
            if (lnf.getKey().equals(key)) {
                return lnf;
            }
        }
        return null;
    }

}
