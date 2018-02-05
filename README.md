# Fast-Food-System
GUI
package fastfoodgui;
import fastfoodcore.*;
import java.util.Collection;

/**
 *
 * @author Leman Rex
 */
public class FastFoodGUI extends javax.swing.JFrame {
    
    private FastFoodCoord fastFood;

    /** Creates new form FastFoodGUI */
    public FastFoodGUI() {
        initComponents();
        fastFood = new FastFoodCoord();
        Collection<Meal> meals = fastFood.getMeals();
       addMeal.setListData(meals);
       
       Collection<Drink> drinks = fastFood.getDrinks();
       addDrink.setListData(drinks);
       
       Collection<Order>orders = fastFood.getOrders();
       viewOrders.setListData(orders);
        
    }
    
    
    private void displayMeals()
   {
      
      Collection<Meal>meals = fastFood.getMeals();
      addMeal.setListData(meals);
      addMeal.setSelectedIndex(0);      
      
   }
    
   private void displayDrinks()
   {
      
      Collection<Drink>drinks = fastFood.getDrinks();
      addDrink.setListData(drinks);
      addDrink.setSelectedIndex(0);      
      
   } 
    
    
    
    
    
    
    
    
    
    

   

    private void addMealButtonActionPerformed(java.awt.event.ActionEvent evt) {                                              
String theName = enterMealTextField.getText();
        int thePrice = Integer.parseInt(enterPriceOfMealTextField.getText());
        fastFood.addMeal(theName, thePrice);
        Collection<Meal> meals = fastFood.getMeals();
        addMeal.setListData(meals);
        orderMeal.setListData(meals);
        enterMealTextField.setText(" ");
        enterPriceOfMealTextField.setText(" ");       
        
        
        
       
    }                                             

    private void addDrinkButtonActionPerformed(java.awt.event.ActionEvent evt) {                                               
        String theName = enterDrinkTextField.getText();
        int thePrice = Integer.parseInt(enterPriceOfDrinkTextField.getText());
        fastFood.addDrink(theName, thePrice);
        Collection<Drink> drinks = fastFood.getDrinks();
        addDrink.setListData(drinks);
        orderDrink.setListData(drinks);
        enterDrinkTextField.setText(" ");
        enterPriceOfDrinkTextField.setText(" "); 
    }                                              

    private void deleteMealButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                 
          Collection<Meal> meals = fastFood.getMeals();
        Meal theMeal = (Meal)addMeal.getSelectedValue();
        meals.remove(theMeal);
        addMeal.setListData(meals);
        orderMeal.setListData(meals);
    }                                                

    private void deleteDrinkButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        Collection<Drink> drinks = fastFood.getDrinks();
        Drink theDrink = (Drink)addDrink.getSelectedValue();
        drinks.remove(theDrink);
        addDrink.setListData(drinks);
        orderDrink.setListData(drinks);
    }                                                 

    private void orderButtonActionPerformed(java.awt.event.ActionEvent evt) {                                            

        
        
        
                 

               Drink aDrink = (Drink)orderDrink.getSelectedValue();
       
        Meal aMeal = (Meal)orderMeal.getSelectedValue(); 
        String anOrderNumber = null;
        
       
         Order anOrder = fastFood.addOrder(anOrderNumber);
      
      
      
        ordersTextArea.setText(aMeal.getName() +"\n"+ aDrink.getName());
                
       
        viewOrders.setListData(fastFood.getOrders());
       
        StringBuilder sb = new StringBuilder();
        sb.append(aMeal);
        sb.append(aDrink);
       
             
                               
         
                
          
    }                                      
