package week8.string_and_regex.exercise.ex1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateClass {
    private static final String CLASS_REGEX = "^[CAP][0-9]{4}[GHIK]$";

    public ValidateClass() {}

    public boolean validate(String regex) {
        Pattern pattern = Pattern.compile(CLASS_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
