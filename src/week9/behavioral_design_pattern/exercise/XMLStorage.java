package week9.behavioral_design_pattern.exercise;

public class XMLStorage implements UserStorage{
    @Override
    public void store(User user) {
        System.out.println("Saving User to XML file: ");
        System.out.println("<user>");
        System.out.println("    <name>" + user.getName() + "</name>");
        System.out.println("    <email>" + user.getEmail() + "</email>");
        System.out.println("</user>");
    }
}
