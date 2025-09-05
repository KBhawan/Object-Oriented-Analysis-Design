/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1;

/**
 *
 * @author kevinbhawan
 */
public class Ticket {
    
    private Passenger passenger;
    private Flight flight;
    private double price;
    private static int ticketCount = 0;
    
    public Ticket(Passenger p, Flight flight, double price) {
        this.passenger = p;
        this.flight = flight;
        this.price = price;
        this.ticketCount = this.ticketCount + 1;


    
}

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static int getTicketCount() {
        return ticketCount;
    }

    public static void setTicketCount(int ticketCount) {
        Ticket.ticketCount = ticketCount;
    }
    
    @Override
    public String toString() {
        
        return passenger.getName() + ", " + flight.toString() + ", ticket price: " + this.price + "$";
        
        
        
    }
    
    





}

