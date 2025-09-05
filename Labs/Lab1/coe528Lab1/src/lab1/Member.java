/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1;

/**
 *
 * @author kevinbhawan
 */
public class Member extends Passenger {
    
    private int yearsOfMembership;

    public Member(String name, int age, int yearsOfMembership) {
        super(name, age);
        this.yearsOfMembership = yearsOfMembership;
    }

    public int getYearsOfMembership() {
        return yearsOfMembership;
    }

    public void setYearsOfMembership(int yearsOfMembership) {
        this.yearsOfMembership = yearsOfMembership;
    }
    
    
    public double applyDiscount(double p) {
        
        double discount = 0;
        
        if (yearsOfMembership > 5) {
           discount = 0.50;
        }
        
        else if (yearsOfMembership > 1 && yearsOfMembership <= 5) {
            discount = 0.10;
        }
        
        return p * (1 - discount);
    }
    
}
