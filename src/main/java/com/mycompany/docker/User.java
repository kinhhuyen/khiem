/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.docker;

import java.util.Scanner;

public class User {
    private String userId;
    private String email;

    public User(String userId, String email) {
        this.userId = userId;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public void updateEmail(String newEmail) {
        this.email = newEmail;
    }
    
    public String getUserId() {
        return userId;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Nhập thông tin người dùng:");
        System.out.print("User ID: ");
        String userId = scanner.nextLine();
        
        System.out.print("Email: ");
        String email = scanner.nextLine();
        
        // Tạo đối tượng User với thông tin vừa nhập
        User user = new User(userId, email);
        
        System.out.println("\nThông tin người dùng đã nhập:");
        System.out.println("User ID: " + user.getUserId());
        System.out.println("Email: " + user.getEmail());
        
        scanner.close();
    }
}

