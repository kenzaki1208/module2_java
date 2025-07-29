package week8.thread.exercise.ex2;

public class EvenThread extends Thread{
    @Override
    public void run() {
        for (int i = 2; i <= 10; i += 2) {
            if (i % 2 == 0) {
                System.out.println("Even number: " + i);
                try {
                    Thread.sleep(15);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
