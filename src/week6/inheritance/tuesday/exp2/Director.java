package week6.inheritance.tuesday.exp2;

public class Director extends Employee{
    public Director (String name, int salary) {
        super(name, salary);
    }

    @Override
    public void work() {
        System.out.println(getName() + " giám đốc đang điều chỉnh công việc");
    }
}
