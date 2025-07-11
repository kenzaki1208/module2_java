package week6.inheritance.demo;

public class Mouse extends Animal{
    @Override
    public void eat() {
        System.out.println(name + " is eating cheese");
    }

    public void squeak() {
        System.out.println(name + " Squeak Squeak");
    }
}
