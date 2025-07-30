package week8.string_and_regex.exercise.ex1;

public class ValidateClassTest {
    public static final String[] validClass = new String[]{"C0223G", "A0323K"};
    public static final String[] invalidClass = new String[]{"M0318G", "P0323A"};

    public static void main(String[] args) {
        ValidateClass validateClass = new ValidateClass();
        for (String classCode : validClass) {
            boolean isValid = validateClass.validate(classCode);
            System.out.println("Class code is " + classCode + " is valid: " + isValid);
        }
        for (String classCode : invalidClass) {
            boolean isValid = validateClass.validate(classCode);
            System.out.println("Class code is " + classCode + " is valid: " + isValid);
        }
    }
}