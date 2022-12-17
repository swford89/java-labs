package labs_examples.objects_classes_methods.labs.objects;

import java.util.Arrays;

public class Staff {

    // instance variables
    private int staffCount;
    private String[] staffList;

    // getter setter methods
    public int getStaffCount() {
        return staffCount;
    }

    public void setStaffCount(int staffCount) {
        this.staffCount = staffCount;
    }

    public String[] getStaffList() {
        return staffList;
    }

    public void setStaffList(String[] staffList) {
        this.staffList = staffList;
    }

    // constructor
    Staff(int staffCount, String[] staffList) {
        this.staffCount = staffCount;
        this.staffList = staffList;
    }

    // toString

    @Override
    public String toString() {
        return "Staff{" +
                "\nstaffCount=" + staffCount +
                ", \nstaffList=" + Arrays.toString(staffList) +
                '}';
    }
}