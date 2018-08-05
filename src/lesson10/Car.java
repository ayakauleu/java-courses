package lesson10;

public abstract class Car {

    private String brand;
    private String model;
    private int year;
    private int engine;
    private Fuel fuel;

    public Car(String brand, String model, int year, int engine, Fuel fuel) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.engine = engine;
        this.fuel = fuel;
    }

    public boolean equals(Car o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        return brand == o.brand && model == o.model && year == o.year && engine == o.engine && fuel == o.fuel;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", engine=" + engine +
                ", fuel=" + fuel +
                '}';
    }

    @Override
    public int hashCode() {
        int result = brand.hashCode();
        result = 31 * result + model.hashCode();
        result = 31 * result + year;
        result = 31 * result + engine;
        result = 31 * result + fuel.hashCode();
        return result;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public int getEngine() {
        return engine;
    }

    public Fuel getFuel() {
        return fuel;
    }
}
