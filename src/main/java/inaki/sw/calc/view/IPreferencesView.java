package inaki.sw.calc.view;

/**
 *
 * @author inaki
 * @since 3.0
 */
public interface IPreferencesView extends IView {

    public static final String PV_OK = "PV_OK";
    public static final String PV_CANCEL = "PV_CANCEL";

    public String getSelectedLanguage();

    public String getSelectedLnF();

    public void close();

}
