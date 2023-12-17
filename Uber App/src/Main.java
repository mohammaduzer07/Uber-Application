public class Main {
    public static void main(String[] args) {
        RiderService riderService = new RiderService();
        Driver driver = new Driver("Elon Musk", "Mumbai", true);
        Passenger passenger = new Passenger("Uzer", "Mars", riderService);
        Vehicle vehicle = new Vehicle("Buggati chiron", "Ind-MH-2023");

        // add driver
        riderService.addDriver(driver);
        // add passeneger to ride
        riderService.addPassenger(passenger);
        // assign vehicle to driver
        driver.setVehicle(vehicle);

        //request a ride
        passenger.requestRide("India Gate ");
    }
}