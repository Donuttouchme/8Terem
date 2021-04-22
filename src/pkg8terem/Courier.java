/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg8terem;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author polga
 */
public class Courier implements Users, Serializable{

    private String username = null;
    private String password = null;
    private String firstName = null;
    private String lastName = null;
    private String phoneNumber = null;


    private String workingHours = null;
    private int salary = 0;
    static Scanner input = new Scanner(System.in);
    
    private int courierID;
    
    public Courier()
    {
        
    }
    
    public Courier(String _username, String _password, String _firstname, String _lastname, String _phonenumber, String _workingHours)
    {
        this.username = _username;
        this.password= _password;
        this.firstName = _firstname;
        this.lastName = _lastname;
        this.phoneNumber = _phonenumber;
        this.workingHours = _workingHours;
        String[] parts = _workingHours.split("-");
        String part1 = parts[0]; 
        String part2 = parts[1]; 
        this.salary = 1100*(Integer.parseInt(part2)-Integer.parseInt(part1));
    }
    
    @Override
    public Courier Registration(String __username) {        
       return new Courier(); 
    }

    @Override
    public Courier Login() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    
        public int getCourierID() {
        return courierID;
    }

    public void setCourierID(int courierID) {
        this.courierID = courierID;
    }
        public String getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(String workingHours) {
        this.workingHours = workingHours;
    }
}
