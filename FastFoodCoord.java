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
public class FastFoodCoord {
    
    private final Collection<Meal> meals;
    private final Collection<Drink> drinks;
    private final Collection<Order> orders;
    public FastFoodCoord()
    {
        meals = new HashSet<>();
        drinks = new HashSet<>();
        orders = new HashSet<>();
    }
    
    public Collection<Meal> getMeals()
{
    return meals;
}
    
    public Collection<Drink> getDrinks()
{
    return drinks;
}
   
    
     public Collection<Order> getOrders()
{
    return orders;
}
    
    public Meal addMeal(String aName, int aPrice)
   {
      Meal theMeal = new Meal(aName, aPrice);
      meals.add(theMeal);
      return theMeal;
   }

   public Drink addDrink(String aName, int aPrice)
   {
      Drink theDrink = new Drink(aName, aPrice);
      drinks.add(theDrink);
      return theDrink;
   }  
 
   public Order addOrder(String anOrderNumber)
   {
      
       Order theOrder = new Order(anOrderNumber);
      orders.add(theOrder);
      return theOrder;
}

    public Collection<?> getOrderNumber() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
}
