package lesson10;

public class Truck extends Car {

    private int weight;

    public Truck(String brand, String model, int year, int engine, Fuel fuel, int weight) {
        super(brand, model, year, engine, fuel);
        this.weight = weight;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 53 * result + weight;
        return result;
    }

    @Override
    public String toString() {
        return "Truck " + super.toString() + " weight = " + weight;
    }

    @Override
    public boolean equals(Car o) {
        if (super.equals(o)) {
            return weight == ((Truck) o).weight;
        } else {
            return false;
        }
    }
}
