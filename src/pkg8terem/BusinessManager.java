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
    //variables
    private String username = null;
    private String password=null;
    private String passwordCheck=null;
    private String firstName=null;
    private String lastName=null;
    private String corporationName=null;
    private String email;
    private String registrationDate;
    private Restaurant managedRestaurant;
    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
    Scanner input = new Scanner(System.in);
    
    //functions
    //
    
        public BusinessManager(String _username,String _password,String _firstName,String _lastName,String _corporationName,String _email,String _registrationDate)
    {
        this.username = _username;
        this.password = _password;
        this.firstName = _firstName;
        this.lastName = _lastName;
        this.corporationName = _corporationName;
        this.email = _email;
        this.registrationDate = _registrationDate;
    }
    
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
    registrationDate=formatter.format(new Date(System.currentTimeMillis()));    //REGISTRATION DATE 
        return new BusinessManager(username,password,firstName,lastName,corporationName,email,registrationDate);
    }

    @Override
    public void Login() {
        System.out.println("Enter username: ");
            username = input.nextLine();
            //TO-DO CHECK WITH THE SERVER
            //
            //
        System.out.println("Enter password: ");
            password = input.nextLine();
            //TO-DO CHECK WITH THE SERVER
            //
            //
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
            return new Restaurant(id,restaurantName, address, openHours, authorisationNumber, managerID);
    }
    
    void checkOrders()
    {
        //TO-DO
        //
        //
    }
    
    void getTotalRevenue()
    {
        //TO-DO
        //
        // 
    }
    void deleteOrder()
    {
        //TO-DO
        //
        // 
    }
    void editOrder()
    {
        //TO-DO
        //
        // 
    }
    void addMealToMenu()
    {
        System.out.println("How many meals do you want to add? :");
        int cycle =input.nextInt();
        for (int i = 0; i < cycle; i++) 
        {
            System.out.println("Enter the " +(i+1)+". meal's name: ");
               String mealName = input.nextLine();
            System.out.println("Enter the " +(i+1)+". meal's cost: ");
                int mealCost = input.nextInt();
            System.out.println("How many allergens do you want to add to the meal?: ");
                int cycle2=input.nextInt();
                List<String>allergens =null;
                for(int j=0;j<cycle2;j++)
                {
                    System.out.println("Enter the " +(j+1)+". allergen: ");
                    allergens.add(input.nextLine());
                }
                managedRestaurant.addMealToMenu(new Meal(managedRestaurant.getMenu().size()+1,mealName,mealCost,allergens));
        }
    }
    void editMealProperties()
    {
        //TO-DO
        //
        // 
    }
    void editDiscount()
    {
        //TO-DO
        //
        // 
    }
    void setPaymentType()
    {
       //TO-DO
        //
        //  
    }
    void setOpenHours()
    {
        //TO-DO
        //
        // 
    }
    void setDeliveryTime()
    {
        //TO-DO
        //
        // 
    }
    void setOrderQueue()
    {
        //TO-DO
        //
        // 
    }
    void assignCourierToOrder()
    {
        //TO-DO
        //
        // 
    }
}
