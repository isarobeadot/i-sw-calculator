package inaki.sw.calc.view.swing.custom;

import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

/**
 *
 * @author inaki
 * @since 3.1
 */
public class CustomLocaleCellRenderer extends JLabel
        implements ListCellRenderer<String> {

    @Override
    public Component getListCellRendererComponent(JList<? extends String> list,
            String value, int index, boolean isSelected, boolean cellHasFocus) {

        CustomLocaleComboBoxModel model = (CustomLocaleComboBoxModel) list.getModel();
        String displayName = model.getDisplayName(value);

        setText(displayName);
        setFont(list.getFont());

        if (isSelected) {
            setBackground(list.getSelectionBackground());
            setForeground(list.getSelectionForeground());
        } else {
            setBackground(list.getBackground());
            setForeground(list.getForeground());
        }

        return this;
    }
}
