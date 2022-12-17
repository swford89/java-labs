package labs_examples.objects_classes_methods.labs.objects;

public class AirplaneExample {
    public static void main(String[] args) {
        String[] passengerList = {
                "Scott Ford",
                "Bob Builder",
                "Nick Fury",
                "Peter Parker",
                "Tony Stark",
                "Thanos",
                "Chris Evans",
                "Scarlett Johansson",
                "Brie Larson",
                "Zendaya",
                "Scarlett Witch"
        };
        Passenger passengers = new Passenger(passengerList.length, passengerList);
        String[] staffList = {
                "Loki",
                "Gamora",
                "Drax",
                "Rocket"
        };
        Staff staff = new Staff(staffList.length, staffList);
        PlaneEngine engine = new PlaneEngine(400, true, true);
        Airplane airplane = new Airplane("747", engine,63000,63000, 416, passengers, staff);

        String[] differentPassengerList = {
                "Henry",
                "George",
                "Tom",
                "Anna",
                "Britney",
                "Sarah",
                "Allie",
                "Krystal",
                "Harold",
                "Wilma",
                "Rose"
        };
        Passenger differentPassengers = new Passenger(differentPassengerList.length, differentPassengerList);
        airplane.setBookedPassengers(differentPassengers);
        System.out.println(airplane.getBookedPassengers() + "\n");

        System.out.println(engine.toString() + "\n");
        System.out.println(staff.toString() + "\n");
        System.out.println(passengers.toString() + "\n");
        System.out.println(airplane.toString());
    }
}