/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg8terem;

import java.io.Serializable;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author polga
 */
public class Restaurant implements Serializable{
    private int restaurantID = 0;
    private int managerID = 0;
    private String restaurantName = null;
    private String restaurantAddress = null;
    private String openHours = null;
    private String authorisationNumber = null;
    
    Menu menu;
    Scanner input = new Scanner(System.in);

    public Restaurant(int _restaurantID, String _restaurantName, String _restaurantAddress, String _openHours, String _authorisationNumber, int _managerID)
    {
        this.restaurantID = _restaurantID;
        this.restaurantName = _restaurantName;
        this.restaurantAddress = _restaurantAddress;
        this.openHours = _openHours;
        this.authorisationNumber = _authorisationNumber;
        this.managerID = _managerID;
    }
    
    public Menu getMenu() {
        return menu;
    }        
}
