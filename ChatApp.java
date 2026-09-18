/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.chatapp;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class ChatApp {

    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);

        System.out.println("==============================");
        System.out.println("     LOGIN REGISTRATION");
        System.out.println("==============================");

        
        System.out.print("Enter username: ");
        String userName = input.nextLine();

        
        System.out.print("Enter password: ");
        String password = input.nextLine();

       
        System.out.print("Enter cellphone number: ");
        String cellPhoneNumber = input.nextLine();

        
        Login user = new Login(
                userName,
                password,
                cellPhoneNumber
        );

        System.out.println();
        System.out.println("========== REGISTRATION RESULTS ==========");

        
        System.out.println(user.getUserNameMessage());
        System.out.println(user.getPasswordMessage());
        System.out.println(user.getCellPhoneMessage());

       
        if (user.registrationSuccessful()) {

            System.out.println();
            System.out.println("Registration successful!");

           
            Login login = new Login(
                    userName,
                    password, cellPhoneNumber
            );

            System.out.println();
            System.out.println("==============================");
            System.out.println("            LOGIN");
            System.out.println("==============================");

           
            System.out.print("Enter username to login: ");
            String loginUserName = input.nextLine();

           
            System.out.print("Enter password to login: ");
            String loginPassword = input.nextLine();

            
            boolean loginSuccessful = login.loginUser(
                    loginUserName,
                    loginPassword
            );

            
            System.out.println();
            System.out.println(
                    login.returnLoginStatus(loginSuccessful)
            );

        } else {

            
            System.out.println();
            System.out.println("Registration failed.");
            System.out.println("Please correct your details and try again.");
        }

        
        input.close();
    }
}
