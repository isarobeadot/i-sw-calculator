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
    public static final String B0 = "0";
    public static final String B1 = "1";
    public static final String B2 = "2";
    public static final String B3 = "3";
    public static final String B4 = "4";
    public static final String B5 = "5";
    public static final String B6 = "6";
    public static final String B7 = "7";
    public static final String B8 = "8";
    public static final String B9 = "9";
    public static final String DOT = ".";
    /* OPERATORS */
    public static final String ADD = "+";
    public static final String SUBSTRACT = "-";
    public static final String MULTIPLY = "*";
    public static final String DIVIDE = "/";
    public static final String POW = "^";
    public static final String PLUS_MINUS = "P";
    public static final String BACKSPACE = "B";
    public static final String EQUAL = "=";
    /* ACTIONS */
    public static final String QUIT = "Q";
    public static final String ANS = "A";
    public static final String CLEAN = "C";

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
