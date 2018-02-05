/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fastfoodcore;

/**
 *
 * @author rexle_000
 */
public class Meal {
    
     private final String name;  
      private final int price;
      
      Meal (String aName, int aPrice)
      {
          name = aName;
          price = aPrice;
      }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

 
    
    @Override
    public String toString() {
        return name + " -   £ " + price;        
          
    }
      
      
    
}
