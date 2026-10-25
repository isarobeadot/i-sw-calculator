package inaki.sw.calc.view.swing.custom;

import inaki.sw.calc.lnf.Colors;
import inaki.sw.calc.lnf.LnFService;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

/**
 *
 * @author inaki
 * @since 3.1
 */
public class CustomComboCellRenderer extends JLabel
        implements ListCellRenderer<String> {

    @Override
    public Component getListCellRendererComponent(JList<? extends String> list,
            String value, int index, boolean isSelected, boolean cellHasFocus) {

        ICustomComboBoxModel model = (ICustomComboBoxModel) list.getModel();
        String displayName = model.getDisplayName(value);

        setText(displayName);
        setFont(list.getFont());

        if (isSelected) {
            setBackground(LnFService.getLnF().getColorMainDark());
            setForeground(LnFService.getLnF().getColorTxtLight());
        } else {
            setBackground(Colors.LIGHT);
            setForeground(LnFService.getLnF().getColorTxtDark());
        }

        return this;
    }
}
