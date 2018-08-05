package lesson10;

import java.util.HashMap;
import java.util.Map;

public class Garage {

    private Map<Car, Integer> cars;

    public Garage() {
        cars = new HashMap<Car, Integer>();
    }

    public void park(Car car) {
        int curr = count(car);
        cars.put(car, curr+1);
        System.out.println("Car parked: " + car);
    }

    public void exit(Car car) {
        int curr = count(car);
        if (curr > 0) {
            cars.put(car, curr - 1);
            System.out.println("Car exited: " + car);
        } else {
            System.out.println("No more cars of such type: " + car);
        }
    }

    public int count(Car car) {
        return cars.getOrDefault(car, 0);
    }
}
