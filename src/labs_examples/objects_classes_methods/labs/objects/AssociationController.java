package labs_examples.objects_classes_methods.labs.objects;

public class AssociationController {
    public static void main(String[] args) {
        // car instance
        Stereo carStereo = new Stereo("Rockford Fossgate");
        Engine carEngine = new Engine(150);
        Car newCar = new Car(carEngine, carStereo, "Mitsubishi Lancer", "Black");
        // airplane instance
        String[] passengerList = {
                "Scott",
                "Mom",
                "Dad",
                "Sister",
                "Nephew One",
                "Nephew Two",
                "Brother in-law"
        };
        String[] staffList = {
                "Staff One",
                "Staff Two",
                "Staff Three",
                "Pilot One",
                "Pilot Two"
        };
        PlaneEngine airplaneEngine = new PlaneEngine(450, true, false);
        Passenger airplanePassengers = new Passenger(passengerList.length, passengerList);
        Staff airplaneStaff = new Staff(staffList.length, staffList);
        Airplane airplane = new Airplane("747", airplaneEngine, 63000, 63000, 416, airplanePassengers, airplaneStaff);

        System.out.println(airplane.getBookedPassengers().getPassengerList()[0] +
                " owns a " +
                newCar.color +
                " " +
                newCar.model);
    }
}
