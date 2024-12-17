package Code_only;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java_assginment.login_page;
import javax.swing.JOptionPane;

public class SignUpForm_button {

    // Method to handle sign-up logic
    public void handleSignUp(String firstName, String lastName, String username, 
                             String password, String rePassword, String role, 
                             java.util.Date date) {
        // Check if passwords match
        if (!password.equals(rePassword)) {
            JOptionPane.showMessageDialog(null, "Passwords do not match.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Format the date
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String formattedDate = sdf.format(date);

        // Save user details to a file
        try (FileWriter writer = new FileWriter("src/User_data/user_data.txt", true)) {
            writer.write(firstName + "," + lastName + "," + username + "," + role + "," + formattedDate + "\n");
            JOptionPane.showMessageDialog(null, "Registration successful!");
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error saving registration details. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Proceed to the login page
        login_page loginPage = new login_page();
        loginPage.setVisible(true);
    }
}
