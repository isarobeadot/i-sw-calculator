package inaki.sw.calc.view;

import inaki.sw.calc.controller.Controller;

/**
 *
 * @author inaki
 * @version 1.1.1
 * @since 1.0
 */
public interface IMainView {

    /* NUMBERS */
    public static final String MV_B0 = "0";
    public static final String MV_B1 = "1";
    public static final String MV_B2 = "2";
    public static final String MV_B3 = "3";
    public static final String MV_B4 = "4";
    public static final String MV_B5 = "5";
    public static final String MV_B6 = "6";
    public static final String MV_B7 = "7";
    public static final String MV_B8 = "8";
    public static final String MV_B9 = "9";
    public static final String MV_DOT = ".";
    /* OPERATORS */
    public static final String MV_ADD = "+";
    public static final String MV_SUBSTRACT = "-";
    public static final String MV_MULTIPLY = "*";
    public static final String MV_DIVIDE = "/";
    public static final String MV_POW = "^";
    public static final String MV_PLUS_MINUS = "P";
    public static final String MV_BACKSPACE = "B";
    public static final String MV_EQUAL = "=";
    /* MENU */
    public static final String MV_MENU_PREFERENCES = "MP";
    public static final String MV_MENU_QUIT = "MQ";
    /* ACTIONS */
    public static final String MV_QUIT = "Q";
    public static final String MV_ANS = "A";
    public static final String MV_CLEAN = "C";

    public void setController(Controller c);

    public void startView();

    public void clear();

    public String getTopText();

    public void setTopText(String s);

    public String getOpText();

    public void setOpText(String s);

    public String getMainText();

    public void setMainText(String s);

    public void setAnsEnabled(boolean b);

    public void setVersion(String version);

}
