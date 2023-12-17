import java.util.ArrayList;
import java.util.List;

public class RiderService {
    private List<Driver> drivers;
    private List<Passenger> passengers;
    public RiderService(){
        this.drivers = new ArrayList<>();
        this.passengers = new ArrayList<>();
    }
    public void addDriver(Driver driver) {
        this.drivers.add(driver);
    }
    public void addPassenger(Passenger passenger) {
        this.passengers.add(passenger);
    }
    public void assignRide(Passenger passanger, String destination){
        for(Driver driver : drivers){
            if(driver.getIsAvailable()){
                System.out.println("Assigning " +driver.getName() + " to drive " + passanger.getName()+ " to "+ destination);
                driver.setIsAvailable(false);
                return;
            }
        }
        System.out.println("No drivers available at the moment");
    }
}
