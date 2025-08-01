package week8.thread.exercise.ex1;

public class NumberGenerator implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
//            System.out.println("Number: " + i + ", " + "Hash code: " + this.hashCode());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread: " + Thread.currentThread().getName() + " - Number: " + i + " - Hash code: " + this.hashCode());
        }
    }
}
