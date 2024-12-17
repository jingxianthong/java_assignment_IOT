package java_assginment;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class JoptionCombo {

    // Method to show JComboBox inside JOptionPane
    public static String showComboBoxDialog(String[] options, String dialogTitle) {
        JComboBox<String> comboBox = new JComboBox<>(options);

        // Show the dialog with the combo box and get the user's selection
        int input = JOptionPane.showConfirmDialog(null, comboBox, dialogTitle, JOptionPane.OK_CANCEL_OPTION);

        // Check if the user pressed OK
        if (input == JOptionPane.OK_OPTION) {
            return (String) comboBox.getSelectedItem();  // Return the selected item
        } else {
            return null;  // Return null if Cancel was clicked
        }
    }
}
