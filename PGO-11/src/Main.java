import java.util.ArrayList;
import java.util.Collections;
public class Main {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car(1960, "white"));
        cars.add(new Car(1950, "black"));
        cars.add(new Car(1945, "light blue"));
        cars.add(new Car(1953, "brown"));
        cars.add(new Car(1976, "orange"));
        cars.add(new Car(1909, "yellow"));
        cars.add(new Car(1957, "red"));
        cars.add(new Car(1999, "purple"));
        cars.add(new Car(1912, "green"));
        cars.add(new Car(2000, "blue"));
        Collections.sort(cars);
        for (Car car : cars) {
            System.out.println(car);
        }
    }
}
