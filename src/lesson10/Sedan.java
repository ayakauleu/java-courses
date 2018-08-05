package lesson10;

public class Sedan extends Car {

    private int places;

    public Sedan(String brand, String model, int year, int engine, Fuel fuel, int places) {
        super(brand, model, year, engine, fuel);
        this.places = places;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 37 * result + places;
        return result;
    }

    @Override
    public String toString() {
        return "Sedan " + super.toString() + " places = " + places;
    }

    @Override
    public boolean equals(Car o) {
        if (super.equals(o)) {
            return places == ((Sedan) o).places;
        } else {
            return false;
        }
    }

}
