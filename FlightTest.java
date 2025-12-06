import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class FlightTest {

    @Test
    void testAvailableSeat(){
        Flight f=new Flight("F101","10.30","Colombo",1000);
        assertEquals(1000,f.getPrice());
    }

    @Test
    void testBookSeat(){
        Flight f=new Flight("F0003","Tokyo","Seoul",1);
        assertEquals("Seoul",f.getDestination());
    }
    @Test
    void testPassengerInfo(){
        Passenger p=new Passenger("Pasindu","p001","1234");
        assertEquals("p001",p.getID());
        assertEquals("Pasindu",p.getName());

    }
    @Test
    void testReservationCreation(){
        Passenger p=new Passenger("pasindu","p001","1234");
        Flight f=new Flight("F001","10.00","Kandy",1000);

        assertEquals("1234",p.getPassportNumber());



    }


}
