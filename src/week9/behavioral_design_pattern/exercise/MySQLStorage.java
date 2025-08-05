package week9.behavioral_design_pattern.exercise;

public class MySQLStorage implements UserStorage{
    @Override
    public void store(User user) {
        System.out.println("Saving User to MySQL database: ");
        System.out.println("INSERT INTO users (name, email) VALUES ('" + user.getName() + "', '" + user.getEmail() + "');");
    }
}
