package week6.inheritance.tuesday.exp2;

public class Secretary extends Employee{
    public Secretary (String name, int salary) {
        super(name, salary);
    }

    @Override
    public void work() {
        System.out.println(getName() + " thư kí đang lên lịch họp cho giám đốc");
    }
}
