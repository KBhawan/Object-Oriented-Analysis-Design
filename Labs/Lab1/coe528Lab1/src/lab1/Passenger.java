/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1;

/**
 *
 * @author kevinbhawan
 */
public abstract class Passenger {
    private String name;
    public int age;
    
    public Passenger(String name, int age) {
        this.name = name;
        this.age = age;
               
    }
    
    public abstract double applyDiscount(double p);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    
    
}
