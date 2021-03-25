/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg8terem;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author polga
 */
public class Restaurant implements Menu {
    private int id, managerID;
    private String restaurantName, address, openHours, authorisationNumber;
    Scanner input = new Scanner(System.in);
    
    
    
    @Override
    public List<String> addMenu() {
        List<String> dishes = null; 
        System.out.println("How many dishes do you want to add: ");
        int numOfDishes = input.nextInt();
        for(int i=0;i<numOfDishes;i++)
        {
            System.out.println("Plese give the " +i+". dish's name you want to add: ");
            dishes.add(input.nextLine());
        }
        System.out.println("You've added these dishes to the menu: ");
        for(int i=0;i<dishes.size();i++)
        {
            System.out.println(dishes.get(i));
        }
        return dishes;
    }
    public Restaurant(int id, String restaurantName, String address, String openHours, String authorisationNumber, int managerID)
    {
        this.id=id;
        this.restaurantName=restaurantName;
        this.address=address;
        this.openHours=openHours;
        this.authorisationNumber=authorisationNumber;
        this.managerID=managerID;
    }
        
}
