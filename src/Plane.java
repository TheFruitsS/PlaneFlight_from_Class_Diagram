public class Plane {
    private String airPlaneType;
    private int maximumSpeed;     // in MPH
    private int maximumDistance;  // in Miles
    private String tailId;

    // Constructor
    public Plane(String airPlaneType, int maximumSpeed, int maximumDistance, String tailId) {
        this.airPlaneType = airPlaneType;
        this.maximumSpeed = maximumSpeed;
        this.maximumDistance = maximumDistance;
        this.tailId = tailId;
    }

    // Getters
    public String getAirPlaneType() {
        return airPlaneType;
    }

    public int getMaximumSpeed() {
        return maximumSpeed;
    }

    public int getMaximumDistance() {
        return maximumDistance;
    }

    public String getTailId() {
        return tailId;
    }
}