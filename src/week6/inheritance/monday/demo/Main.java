package week6.inheritance.monday.demo;

public class Main {
    public static void main(String[] args) {
//        Animal dog = new Dog(); // dog là 1 đối tượng của lớp Dog
//        dog.name = "Chó con"; // truy cập thuộc thính protected từ lớp cha
//        dog.eat();
////        Dog myDog = (Dog) dog;
////        myDog.bark(); //Explicit casting
//        if (dog instanceof Dog) {
//            Dog realDog = (Dog) dog; //Explicitly casting to Dog
//            realDog.bark();
//        }

        Animal cat = new Cat();
        cat.name = "Mèo Tom";
        cat.eat();
        Cat myCat = (Cat) cat;
        myCat.meow();

        Animal mouse = new Mouse();
        mouse.name = "Chuột Jerry";
        mouse.eat();
//        mouse.squeak();

        double d = 5; // 5 int => double implicitly cast
        double PI = 3.14; // 3.14 double
        //Explicitly cast double to int
        int i = (int) PI;
        System.out.println(i);

        Robot robot = new Robot();
        Robot.beep();
    }
}
