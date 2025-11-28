import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Plane plane = new Plane("Boeing 737", 600, 3000, "G-ABCD");

        Flight flight = new Flight(101, new Date(), 120, "Heathrow", "Edinburgh");
        flight.assignPlane(plane);

        System.out.println("Flight " + flight.getFlightNumber() + " departs from " +
                flight.getDepartingAirport() + " to " + flight.getArrivingAirport());
        System.out.println("Departure: " + flight.getDepartureTime());
        System.out.println("Arrival: " + flight.getArrivalTime());
        System.out.println("Assigned Plane: " + flight.getAssignedPlane().getTailId());

        flight.delayFlight(30);
        System.out.println("New Departure: " + flight.getDepartureTime());
        System.out.println("New Arrival: " + flight.getArrivalTime());
    }
}