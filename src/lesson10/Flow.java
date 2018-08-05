package lesson10;

public class Flow {

    public static void main(String[] args) {

        Garage garage = new Garage();

        Car car = new Sedan("Honda", "Civic", 2005, 1800, Fuel.PETROL, 4);
        Car car1 = new Sedan("Honda", "Civic", 2005, 1800, Fuel.PETROL, 4);
        Car truck = new Truck("Man", "Albukerque", 2007, 5500, Fuel.DIESEL, 21);

        garage.park(car);
        garage.exit(car1);

        System.out.println(garage.count(car));

        System.out.println(car1.equals(car));
        System.out.println(car1.hashCode() + " " + car.hashCode());
    }
}
