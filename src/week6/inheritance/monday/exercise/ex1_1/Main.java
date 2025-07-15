package week6.inheritance.monday.exercise.ex1_1;

public class Main {
    public static void main(String[] args) {
        //        Circle circle1 = new Circle();
        //        System.out.println(circle1);

        Circle circle1 = new Circle(2.3, "red");
        System.out.println(circle1);

        //        Cylinder cylinder1 = new Cylinder();
        //        System.out.println(cylinder1);

        Cylinder cylinder = new Cylinder(2.3, 5.8, "orange");
        System.out.println(cylinder);

        Cylinder cylinder1 = new Cylinder(4.5, 7.6, "red");
        System.out.println(cylinder1);
    }
}
