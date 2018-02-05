# Fast-Food-System
GUI
package fastfoodgui;
import fastfoodcore.*;
import java.util.Collection;

/**
 *
 * @author rexle_000
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
    
    
