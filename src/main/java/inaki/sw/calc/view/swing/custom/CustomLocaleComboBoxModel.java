package inaki.sw.calc.view.swing.custom;

import inaki.sw.calc.i18n.CustomLocale;
import java.util.Arrays;
import java.util.Comparator;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author inaki
 * @since 3.1
 */
public class CustomLocaleComboBoxModel extends DefaultComboBoxModel<String> implements ICustomComboBoxModel {

    public CustomLocaleComboBoxModel() {
        for (CustomLocale locale : Arrays.stream(CustomLocale.values()).sorted(Comparator.comparing(CustomLocale::getKey))
                .toArray(CustomLocale[]::new)) {
            addElement(locale.getKey());
        }
    }

    /**
     * Returns the HTML text to display an element, given its key
     *
     * @param key
     * @return
     */
    @Override
    public String getDisplayName(String key) {
        for (CustomLocale locale : CustomLocale.values()) {
            if (locale.getKey().equals(key)) {
                return locale.getNameHTML();
            }
        }
        return key;
    }
}
