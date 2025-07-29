package week8.thread.exercise.ex2;

public class OddThread extends Thread{
    @Override
    public void run() {
        for (int i = 1; i <= 10; i += 2) {
            if (i % 2 != 0) {
                System.out.println("Odd number: " + i);
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
