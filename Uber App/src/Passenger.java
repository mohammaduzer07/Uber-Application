public class Passenger extends User{
    private RiderService riderService;
    public Passenger(String name, String location, RiderService rideService){
        super(name, location);
        this.riderService = rideService;
    }
    public void requestRide(String destination){
        System.out.println(this.getName() + " requested a ride to " + destination);
        riderService.assignRide(this, destination);
    }

}
