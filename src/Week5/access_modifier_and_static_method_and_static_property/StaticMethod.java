package Week5.access_modifier_and_static_method_and_static_property;

public class StaticMethod {
    private int rollno;
    private String name;
    private static String college = "BBDIT";

    StaticMethod(int r, String n) {
        rollno = r;
        name = n;
    }

    static void change() {
        college = "CODEGYM";
    }

    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }

    public static void main(String[] args) {
        StaticMethod.change();

        StaticMethod s1 = new StaticMethod(101, "John");
        StaticMethod s2 = new StaticMethod(102, "Jane");
        StaticMethod s3 = new StaticMethod(103, "Jill");

        s1.display();
        s2.display();
        s3.display();
    }
}
