package week9.design_patterns.practice.p2;

public class TaxiNotFoundExcepTion extends RuntimeException{
    public TaxiNotFoundExcepTion(String message) {
        System.out.println(message);
    }
}
