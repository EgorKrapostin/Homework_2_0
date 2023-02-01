package transport;

public class Car {
    private final String brand;
    private final String model;
    private float engineVolume;
    private String color;
    private final int year;
    private final String country;
    private String gearbox;
    private final String bodyType;
    private int nubmer;
    private final int places;
    private boolean winterTires;

    public class Key {
        private final boolean remoteEngineStart;
        private final boolean keylessAccess;

        public Key(boolean remoteEngineStart, boolean keylessAccess) {
            if (remoteEngineStart != true || false) {
                remoteEngineStart = false;
            }
            this.remoteEngineStart = remoteEngineStart;
            if (keylessAccess != true || false) {
                keylessAccess = false;
            }
            this.keylessAccess = keylessAccess;
        }
    }

    public Car(String brand, String model, float engineVolume, String color, int year, String country, String gearbox, String bodyType, int nubmer, int places, boolean winterTires) {
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
        if (gearbox == null || gearbox.isEmpty()) {
            gearbox = "default";
        }
        this.gearbox = gearbox;
        if (bodyType == null || bodyType.isEmpty()) {
            bodyType = "default";
        }
        this.bodyType = bodyType;
        if (nubmer < 0) {
            nubmer = 123456789;
        }
        this.nubmer = nubmer;
        if (places < 0) {
            places = 1;
        }
        this.places = places;
        if (winterTires != true || false) {
            winterTires = false;
        }
        this.winterTires = winterTires;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public float getEngineVolume() {
        return engineVolume;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getGearbox() {
        return gearbox;
    }

    public String getBodyType() {
        return bodyType;
    }

    public int getNubmer() {
        return nubmer;
    }

    public int getPlaces() {
        return places;
    }

    public boolean isWinterTires() {
        return winterTires;
    }

    public void setEngineVolume(float engineVolume) {
        this.engineVolume = engineVolume;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setGearbox(String gearbox) {
        this.gearbox = gearbox;
    }

    public void setNubmer(int nubmer) {
        this.nubmer = nubmer;
    }

    public void setWinterTires(boolean winterTires) {
        this.winterTires = winterTires;
    }

    public void changeTiresToWinter() {
        setWinterTires(true);
    }

    public void changeTiresToSummer() {
        setWinterTires(false);
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", country='" + country + '\'' +
                ", gearbox='" + gearbox + '\'' +
                ", bodyType='" + bodyType + '\'' +
                ", nubmer=" + nubmer +
                ", places=" + places +
                ", winterTires=" + winterTires +
                '}';
    }
}
