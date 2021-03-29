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
import static java.lang.Thread.sleep;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.util.Pair;

/**
 *
 * @author polga
 */
public class Main {
    static Login login = null;
    static Scanner input = new Scanner(System.in);
    static ObjectOutputStream objectOutputStream = null;
    static ObjectInputStream objectInputStream = null;
    static InputStream inputStream = null;
    static Pair<Object,Integer> datas;
    /**
     * @param args the command line arguments
     */
    
    boolean registration(String username, String password, String fName, String lName,String corporationName,String email) throws IOException
    {
        BusinessManager bm =new BusinessManager();
        objectInputStream = new ObjectInputStream(inputStream);
        boolean usedUsername;
        datas = new Pair<>(username,5);
        objectOutputStream.writeObject(datas);
        objectOutputStream.flush();
        usedUsername=objectInputStream.readBoolean();
        if(!usedUsername)
        {
            objectOutputStream.writeObject(new Pair<>(bm,1)); 
        }
        return usedUsername; 
                                
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
