
package pkg8terem;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;


public class Guest implements Users {
    private String username = null, password = null, passwordCheck = null;
    private String firstName = null, lastName = null, guestAddress = null, phoneNumber = null;

    private String registrationDate;
    private Date regDate;
    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
    Scanner input = new Scanner(System.in);

    @Override
    public Guest Registration() {
        System.out.println("Enter username: ");
         username = input.nextLine();
    //TO-DO check with the server
    //
    //
    System.out.println("Enter password: ");                             //PASSWORD
        password = input.nextLine();
    System.out.println("Enter password again: ");   
        passwordCheck = input.nextLine();
    while(!password.equals(passwordCheck))                              //PASSWORD CHECK
    {
         System.out.println("Passwords are not matching, please enter them again: ");
            password = input.nextLine();
         System.out.println("Enter password again: ");
            passwordCheck = input.nextLine();
    }
    System.out.println("Enter your first name: ");                      //NAME
        firstName = input.nextLine();
    System.out.println("Enter your last name: ");
        lastName = input.nextLine();
    System.out.println("Enter your address: ");                         //ADDRESS
        guestAddress = input.nextLine();
    System.out.println("Enter your phone number: ");                    //PHONE NUMBER
        phoneNumber = input.nextLine();                                                 
    regDate = new Date(System.currentTimeMillis());
    registrationDate=formatter.format(regDate);//REGISTRATION DATE  
    return new Guest(username,password,firstName,lastName,guestAddress,phoneNumber,registrationDate);
    }
    
    public Guest(String username,String  password, String firstName,String  lastName,String guestAddress, String phoneNumber, String registrationDate)
    {
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.guestAddress = phoneNumber;
        this.registrationDate = registrationDate;
    }

    @Override
    public void Login() {
        System.out.println("Enter username: ");
        username = input.nextLine();
        System.out.println("Enter password: ");
        password = input.nextLine();
    }
    
    public void makeOrder() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.      
    }
    
      public void checkOrderStatus() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.      
    }
      
    public void listIngredients() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.      
    }
    
    public void listAllergenes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.      
    }
    
      public void searchRestaurant() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.      
    }
    
    public void getMenu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.      
    }
    
    public void addMealToOrder() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.      
    }
    
}
