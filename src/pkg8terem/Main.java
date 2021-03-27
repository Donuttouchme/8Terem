/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg8terem;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author polga
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        ObjectOutputStream objectOutputStream = null;
        try{      
        Socket socket=new Socket("localhost",7777);  
        System.out.println("Connected!");
        OutputStream outputStream = socket.getOutputStream();
         objectOutputStream= new ObjectOutputStream(outputStream);
        }catch(Exception e)
        {
            System.out.println(e);
        }  
                // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Would you like to registrate? \n 1- if yes\n 0- if no \n 2 - to login");
        int decisionInput =input.nextInt();

        switch (decisionInput)
            {
            case 0:
                NoRegistrationGuest nrg = null;
                nrg = nrg.Registration();
                objectOutputStream.writeObject(nrg);
                break;
            case 1:
                System.out.println("How would you like to registrate?\n 0 - as Business Manager\n 1 - as Courier\n 2 - as a Guest");
                int decisionInputForRegistration = input.nextInt();        
                switch(decisionInputForRegistration)        
                    {
                    case 0:
                        BusinessManager bm =null;
                        bm.Registration();
                        String tempUsername = bm.getUsername();
                        String tempPwd = bm.getPassword();
                        String tempFName = bm.getFirstName();
                        String tempLName = bm.getLastName();
                        String tempCName = bm.getCorporationName();
                        String registrationDate = bm.getRegistrationDate();
                        bm = new BusinessManager(tempUsername, tempPwd, tempCName, tempCName, registrationDate, tempPwd, registrationDate);
                        objectOutputStream.writeObject(bm);        
                        break;        
                    case 1:  
                        
                        break;       
                    case 2:
                        
                        break;
                        }    
                break; 
            case 2:
                System.out.println("How would you like to login? \n 0 - as Business Manager\n 1 - as Courier\n 2 - as a Guest");
                int decisionInputForLogin = input.nextInt();
                switch(decisionInputForLogin)
                {
                    case 0:
                        BusinessManager bm = null;
                        bm.Login();
                        break;
                }
                break;
                
            }    
    }
    
}
