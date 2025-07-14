package week7.Demo.vnCodeGym.lesson7;

public abstract class Animal {
    private String name;

    public Animal() {

    }

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public void eat() {
//        System.out.println(name + " is eating");
//    }

    public abstract void eat();
}
