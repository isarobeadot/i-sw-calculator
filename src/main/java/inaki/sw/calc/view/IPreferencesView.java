package inaki.sw.calc.view;

import inaki.sw.calc.controller.Controller;

/**
 *
 * @author inaki
 */
public interface IPreferencesView {

    public static final String PV_OK = "PV_OK";
    public static final String PV_CANCEL = "PV_CANCEL";

    public void setController(Controller c);

    public void startView();

    public void close();

}
