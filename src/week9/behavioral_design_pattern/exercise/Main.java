package week9.behavioral_design_pattern.exercise;

public class Main {
    public static void main(String[] args) {
        User user = new User("Trinh Dinh Duy", "duytr2571@gmail.com");
        UserController xmlController = new UserController(new XMLStorage());
        xmlController.saveUser(user);

        System.out.println();

        UserController mysqlController = new UserController(new MySQLStorage());
        mysqlController.saveUser(user);
    }
}
