package week7.Demo.vnCodeGym.lesson7;

public class Dog extends Animal implements Runable{

    public Dog() {
    }

    public Dog(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("Dog " + getName() + " is eating meat");
    }

    @Override
    public void run() {
        System.out.println("Dog " + getName() + " is running");
    }
}
