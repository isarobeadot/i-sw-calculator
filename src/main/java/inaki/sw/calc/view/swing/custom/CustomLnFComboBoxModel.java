package inaki.sw.calc.view.swing.custom;

import inaki.sw.calc.lnf.LnF;
import java.util.Arrays;
import java.util.Comparator;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author inaki
 * @since 3.2
 */
public class CustomLnFComboBoxModel extends DefaultComboBoxModel<String> implements ICustomComboBoxModel {

    public CustomLnFComboBoxModel() {
        for (LnF lnf : Arrays.stream(LnF.values()).sorted(Comparator.comparing(LnF::getKey))
                .toArray(LnF[]::new)) {
            addElement(lnf.getKey());
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
        for (LnF lnf : LnF.values()) {
            if (lnf.getKey().equals(key)) {
                return lnf.getNameHTML();
            }
        }
        return key;
    }
}
