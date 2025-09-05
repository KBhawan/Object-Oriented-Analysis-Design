/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1;

/**
 *
 * @author kevinbhawan
 */
public class NonMember extends Passenger {

    public NonMember(String name, int age) {
        super(name, age);
        
    }
    
    public double applyDiscount(double p) {
        
        
        double discount = 0;
        if (age > 65) {
            discount = 0.10;
        }
        
        return p * (1 - discount);
    }
    
    
    
}
