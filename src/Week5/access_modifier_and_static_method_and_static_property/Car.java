package Week5.access_modifier_and_static_method_and_static_property;

public class Car {
    private String name;
    private String engine;
    public static int numberOfCar;
    public Car(String name, String engine) {
        this.name = name;
        this.engine = engine;
        numberOfCar++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public static int getNumberOfCar() {
        return numberOfCar;
    }

    public static void setNumberOfCar(int numberOfCar) {
        Car.numberOfCar = numberOfCar;
    }

    public void display() {
        System.out.println(name + " " + engine);
    }

    public static void main(String[] args) {
        Car c1 = new Car("BMW", "V8");
        Car c2 = new Car("Honda", "Civic");
        Car c3 = new Car("Toyota", "Camry");
        Car c4 = new Car("Mazda 3", "Skyactiv 3");
        Car c5 = new Car("Mazda 6","Skyactiv 6");

        c1.display();
        c2.display();
        c3.display();
        c4.display();
        c5.display();
        System.out.println("Number of cars: " + Car.numberOfCar);
    }
}
