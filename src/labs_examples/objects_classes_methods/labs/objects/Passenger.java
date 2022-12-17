package labs_examples.objects_classes_methods.labs.objects;

import java.util.Arrays;

public class Passenger {

    // instance variables
    private int bookedSeats;
    private String[] passengerList;

    // getter setter methods
    public int getBookedSeats() {
        return bookedSeats;
    }

    public void setBookedSeats(int bookedSeats) {
        this.bookedSeats = bookedSeats;
    }

    public String[] getPassengerList() {
        return passengerList;
    }

    public void setPassengerList(String[] passengerList) {
        this.passengerList = passengerList;
    }

    // constructor
    Passenger(int bookedSeats, String[] passengerList){
        this.bookedSeats = bookedSeats;
        this.passengerList = passengerList;
    }

    // toString

    @Override
    public String toString() {
        return "Passenger{" +
                "\nbookedSeats=" + bookedSeats +
                ", \npassengerList=" + Arrays.toString(passengerList) +
                '}';
    }
}
