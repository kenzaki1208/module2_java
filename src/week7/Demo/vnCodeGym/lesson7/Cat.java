package week7.Demo.vnCodeGym.lesson7;

public class Cat extends Animal implements Runable{

    @Override
    public void eat() {
        System.out.println("Cat " + getName() + " is eating fish");
    }

    @Override
    public void run() {
        System.out.println("Cat " + getName() + " is running");
    }
}
