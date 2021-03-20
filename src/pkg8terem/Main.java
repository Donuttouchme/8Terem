/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg8terem;

import java.io.DataOutputStream;
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
    public static void main(String[] args) {
        try{      
Socket s=new Socket("localhost",6666);  
DataOutputStream dout=new DataOutputStream(s.getOutputStream());  
dout.writeUTF("Hello Server");  
dout.flush();  
dout.close();  
s.close();  
}catch(Exception e){System.out.println(e);}  
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Would you like to registrate? 0- if yes\n 1- if no \n 2 - to login");
        int decisionInput =input.nextInt();
        
        switch (decisionInput)
        {
            case 0:
                System.out.println("How would you like to registrate?\n 0 - as Business Manager\n 1 - as Courier\n 2 - as a Guest");
                int decisionInput2 = input.nextInt();
                switch(decisionInput2)
                {
                    case 0:
                        BusinessManager bm = new BusinessManager();
                        bm.Registration();
                        break;
                }
                break;
        }
    }
    
}
