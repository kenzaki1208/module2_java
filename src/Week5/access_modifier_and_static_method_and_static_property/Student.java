package Week5.access_modifier_and_static_method_and_static_property;

public class Student {
    public String name;
    public String classes;
    public Student(String name, String classes) {
        this.name = name;
        this.classes = classes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public void display() {
        System.out.println(name + " " + classes);
    }

    public static void main(String[] args) {
        Student s1 = new Student("John", "a101");
        Student s2 = new Student("Jane", "b102");
        Student s3 = new Student("Jill", "c103");

        s1.display();
        s2.display();
        s3.display();
    }
}
