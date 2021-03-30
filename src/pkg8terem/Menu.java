/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg8terem;

import java.io.IOException;
import java.io.Serializable;
import java.util.List;
import java.util.Scanner;
import javafx.util.Pair;
import static pkg8terem.Main.*;

/**
 *
 * @author polga
 */
public class Menu implements Serializable{
    private int id;
    private int restaurantID;
    private List<Meal> meals;
    static Scanner input = new Scanner(System.in);
    
    public Menu(List<Meal> _meals)
    {
        this.meals=_meals;
    }


    List<Meal> getMenu()
    {
        return meals;
    }
     public void addMealToMenu(String mealName, int mealPrice,String mealIngredients,String mealAllergens) throws IOException {
            datas = new Pair<>(new Meal(mealName,mealPrice,mealIngredients,mealAllergens),1);
            meals.add(new Meal(mealName,mealPrice,mealIngredients,mealAllergens));
            objectOutputStream.writeObject(datas);
        }
     
     public void listMenu()
    {
        
    }
     
     
    public int getRestaurantID() {
        return restaurantID;
    }

    public void setRestaurantID(int restaurantID) {
        this.restaurantID = restaurantID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Meal> getMeals() {
        return meals;
    }

    public void setMeals(List<Meal> meals) {
        this.meals = meals;
    }
} 