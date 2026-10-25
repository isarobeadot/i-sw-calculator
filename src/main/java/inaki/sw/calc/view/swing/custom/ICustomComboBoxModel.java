package inaki.sw.calc.view.swing.custom;

/**
 *
 * @author inaki
 * @since 3.2
 */
public interface ICustomComboBoxModel {

    /**
     * Returns the HTML text to display an element, given its key
     *
     * @param key
     * @return
     */
    public String getDisplayName(String key);

}
