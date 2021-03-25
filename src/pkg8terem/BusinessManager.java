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
    private String email;
    private String registrationDate;
    private Date regDate;
    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
    Scanner input = new Scanner(System.in);
    
    @Override
    public BusinessManager Registration() {
    System.out.println("Enter email: ");                        //EMAIL
        email=input.nextLine();
    System.out.println("Enter username: ");                     //USERNAME
        username = input.nextLine();
    //TO-DO check with the server
    //
    //
    System.out.println("Enter password: ");                      //PASSWORD
        password = input.nextLine();
    System.out.println("Enter password again: ");   
        passwordCheck = input.nextLine();
    while(!password.equals(passwordCheck))                      //PASSWORD CHECK
    {
    System.out.println("Passwords are not matching, please enter them again: ");
        password = input.nextLine();
    System.out.println("Enter password again: ");
        passwordCheck = input.nextLine();
    }
    System.out.println("Enter your first name: ");              //NAME
        firstName = input.nextLine();
    System.out.println("Enter your last name: ");
        lastName = input.nextLine();
    System.out.println("Enter your Corporation's Name: ");      //CORPORATION NAME
       corporationName = input.nextLine();
    regDate = new Date(System.currentTimeMillis());
    registrationDate=formatter.format(regDate);    //REGISTRATION DATE 
        return new BusinessManager(username,password,firstName,lastName,corporationName,email,registrationDate);
    
    }

    @Override
    public void Login() {
        System.out.println("Enter username: ");
            username = input.nextLine();
        System.out.println("Enter password: ");
            password = input.nextLine();
    }
    
    public BusinessManager(String username,String password,String firstName,String lastName,String corporationName,String email,String registrationDate)
    {
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.corporationName = corporationName;
        this.email = email;
        this.registrationDate = registrationDate;
    }
    
    Restaurant RestaurantRegistration()
    {
        int id,managerID;
        String restaurantName, address, openHours, authorisationNumber;
        System.out.println("");
        id=0;
        managerID=0;
        System.out.println("Enter your restaurant's name: ");
            restaurantName = input.nextLine();
        System.out.println("Enter your restaurant's address: ");
            address = input.nextLine();
        System.out.println("Enter your restaurant's hopen hours: ");
            openHours = input.nextLine();
        System.out.println("Enter your restaurant's authorisation number: ");
            authorisationNumber = input.nextLine();
            Restaurant restaurant = new Restaurant(id,restaurantName, address, openHours, authorisationNumber, managerID);
            return restaurant;
    }
    
    void checkOrders()
    {
        
    }
    
    void getTotalRevenue()
    {
        
    }
    void deleteOrder()
    {
        
    }
    void editOrder()
    {
        
    }
    void addMealToMenu()
    {
        
    }
    void editMealProperties()
    {
        
    }
    void editDiscount()
    {
        
    }
    void setPaymentType()
    {
        
    }
    void setOpenHours()
    {
        
    }
    void setDeliveryTime()
    {
        
    }
    void setOrderQueue()
    {
        
    }
    void assignCourierToOrder()
    {
        
    }
}
