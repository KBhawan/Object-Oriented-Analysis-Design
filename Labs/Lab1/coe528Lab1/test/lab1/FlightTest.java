/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package lab1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author kevinbhawan
 */
public class FlightTest {
    
    public FlightTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getFlightNumber method, of class Flight.
     */
    
    @Test
    public void testConstructor() throws Exception {
        int expectedFlightNumber = 1030;
        String expectedDepartureLocation = "Toronto";
        String expectedArrivalLocation = "Japan";
        String expectedDepartureTime  = "03/02/99 7:50 pm";
        int expectedCapacity = 300;
        double expectedPrice = 1000;
        Flight test = new Flight(expectedFlightNumber, expectedDepartureLocation, expectedArrivalLocation, expectedDepartureTime, expectedCapacity, expectedPrice );
       
        assertEquals(expectedFlightNumber, test.getFlightNumber());
        assertEquals(expectedDepartureLocation, test.getOrigin());
        assertEquals(expectedArrivalLocation, test.getDestination());
        assertEquals(expectedDepartureTime, test.getDepartureTime());
        assertEquals(expectedCapacity, test.getCapacity());
        assertEquals(expectedPrice, test.getOriginalPrice(), 0.01);
        
    }
    @Test(expected = IllegalArgumentException.class)
    public void testInvalidConstructor() {
        
        Flight anotherTest = new Flight(1030, "Toronto", "Toronto", "03/02/99 7:50 pm", 300, 1000);
        
    }
    
    
    @Test
    public void testGetFlightNumber() {
    Flight test = new Flight(1030, "Toronto", "Brampton", "03/02/99 7:50 pm", 300, 1000);
    int realFlightNumber = test.getFlightNumber();
    
    assertEquals(1030, realFlightNumber);

     
        
        
    }

    /**
     * Test of setFlightNumber method, of class Flight.
     */
    @Test
    public void testSetFlightNumber() {
    Flight test = new Flight(1030, "Toronto", "Brampton", "03/02/99 7:50 pm", 300, 1000);
    test.setFlightNumber(1000);
    
    assertEquals(1000, test.getFlightNumber());
    }

    /**
     * Test of getOrigin method, of class Flight.
     */
    @Test
    public void testGetOrigin() {
     Flight test = new Flight(1030, "Toronto", "Brampton", "03/02/99 7:50 pm", 300, 1000);
    String realOrigin = test.getOrigin();
    
    assertEquals("Toronto", realOrigin);
    }

    /**
     * Test of setOrigin method, of class Flight.
     */
    @Test
    public void testSetOrigin() {
    Flight test = new Flight(1030, "Toronto", "Brampton", "03/02/99 7:50 pm", 300, 1000);
    test.setOrigin("Japan");
    
    assertEquals("Japan", test.getOrigin());
    }

    /**
     * Test of getDestination method, of class Flight.
     */
    @Test
    public void testGetDestination() {
    Flight test = new Flight(1030, "Toronto", "Brampton", "03/02/99 7:50 pm", 300, 1000);
    String realDestination = test.getDestination();
    
    assertEquals("Brampton", realDestination);
    }

    /**
     * Test of setDestination method, of class Flight.
     */
    @Test
    public void testSetDestination() {
    Flight test = new Flight(1030, "Toronto", "Brampton", "03/02/99 7:50 pm", 300, 1000);
    test.setDestination("Los Angeles");
    
    assertEquals("Los Angeles", test.getDestination());
    }

    /**
     * Test of getDepartureTime method, of class Flight.
     */
    @Test
    public void testGetDepartureTime() {
    Flight test = new Flight(1030, "Toronto", "Brampton", "03/02/99 7:50 pm", 300, 1000);
    String realDepartureTime = test.getDepartureTime();
    
    assertEquals("03/02/99 7:50 pm", realDepartureTime);
    }

    /**
     * Test of setDepartureTime method, of class Flight.
     */
    @Test
    public void testSetDepartureTime() {
    Flight test = new Flight(1030, "Toronto", "Brampton", "03/02/99 7:50 pm", 300, 1000);
    test.setDepartureTime("01/01/19 8:00 pm");
    
    assertEquals("01/01/19 8:00 pm", test.getDepartureTime());
    }

    /**
     * Test of getCapacity method, of class Flight.
     */
    @Test
    public void testGetCapacity() {
    Flight test = new Flight(1030, "Toronto", "Brampton", "03/02/99 7:50 pm", 300, 1000);
    int realCapacity = test.getCapacity();
    
    assertEquals(300, realCapacity);
    }

    /**
     * Test of setCapacity method, of class Flight.
     */
    @Test
    public void testSetCapacity() {
    Flight test = new Flight(1030, "Toronto", "Brampton", "03/02/99 7:50 pm", 300, 1000);
    test.setCapacity(5000);
    
    assertEquals(5000, test.getCapacity());
    }

    /**
     * Test of getNumberOfSeatsLeft method, of class Flight.
     */
    @Test
    public void testGetNumberOfSeatsLeft() {
    Flight test = new Flight(1030, "Toronto", "Brampton", "03/02/99 7:50 pm", 300, 1000);
    int realNumberOfSeatsLeft = test.getNumberOfSeatsLeft();
    
    assertEquals(300, realNumberOfSeatsLeft);
    }

    /**
     * Test of setNumberOfSeatsLeft method, of class Flight.
     */
    @Test
    public void testSetNumberOfSeatsLeft() {
    Flight test = new Flight(1030, "Toronto", "Brampton", "03/02/99 7:50 pm", 300, 1000);
    test.setNumberOfSeatsLeft(1000);
    
    assertEquals(1000, test.getNumberOfSeatsLeft());
    }

    /**
     * Test of getOriginalPrice method, of class Flight.
     */
    @Test
    public void testGetOriginalPrice() {
    Flight test = new Flight(1030, "Toronto", "Brampton", "03/02/99 7:50 pm", 300, 1000);
    double realOriginalPrice = test.getOriginalPrice();
    
    assertEquals(1000, realOriginalPrice, 0.01);
    }

    /**
     * Test of setOriginalPrice method, of class Flight.
     */
    @Test
    public void testSetOriginalPrice() {
    Flight test = new Flight(1030, "Toronto", "Brampton", "03/02/99 7:50 pm", 300, 1000);
    test.setOriginalPrice(1250);
    
    assertEquals(1250, test.getOriginalPrice(), 0.01);
    }

    /**
     * Test of bookASeat method, of class Flight.
     */
    @Test
    public void testBookASeat() {
     Flight test = new Flight(1030, "Toronto", "Brampton", "03/02/99 7:50 pm", 300, 1000);
    test.bookASeat();
    
    assertTrue(test.bookASeat());
    }
    @Test
    public void testanInvalidBookASeat() {
     Flight test = new Flight(1030, "Toronto", "Brampton", "03/02/99 7:50 pm", 0, 1000);
    test.bookASeat();
    
    assertFalse(test.bookASeat());
    }

    /**
     * Test of toString method, of class Flight.
     */
    @Test
    public void testToString() {
    Flight test = new Flight(1030, "Toronto", "Brampton", "03/02/99 7:50 pm", 300, 1000);
    assertEquals("Flight 1030, Toronto to Brampton, 03/02/99 7:50 pm, original price: 1000.0$", test.toString());

    }
    
}
