package week8.thread.exercise.ex2;

public class TestThread {
    public static void main(String[] args) {
        OddThread oddThread = new OddThread();
        EvenThread evenThread = new EvenThread();

        oddThread.start();

        try {
            oddThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        evenThread.start();
    }
}
