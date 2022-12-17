package labs_examples.objects_classes_methods.labs.objects;

public class Airplane {

    // instance variables
    private String model;
    private PlaneEngine engine;
    private double fuelCapacity;
    private double currentFuelLevel;
    private int passengerCapacity;
    private String[] passengerList = {};
    private Passenger bookedPassengers = new Passenger(passengerList.length, passengerList);
    private String[] staffList = {};
    private Staff bookedStaff = new Staff(staffList.length, staffList) {};

    // getter setter methods
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public PlaneEngine getEngine() {
        return engine;
    }

    public void setEngine(PlaneEngine engine) {
        this.engine = engine;
    }

    public double getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(double fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public double getCurrentFuelLevel() {
        return currentFuelLevel;
    }

    public void setCurrentFuelLevel(double currentFuelLevel) {
        this.currentFuelLevel = currentFuelLevel;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    public String[] getPassengerList() {
        return passengerList;
    }

    public void setPassengerList(String[] passengerList) {
        this.passengerList = passengerList;
    }

    public Passenger getBookedPassengers() {
        return bookedPassengers;
    }

    public void setBookedPassengers(Passenger bookedPassengers) {
        this.bookedPassengers = bookedPassengers;
    }

    public String[] getStaffList() {
        return staffList;
    }

    public void setStaffList(String[] staffList) {
        this.staffList = staffList;
    }

    public Staff getBookedStaff() {
        return bookedStaff;
    }

    public void setBookedStaff(Staff bookedStaff) {
        this.bookedStaff = bookedStaff;
    }

    // constructor
    Airplane(String model,
             PlaneEngine engine,
             double fuelCapacity,
             double currentFuelLevel,
             int passengerCapacity,
             Passenger bookedPassengers,
             Staff bookedStaff) {
        this.model = model;
        this.engine = engine;
        this.fuelCapacity = fuelCapacity;
        this.currentFuelLevel = currentFuelLevel;
        this.passengerCapacity = passengerCapacity;
        this.bookedPassengers = bookedPassengers;
        this.bookedStaff = bookedStaff;
    }

    // toString
    @Override
    public String toString() {
        return "Airplane{" +
                "\nmodel='" + model + '\'' +
                ", \nengine=" + engine +
                ", \nfuelCapacity=" + fuelCapacity +
                ", \ncurrentFuelLevel=" + currentFuelLevel +
                ", \npassengerCapacity=" + passengerCapacity +
                ", \nbookedPassengers=" + bookedPassengers +
                ", \nbookedStaff=" + bookedStaff +
                '}';
    }
}
