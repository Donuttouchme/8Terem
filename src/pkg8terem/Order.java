/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg8terem;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author polga
 */
public class Order {
    
    private int orderID;
    private int batchID;
    private int courierID;
    private int guestID;
    private int noregistrationGuestID;
    private int subsum;
    private int mealID;
    private int quantity;
    private Map<Meal, Integer> mealsOrdered= new HashMap<Meal,Integer>();
    private int restaurantID;
    private Date orderDate;
    private Date estimatedDeliveryDate;
    private int paymentMethod;
    private boolean orderDone;
    private Date orderDoneDate;
    
    public Order()
    {
    }
    
    public Order(int _restaurantID,int _guestID, Map<Meal,Integer>_orderMap, int _paymentMethod)
    {
        this.restaurantID = _restaurantID;
        this.guestID = _guestID;
        this.mealsOrdered=_orderMap;
        this.paymentMethod = _paymentMethod;
    }
    
    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public int getBatchID() {
        return batchID;
    }

    public void setBatchID(int batchID) {
        this.batchID = batchID;
    }

    public int getCourierID() {
        return courierID;
    }

    public void setCourierID(int courierID) {
        this.courierID = courierID;
    }

    public int getGuestID() {
        return guestID;
    }

    public void setGuestID(int guestID) {
        this.guestID = guestID;
    }

    public int getNoregistrationGuestID() {
        return noregistrationGuestID;
    }

    public void setNoregistrationGuestID(int noregistrationGuestID) {
        this.noregistrationGuestID = noregistrationGuestID;
    }

    public int getSubsum() {
        return subsum;
    }

    public void setSubsum(int subsum) {
        this.subsum = subsum;
    }

    public int getMealID() {
        return mealID;
    }

    public void setMealID(int mealID) {
        this.mealID = mealID;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getRestaurantID() {
        return restaurantID;
    }

    public void setRestaurantID(int restaurantID) {
        this.restaurantID = restaurantID;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Date getEstimatedDeliveryDate() {
        return estimatedDeliveryDate;
    }

    public void setEstimatedDeliveryDate(Date estimatedDeliveryDate) {
        this.estimatedDeliveryDate = estimatedDeliveryDate;
    }

    public int getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(int paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public boolean isOrderDone() {
        return orderDone;
    }

    public void setOrderDone(boolean orderDone) {
        this.orderDone = orderDone;
    }

    public Date getOrderDoneDate() {
        return orderDoneDate;
    }

    public void setOrderDoneDate(Date orderDoneDate) {
        this.orderDoneDate = orderDoneDate;
    }
       public Map<Meal, Integer> getMealsOrdered() {
        return mealsOrdered;
    }

    public void setMealsOrdered(Map<Meal, Integer> mealsOrdered) {
        this.mealsOrdered = mealsOrdered;
    }
    
    
    
}
