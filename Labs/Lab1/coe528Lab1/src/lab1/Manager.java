/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1;
import java.util.Scanner;
import java.util.ArrayList;


/**
 *
 * @author kevinbhawan
 */
public class Manager {
    
    private ArrayList<Flight> flights;
    public ArrayList<Ticket> tickets;
    
    Scanner scanner = new Scanner(System.in);
    
    
    
    public Manager() {
        this.flights = new ArrayList<>();
        this.tickets = new ArrayList<>();
    }
    
    public Manager(ArrayList<Flight> flights) {
        this.flights = flights;
        this.tickets = new ArrayList<>();
    }
    
    public void createFlights() {
        
        while (true) {
        
        System.out.println("Flight number: ");
        String flightNum = scanner.nextLine();
        int flightNumber = Integer.valueOf(flightNum);
        
        System.out.println("Origin: ");
        String origin = scanner.nextLine();
        
        System.out.println("Destination: ");
        String destination = scanner.nextLine();
        
        System.out.println("Departure Time: ");
        String departureTime = scanner.nextLine();
        
        System.out.println("Capacity: ");
        String cap = scanner.nextLine();
        int capacity = Integer.valueOf(cap);
        
        System.out.println("Original Price: ");
        String pri = scanner.nextLine();
        double price = Double.valueOf(pri);
        
        Flight fly = new Flight(flightNumber, origin, destination, departureTime, capacity, price);
        
        flights.add(fly);
        
            System.out.println("Flight added! Continue? (yes/no)");
            
            String answer = scanner.nextLine();
            if (answer.equalsIgnoreCase("no")) {
                break;
            }
        
        
    }
    
    
    
}
    
    public void displayAvailableFlights(String origin, String destination) {
        
        for (Flight var : flights) {
            if (var.getOrigin().equals(origin) && var.getDestination().equals(destination)) {
                if (var.getNumberOfSeatsLeft() > 0) {
                    System.out.println(var);
                }
            }
        }
            
        
    }
    
    public Flight getFlight(int flightNumber) {
        for (Flight var : flights) {
            if (var.getFlightNumber() == flightNumber) {
                return var;
            }
        }
        
        return null;
    }
    
    public void bookSeat(int flightNumber, Passenger p) {
        for (Flight var : flights) {
            if (var.getFlightNumber() == flightNumber) {
                if (var.getNumberOfSeatsLeft() > 0) {
                
                if (var.bookASeat()) {
                    tickets.add(new Ticket(p, var, p.applyDiscount(var.getOriginalPrice())));
                }
            }
                else {
                System.out.println("Booking Failed");

        }
                        }
        
    }
        
}
    public static void main(String[] args) {
        
        ArrayList<Flight> flights = new ArrayList<>(); // creates a new arraylist for the flights


        Passenger[] passengers = {
            new Member("Kevin", 19, 6),
            new Member("LeBron", 40, 4),
            new Member("Cena", 48, 0),
            new Member("Durant", 27, 0),
            new NonMember("Tejveer", 19),
            new NonMember("Bronny", 66)
        }; // creates an array of all passengers, including members and nonmembers
        
        Flight flight1 = new Flight(1000, "Toronto", "Japan", "8am", 2, 100);
        Flight flight2 = new Flight(1001, "Toronto", "Japan", "2pm", 5, 200);


        flights.add(flight1); // creates flights first flight: 1000, Toronto, Japan, 8am, 2, 100
        flights.add(flight2); // second flight: 1001, Toronto, Japan, 2pm, 5, 200
        
        Manager manager = new Manager(flights); // creates a new manager to manage all the flights


        manager.displayAvailableFlights("Toronto", "Japan");

        manager.bookSeat(1000, passengers[0]); // books seats dependent on flight number, origin, destination & capacity
        System.out.println(manager.tickets.get(0).toString()); // 50% off will be applied

        manager.bookSeat(1000, passengers[1]);
        System.out.println((manager.tickets.get(1).toString())); // 10% off will be applied

        //manager.bookSeat(1000, passengers[2]);
        //System.out.println( manager.tickets.get(2).toString());  // this will fail dependent on the fact the first capacity is only 2

        manager.bookSeat(1001, passengers[2]);
        System.out.println(manager.tickets.get(2).toString()); // no discounts since 0 years of membership and not of age even though is a member

        manager.bookSeat(1001, passengers[4]);
        System.out.println(manager.tickets.get(3).toString()); // no discounts since a non member and not 65+ in age

        manager.bookSeat(1001, passengers[5]);
        System.out.println(manager.tickets.get(4).toString()); // non-member but since 65+ 10% off will be applied

        manager.displayAvailableFlights("Toronto", "Japan"); // will list the second flight since the first flight is at its capacity
    }
}


    
