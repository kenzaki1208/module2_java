package week6.inheritance.tuesday.exp2;

public class Staff extends Employee{
    public Staff (String name, int salary) {
        super(name, salary);
    }

    @Override
    public void work() {
        System.out.println(getName() + " nhân viên đang thực hiện công việc được giao");
    }
}
