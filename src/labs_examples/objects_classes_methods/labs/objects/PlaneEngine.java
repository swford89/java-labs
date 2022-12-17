package labs_examples.objects_classes_methods.labs.objects;

public class PlaneEngine {

    // instance variables
    private int horsepower;
    private boolean isElectric;
    private boolean isGas;

    // getter setter methods
    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    public boolean isElectric() {
        return isElectric;
    }

    public void setElectric(boolean electric) {
        isElectric = electric;
    }

    public boolean isGas() {
        return isGas;
    }

    public void setGas(boolean gas) {
        isGas = gas;
    }

    //constructor
    PlaneEngine(int horsepower, boolean isGas, boolean isElectric) {
        this.horsepower = horsepower;
        this.isGas = isGas;
        this.isElectric = isElectric;
    }

    @Override
    public String toString() {
        return "PlaneEngine{" +
                "\nhorsepower=" + horsepower +
                ", \nisElectric=" + isElectric +
                ", \nisGas=" + isGas +
                '}';
    }
}
