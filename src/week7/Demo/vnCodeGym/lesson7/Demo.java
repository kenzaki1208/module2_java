package week7.Demo.vnCodeGym.lesson7;

public class Demo {
    public static void main(String[] args) {
        Animal cat = new Cat();
        cat.setName("Tom");
        System.out.println("Animal name: " + cat.getName());
        cat.eat();

        Animal dog = new Dog("Pitbull");
        System.out.println("Animal name: " + dog.getName());
        dog.eat();

//        Animal animal = new Animal();
//        animal.setName("Tiger");
//        System.out.println("Animal name: " + animal.getName());


        // Airplane anonymous class
        Flyable airPlane = new Flyable() {
            @Override
            public void fly() {
                System.out.println("Airplane is flying");
            }
        };
    }
}
