package inaki.sw.calc.view;

import inaki.sw.calc.Controller;

/**
 *
 * @author inaki
 * @version 1.0.2
 * @since 1.0
 */
public interface ViewInterface {

    /* NUMBERS */
    public final static String B0 = "0";
    public final static String B1 = "1";
    public final static String B2 = "2";
    public final static String B3 = "3";
    public final static String B4 = "4";
    public final static String B5 = "5";
    public final static String B6 = "6";
    public final static String B7 = "7";
    public final static String B8 = "8";
    public final static String B9 = "9";
    public final static String DOT = ".";
    /* OPERATORS */
    public final static String ADD = "+";
    public final static String SUBSTRACT = "-";
    public final static String MULTIPLY = "*";
    public final static String DIVIDE = "/";
    public final static String POW = "^";
    public final static String PLUS_MINUS = "P";
    public final static String BACKSPACE = "B";
    public final static String EQUAL = "=";
    /* ACTIONS */
    public final static String QUIT = "Q";
    public final static String ANS = "A";
    public final static String CLEAN = "C";

    public void setController(Controller c);

    public void startView();

    public void clean();

    public String getTopText();

    public void setTopText(String s);

    public String getOpText();

    public void setOpText(String s);

    public String getMainText();

    public void setMainText(String s);

    public void setAnsEnabled(boolean b);

}
