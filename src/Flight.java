import java.util.Date;

public class Flight {
    private int flightNumber;
    private Date departureTime;
    private int flightDuration; // in minutes
    private String departingAirport;
    private String arrivingAirport;
    private Plane assignedPlane; // 0..1 relationship

    // Constructor
    public Flight(int flightNumber, Date departureTime, int flightDuration,
                  String departingAirport, String arrivingAirport) {
        this.flightNumber = flightNumber;
        this.departureTime = departureTime;
        this.flightDuration = flightDuration;
        this.departingAirport = departingAirport;
        this.arrivingAirport = arrivingAirport;
    }

    // Assign a plane (optional)
    public void assignPlane(Plane plane) {
        this.assignedPlane = plane;
    }

    public Plane getAssignedPlane() {
        return assignedPlane;
    }

    // Delay the flight
    public void delayFlight(int numberOfMinutes) {
        departureTime = new Date(departureTime.getTime() + numberOfMinutes * 60L * 1000L);
    }

    // Calculate arrival time
    public Date getArrivalTime() {
        return new Date(departureTime.getTime() + flightDuration * 60L * 1000L);
    }

    // Getters
    public int getFlightNumber() {
        return flightNumber;
    }

    public Date getDepartureTime() {
        return departureTime;
    }

    public int getFlightDuration() {
        return flightDuration;
    }

    public String getDepartingAirport() {
        return departingAirport;
    }

    public String getArrivingAirport() {
        return arrivingAirport;
    }
}