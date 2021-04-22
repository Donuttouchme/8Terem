/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg8terem;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.net.Socket;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
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
    public static Pair<Object,Integer> datas;
    public static BusinessManager businessManager;
    public static Guest guest;
    public static Courier courier;
    public static List<Restaurant> restaurants = new ArrayList<Restaurant>();
    public static Order orders = new Order();
    private static final long serialVersionUID = 6529685098267757691L;
    
    /**
     * @param args the command line arguments
     */
    
    public boolean registration(String username, String password, String fName, String lName,String corporationName,String email, int switchCase) throws IOException
    {
        if(objectInputStream==null)
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
                         return false;
                    }
                    return true;
                case 1://Guest
                    datas = new Pair<>(username,6);
                    objectOutputStream.writeObject(datas);
                    objectOutputStream.flush();
                    objectOutputStream.reset();
                    if(!objectInputStream.readBoolean())
                    {
                         objectOutputStream.writeObject(new Pair<>(new Guest(username,password,fName,lName,corporationName,email),1));
                         return false;
                    }
                    return true;
                case 2://Courier
                    datas = new Pair<>(username,7);
                    objectOutputStream.writeObject(datas);
                    objectOutputStream.flush();
                    objectOutputStream.reset();
                    if(!objectInputStream.readBoolean())
                    {
                        Courier cTemp = new Courier(username,password,fName,lName,corporationName,email);
                         objectOutputStream.writeObject(new Pair<>(cTemp,1));
                         return false;
                    }
                    return true;
                default:
                    return true;
        }                         
    }
    
    public boolean login(String username, String password, int switchCase) throws IOException, ClassNotFoundException, SQLException
    {
        if(objectInputStream==null)
        objectInputStream =new ObjectInputStream(inputStream);
        switch (switchCase)
        {
                case 0://BM
                    datas = new Pair<>(new Pair<>(username,password),2);
                    objectOutputStream.writeObject(datas);
                    objectOutputStream.flush();
                    objectOutputStream.reset();
                    try {
                        Object object = objectInputStream.readObject();
                        Pair pairObj=(Pair)object;                       
                        businessManager =(BusinessManager) pairObj.getKey();
                        orders=(Order)pairObj.getValue();
                        return true;
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                        return false;
                    }                  
                case 1://Guest
                    datas = new Pair<>(new Pair<>(username,password),3);
                    objectOutputStream.writeObject(datas);
                    objectOutputStream.flush();
                    objectOutputStream.reset();
                    try {
                        Object object=objectInputStream.readObject();
                        Pair pairObj=(Pair)object;                        
                        guest =(Guest) pairObj.getKey();
                        restaurants = (ArrayList)pairObj.getValue();
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
                    try {
                        courier = (Courier)objectInputStream.readObject();
                        return true;
                    } catch (Exception e) {
                        e.getMessage();
                        return false;
                    }
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
    }    
}
