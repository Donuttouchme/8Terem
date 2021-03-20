
package pkg8terem;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;


public class Guest implements Users {
    private String username = null, password = null, passwordCheck = null;
    private String firstName = null, lastName = null;
    private String guestAddress = null;
    private int guestID = 0, phoneNumber = 0;
    Date registrationDate;
    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
    Scanner input = new Scanner(System.in);

    @Override
    public void Registration() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
