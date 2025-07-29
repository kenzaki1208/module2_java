package week8.thread.exercise.ex3;

public class LazyPrimeFactorization implements Runnable{
    @Override
    public void run() {
        int number = 2;
        while (number < 50) {
            if (isPrime(number)) {
                System.out.println("Lazy prime number: " + number);
            }
            number++;
        }
    }

    private boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
