/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day21.activity;

/**
 *
 * @author Mardyon
 */
public class UserAccount {
    
   
// Private fields (Encapsulation)
    private String firstName;
    private String middleName;
    private String lastName;
    private String address;
    private String email;
    private String password;

    // Constructor
    public UserAccount(String firstName, String middleName, String lastName,
                       String address, String email, String password) {

        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.address = address;

        setEmail(email);
        setPassword(password);
    }

    // Getters
    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    // Setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // Email validation
    public boolean setEmail(String email) {
        if (email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
            this.email = email;
            return true;
        }
        return false;
    }

    // Password validation
    public boolean setPassword(String password) {

        if (isValidPassword(password)) {
            this.password = password;
            return true;
        }

        return false;
    }

    // Helper method
    private boolean isValidPassword(String password) {

        if (password.length() < 8)
            return false;

        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;

        for (char c : password.toCharArray()) {

            if (Character.isUpperCase(c))
                hasUpper = true;
            else if (Character.isLowerCase(c))
                hasLower = true;
            else if (Character.isDigit(c))
                hasDigit = true;
            else
                hasSpecial = true;
        }

        return hasUpper && hasLower && hasDigit && hasSpecial;
    }
}
    

