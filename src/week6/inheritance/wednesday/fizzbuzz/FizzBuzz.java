package week6.inheritance.wednesday.fizzbuzz;

public class FizzBuzz {
    public static String isFizzBuzz(int number) {
        boolean isCheckNumb3 = number % 3 == 0;
        boolean isCheckNumb5 = number % 5 == 0;
//        boolean checkNumb3 = String.valueOf(number).contains("3");
//        boolean checkNumb5 = String.valueOf(number).contains("5");

//        boolean isFizz = isCheckNumb3 || checkNumb3;
//        boolean isBuzz = isCheckNumb5 || checkNumb5;

        boolean isFizz = isCheckNumb3;
        boolean isBuzz = isCheckNumb5;

        return getFizzBuzz(number, isFizz, isBuzz);
    }

    private static String getFizzBuzz(int number, boolean isFizz, boolean isBuzz) {
        if (isFizz && isBuzz) {
            return "FizzBuzz";
        } else if (isFizz) {
            return "Fizz";
        } else if (isBuzz) {
            return "Buzz";
        } else  {
            return String.valueOf(number);
        }
    }
}
