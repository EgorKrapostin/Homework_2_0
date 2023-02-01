package transport;

public class Main {
    public static void main(String[] args) {
        Car lada = new Car("", "", 1.7F, "желтый", 0, "Россия");
        Car audi = new Car("Audi", "A8", 3.0F, "черный", 2020, "Германия");
        Car bmw = new Car("BMW", "Z8", 3.0F, "черный", 2021, "Германия");
        Car kia = new Car("Kia", "Sportage", 2.4F, "красный", 2018, "Южная Корея");
        Car hyundai = new Car("Hyundai", "Avante", 1.6F, "оранжевый", 2016, "Южная Корея");

        System.out.println(lada.toString());
//        System.out.println(audi.toString());
//        System.out.println(bmw.toString());
//        System.out.println(kia.toString());
//        System.out.println(hyundai.toString());
    }
}