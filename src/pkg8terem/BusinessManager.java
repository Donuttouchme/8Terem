/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg8terem;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author polgar
 */


public class BusinessManager implements Users {
    private String username = null;
    private String password=null;
    private String passwordCheck=null;
    private String firstName=null;
    private String lastName=null;
    private String corporationName=null;
    Date registrationDate;
    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
    Scanner input = new Scanner(System.in);
    
    @Override
    public void Registration() {
   
    System.out.println("Enter username: ");
         username = input.nextLine();
    //TO-DO check with the server
    //
    //
    System.out.println("Enter password: ");
        password = input.nextLine();
    System.out.println("Enter password again: ");   
        passwordCheck = input.nextLine();
    while(!password.equals(passwordCheck))
    {
         System.out.println("Passwords are not matching, please enter them again: ");
            password = input.nextLine();
         System.out.println("Enter password again: ");
            passwordCheck = input.nextLine();
    }
        System.out.println("Enter your first name: ");
            firstName = input.nextLine();
        System.out.println("Enter your last name: ");
            lastName = input.nextLine();
        System.out.println("Enter your Corporation's Name: ");
            corporationName = input.nextLine();
        registrationDate = new Date(System.currentTimeMillis());             
    }

    @Override
    public void Login() {
        System.out.println("Enter username: ");
            username = input.nextLine();
        System.out.println("Enter password: ");
            password = input.nextLine();
    }
    void RestaurantRegistration()
    {
        String restaurantName, address, authorisationNumber;
        System.out.println("Enter your restaurant's name: ");
            restaurantName = input.nextLine();
        System.out.println("Enter your restaurant's address: ");
            address = input.nextLine();
        System.out.println("Enter your restaurant's authorisation number: ");
            authorisationNumber = input.nextLine();
    }
    
}