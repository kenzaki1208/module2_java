package week6.inheritance.tuesday.lesson7;

public class Bird extends Animal implements Flyable, Runable{
    public Bird() {
        System.out.println("Bird contructor called");
    }

    public Bird(String name) {
        super(name);
        System.out.println("Bird contructor with name called: " + name);
    }

    @Override
    public void eat() {
        System.out.println("Bird " + getName() + " is eating bug");
    }

    @Override
    public void fly() {
        System.out.println("Bird " + getName() + " is flying");
    }

    @Override
    public void run() {
        System.out.println("Bird " + getName() + " is running");
    }
}
