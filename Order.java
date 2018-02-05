/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fastfoodcore;

import java.util.*;

/**
 *
 * @author rexle_000
 */
public class Order {
    
    
   
   
    private static int lastOrderNumber; 
    private final String orderNumber;
    
   private final Collection<Meal> meals; 
   private final Collection<Drink> drinks; 
    
    Order(String anOrderNumber)
    {
     lastOrderNumber++;
        orderNumber = "Order" + lastOrderNumber;
      meals = new HashSet<>();
      drinks = new HashSet<>();   
   
         
  
      
    }

    

    public String getOrderNumber() {
        return orderNumber;
    }

    public Collection<Meal> getMeals() {
        return meals;
    }

    public Collection<Drink> getDrinks() {
        return drinks;
    }

    @Override
    public String toString() {
        return "Order{" + "orderNumber=" + orderNumber + ", meals=" + meals + ", drinks=" + drinks + '}';
    }
    
    
}
