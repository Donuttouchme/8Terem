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
    
     static Scanner input = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        ObjectOutputStream objectOutputStream = null;
        ObjectInputStream objectInputStream = null;
        InputStream inputStream = null;
        Pair<Object,Integer> datas;
        
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
                // TODO code application logic here
        System.out.println("Would you like to registrate? \n 1- if yes\n 0- if no \n 2 - to login");
        int decisionInput =input.nextInt();

        switch (decisionInput)
            {
            case 0:
                NoRegistrationGuest nrg = new NoRegistrationGuest();
                nrg = nrg.Registration();
                objectOutputStream.writeObject(nrg);
                break;
            case 1:
                System.out.println("How would you like to registrate?\n 0 - as Business Manager\n 1 - as Courier\n 2 - as a Guest");
                int decisionInputForRegistration = input.nextInt();        
                switch(decisionInputForRegistration)        
                    {
                    case 0:
                        input.nextLine();
                        BusinessManager bm =new BusinessManager();
                        boolean usedUsername = true;
                        String username=null;
                        objectInputStream = new ObjectInputStream(inputStream);
                        while(usedUsername){
                        System.out.println("Enter username: ");                     //USERNAME
                            username = input.nextLine();
                        datas = new Pair<>(username,5);
                        objectOutputStream.writeObject(datas);
                        objectOutputStream.flush();
                           
                        usedUsername=objectInputStream.readBoolean();
                            System.out.println("saaajt");
                        if(usedUsername)
                        {
                               
                                System.out.println("Oops! Looks like your entered username is taken, please enter another! :");
                        }
                        }
                        bm = bm.Registration();                        
                        objectOutputStream.writeObject(new BusinessManager(username,bm.getPassword(),bm.getFirstName(),bm.getLastName(),bm.getCorporationName(),bm.getEmail(),bm.getRegistrationDate()));      
                        break;                
                    case 1:  
                        Courier c = new Courier();
                        c = c.Registration();
                        objectOutputStream.writeObject(new Guest());
                        break;       
                    case 2:
                        Guest g = new Guest();
                        g =g.Registration();
                        objectOutputStream.writeObject(new Guest(g.getUsername(),g.getPassword(),g.getFirstName(),g.getLastName(),g.getGuestAddress(),g.getPhoneNumber(),g.getRegistrationDate()));
                        break;
                        }    
                break; 
            case 2:
                System.out.println("How would you like to login? \n 0 - as Business Manager\n 1 - as Courier\n 2 - as a Guest");
                int decisionInputForLogin = input.nextInt();
                switch(decisionInputForLogin)
                {
                    case 0:
                        BusinessManager bm = new BusinessManager();
                        bm =bm.Login();
                        break;
                    case 1:
                        Courier c = new Courier();
                        c = c.Login();
                        break;
                    case 2: 
                        Guest g = new Guest();
                        g = g.Login();
                        break;
                }
                break;
                
            }
                    try {
                sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    
}
