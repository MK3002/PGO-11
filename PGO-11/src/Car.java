import java.util.ArrayList;
import java.util.Collections;
class Car implements Comparable<Car> {
    protected int yearOfProduction;
    protected String model;

    public Car(int yearOfProduction, String model) {
        this.yearOfProduction = yearOfProduction;
        this.model = model;
    }

    @Override
    public int compareTo(Car otherCar) {
        return Integer.compare(this.yearOfProduction, otherCar.yearOfProduction);
    }

    @Override
    public String toString() {
        return "Year: " + yearOfProduction + ", Model: " + model;
    }
}