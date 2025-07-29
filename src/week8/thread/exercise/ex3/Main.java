package week8.thread.exercise.ex3;

public class Main {
    public static void main(String[] args) {
        Runnable lazyPrime = new LazyPrimeFactorization();
        Runnable optimizedPrime = new OptimizedPrimeFactorization();

        Thread t1 = new Thread(lazyPrime);
        Thread t2 = new Thread(optimizedPrime);

        t1.start();
        t2.start();
    }
}
