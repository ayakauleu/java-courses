package lesson10;

public class Sportcar extends Car {

    private int velocity;

    public Sportcar(String brand, String model, int year, int engine, Fuel fuel, int velocity) {
        super(brand, model, year, engine, fuel);
        this.velocity = velocity;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 41 * result + velocity;
        return result;
    }

    @Override
    public String toString() {
        return "Sportcar " + super.toString() + " velocity = " + velocity;
    }

    @Override
    public boolean equals(Car o) {
        if (super.equals(o)) {
            return velocity == ((Sportcar) o).velocity;
        } else {
            return false;
        }
    }
}
