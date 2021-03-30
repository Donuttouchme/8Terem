/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg8terem;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import static java.lang.Thread.sleep;
import java.net.Socket;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.util.Pair;

/**
 *
 * @author polga
 */
public class Main implements Serializable {
    static Login login = null;
    static Scanner input = new Scanner(System.in);
    static ObjectOutputStream objectOutputStream = null;
    static ObjectInputStream objectInputStream = null;
    static InputStream inputStream = null;
    static Pair<Object,Integer> datas;
    public static BusinessManager businessManager;
    public Guest guest;
    public Courier courier;
    private static final long serialVersionUID = 6529685098267757691L;
    
    /**
     * @param args the command line arguments
     */
    
    public boolean registration(String username, String password, String fName, String lName,String corporationName,String email, int switchCase) throws IOException
    {
        objectInputStream = new ObjectInputStream(inputStream);
        switch (switchCase)
        {
                case 0://BM
                    datas = new Pair<>(username,5);
                    objectOutputStream.writeObject(datas);
                    objectOutputStream.flush();
                    objectOutputStream.reset();
                    if(!objectInputStream.readBoolean())
                    {
                         objectOutputStream.writeObject(new Pair<>(new BusinessManager(username,password,fName,lName,corporationName,email),1));
                    }
                    return objectInputStream.readBoolean();
                case 1://Guest
                    datas = new Pair<>(username,6);
                    objectOutputStream.writeObject(datas);
                    objectOutputStream.flush();
                    objectOutputStream.reset();
                    if(!objectInputStream.readBoolean())
                    {
                         objectOutputStream.writeObject(new Pair<>(new Guest(username,password,fName,lName,corporationName,email),1));
                    }
                    return objectInputStream.readBoolean();
                case 2://Courier
                    datas = new Pair<>(username,7);
                    objectOutputStream.writeObject(datas);
                    objectOutputStream.flush();
                    objectOutputStream.reset();
                    if(!objectInputStream.readBoolean())
                    {
                         objectOutputStream.writeObject(new Pair<>(new Courier(username,password,fName,lName,corporationName,Integer.parseInt(email)),1));
                    }
                    return objectInputStream.readBoolean();
                default:
                    return true;
        }                         
    }
    
    public boolean login(String username, String password, int switchCase) throws IOException, ClassNotFoundException, SQLException
    {
        objectInputStream =new ObjectInputStream(inputStream);
        switch (switchCase)
        {
                case 0://BM
                    datas = new Pair<>(new Pair<>(username,password),2);
                    objectOutputStream.writeObject(datas);
                    objectOutputStream.flush();
                    objectOutputStream.reset();
                    try {
                         businessManager =(BusinessManager) objectInputStream.readObject();
                         return true;
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                        return false;
                    }
                   
//                        businessManager = new BusinessManager(username,password,rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7));
//                        businessManager.setManagedRestaurant(new Restaurant(rs.getInt(9),rs.getString(10),rs.getString(11),rs.getString(12),rs.getInt(13)));
//                        businessManager.setManagerID(rs.getInt(1));
                case 1://Guest
                    datas = new Pair<>(new Pair<>(username,password),3);
                    objectOutputStream.writeObject(datas);
                    objectOutputStream.flush();
                    objectOutputStream.reset();
                    try {
                        guest =(Guest) objectInputStream.readObject();
                        return true;
                    } catch (Exception e) {
                        e.getMessage();
                        return false;
                    }
                case 2://Courier
                    datas = new Pair<>(new Pair<>(username,password),4);
                    objectOutputStream.writeObject(datas);
                    objectOutputStream.flush();
                    objectOutputStream.reset();
                    return objectInputStream.readBoolean();
                default:
                    return false;
        }
    }
    
    
    public static void main(String[] args) throws IOException{
        try{      
        Socket socket=new Socket("localhost",7777);  
        System.out.println("Connected!");
        OutputStream outputStream = socket.getOutputStream();
        objectOutputStream= new ObjectOutputStream(outputStream);
        inputStream = socket.getInputStream(); 
        }catch(Exception e)
        {
            System.out.println(e);
        }  
        login = new Login();
        login.setVisible(true);
        
//            {
//            case 0:
//                NoRegistrationGuest nrg = new NoRegistrationGuest();
//                nrg = nrg.Registration();
//                objectOutputStream.writeObject(nrg);
//                break;
//            case 1:
//                System.out.println("How would you like to registrate?\n 0 - as Business Manager\n 1 - as Courier\n 2 - as a Guest");
//                int decisionInputForRegistration = input.nextInt();        
//                switch(decisionInputForRegistration)        
//                    {
//                    case 0:
//                        
//                        break;                
//                    case 1:  
//                        Courier c = new Courier();
//                        c = c.Registration("asd");
//                        objectOutputStream.writeObject(new Courier());
//                        break;       
//                    case 2:
//                        input.nextLine();
//                        Guest g = new Guest();
//                        usedUsername = true;
//                        username = null;
//                        while(usedUsername)
//                        {
//                            System.out.println("Enter username: ");
//                            username = input.nextLine();
//                            datas = new Pair<>(username,6);
//                            objectOutputStream.writeObject(datas);
//                            objectOutputStream.flush();
//                            usedUsername=objectInputStream.readBoolean();
//                            if(usedUsername)
//                            {
//
//                                    System.out.println("Oops! Looks like your entered username is taken, please enter another! :");
//                            }
//                        }
//                        g =g.Registration(username);
//                        objectOutputStream.writeObject(g);
//                        break;
//                        }    
//                break; 
//            case 2:
//                System.out.println("How would you like to login? \n 0 - as Business Manager\n 1 - as Courier\n 2 - as a Guest");
//                int decisionInputForLogin = input.nextInt();
//                switch(decisionInputForLogin)
//                {
//                    case 0:
//                        BusinessManager bm = new BusinessManager();
//                        bm =bm.Login();
//                        break;
//                    case 1:
//                        Courier c = new Courier();
//                        c = c.Login();
//                        break;
//                    case 2: 
//                        Guest g = new Guest();
//                        g = g.Login();
//                        break;
//                }
//                break;
//                
            }
//                    try {
//                sleep(2000);
//            } catch (InterruptedException ex) {
//                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
//            }
//    }
    
}
