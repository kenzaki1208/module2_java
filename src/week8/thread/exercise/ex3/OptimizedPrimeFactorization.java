package week8.thread.exercise.ex3;

public class OptimizedPrimeFactorization implements Runnable{
    @Override
    public void run() {
        int number = 2;
        while (number < 50) {
            if (isPrime(number)) {
                System.out.println("Optimized prime number: " + number);
            }
            number++;
        }
    }

    private boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
