package transport;

public class Car {
    private String brand;
    private String model;
    private float engineVolume;
    private String color;
    private int year;
    private String country;

    public Car() {
        model = null;
        brand = null;
        country = null;
        if (engineVolume <= 0) {
            engineVolume = 1.5F;
        }
        if (color == null || color == "") {
            color = "белый";
        }
        if (year <= 0) {
            year = 2000;
        }
    }

    public Car(String brand, String model, float engineVolume, String color, int year, String country) {
        if (brand == null || brand.isEmpty()) {
            brand = "default";
        }
        this.brand = brand;
        if (model == null || model.isEmpty()) {
            model = "default";
        }
        this.model = model;
        if (engineVolume <= 0) {
            engineVolume = 1.5F;
        }
        this.engineVolume = engineVolume;
        if (color == null || color == "") {
            color = "белый";
        }
        this.color = color;
        if (year <= 0) {
            year = 2000;
        }
        this.year = year;
        if (country == null || country.isEmpty()) {
            country = "default";
        }
        this.country = country;
    }

    @Override
    public String toString() {
        return "transport.Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", country='" + country + '\'' +
                '}';
    }
}
