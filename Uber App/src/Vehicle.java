public class Vehicle {
    private String model;
    private String licensePlate;
    public Vehicle(String model, String licensePlate){
        this.model = model;
        this.licensePlate = licensePlate;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getModel() {
        return model;
    }
    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }
    public String getLicensePlate() {
        return licensePlate;
    }
}
