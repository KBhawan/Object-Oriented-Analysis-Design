/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4;

/**
 *
 * @author kevinbhawan
 */
import java.util.ArrayList;
import java.util.List;
public class FoodCategory extends FoodComponent{
    
    private ArrayList<FoodComponent> components = new ArrayList<>();
    
    public FoodCategory(String name) {
        super(name);
    }
    
    public void add(FoodComponent fc) {
        components.add(fc);
    }
    
    public void remove(FoodComponent fc) {
        components.remove(fc);
    }
    
    @Override
    public double getPrice() {
        double total = 0;
        for (FoodComponent fc : components) {
            total = total + fc.getPrice();
        }
        
        return total;
    }
    
    public void print(int level) {
        for(int i = 0; i < level; i++) {
            System.out.print("     ");
        }
        System.out.println("FoodCategory (" + name + ", " + getPrice() + ") contains:");
        
        for (FoodComponent fc : components) {
            fc.print(level + 1);
        }
    }
 
}