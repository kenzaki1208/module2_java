package week8.string_and_regex.exercise.ex2;

public class ValidatePhoneNumberTest {
    public static final String[] validPhoneNumber = new String[]{"(84)-(0978489648)"};
    public static final String[] invalidPhoneNumber = new String[]{"(a8)-(22222222)", "(84)-(22b22222)", "(84)-(9978489648)"};

    public static void main(String[] args) {
        ValidatePhoneNumber validatePhoneNumber = new ValidatePhoneNumber();
        for (String phoneNumber : validPhoneNumber) {
            boolean isValid = validatePhoneNumber.validate(phoneNumber);
            System.out.println("Phone number is " + phoneNumber + " is valid: " + isValid);
        }
        for (String phoneNumber : invalidPhoneNumber) {
            boolean isValid = validatePhoneNumber.validate(phoneNumber);
            System.out.println("Phone number is " + phoneNumber + " is valid: " + isValid);
        }
    }
}