package week6.inheritance.monday.demo;

public class Cat extends Animal{
    @Override
    public void eat() {
        System.out.println(name + " is eating fiss");
    }

    public void meow() {
        System.out.println(name + " Meow Meow");
    }
}
