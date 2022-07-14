package TH_StaticProperty;

public class TestStaticProperty {
    public static void main(String[] args) {
        Car car1 = new Car("Mazda 3","G63");
        System.out.println(Car.numberOfCars);
        Car car2 = new Car("Mazda 6","S500 Mayback");
        System.out.println(Car.numberOfCars);
    }
}
