/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

/**
 *
 * @author ACER
 */
public class Validate {
   
    public static boolean isValidPassword(String password) {
        String regex = "^(?=.*[A-Z])(?=.*\\d)[A-Za-z\\d]{6,}$";
        return password.matches(regex);
    }
    public static boolean isValidEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$";
        return email.matches(emailRegex);
    }
    public static boolean isValidPhoneNumber(String phoneNumber) {
        return phoneNumber.matches("(((\\+|)84)|0)(3|5|7|8|9)+([0-9]{8})\\b"); 
    }
    public  static boolean isMatchPass(String pass, String confirmPass) {
        return pass.equals(confirmPass);
    }
    
}
