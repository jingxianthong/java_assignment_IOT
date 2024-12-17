/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_assginment;

/**
 *
 * @author thong
 */
public class User {
    
    private String username;
    private String role;  // Store the role as a string (e.g., "admin", "finance manager")

    // Constructor
    public User(String username, String role) {
        this.username = username;
        this.role = role;
    }

    // Getter for the role
    public String getRole() {
        return role;
    }

    // Setter for the role
    public void setRole(String role) {
        this.role = role;
    }   
}
