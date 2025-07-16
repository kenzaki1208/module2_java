package week6.inheritance.tuesday.exp2;

public class Main {
    public static void main(String[] args) {
        Employee[] employee = new Employee[5];
        employee[0] = new Director("John", 200000000);
        employee[1] = new Secretary("Jane", 50000000);
        employee[2] = new Staff("Bob", 10000000);
        employee[3] = new Staff("Tom", 15000000);
        employee[4] = new Staff("Jerry", 20000000);

        for (Employee emp : employee) {
            System.out.println(emp);
            emp.work();

            if (emp instanceof ReportWork) {
                ((ReportWork) emp).report();
            }
            System.out.println();
        }
    }
}
