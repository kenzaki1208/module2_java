package week8.thread.practice.p3;

public class Count implements Runnable {
    private Thread thread;

    public Count() {
        thread = new Thread(this, "My runable thread");
        System.out.println("My thread created" + thread);
        thread.start();
    }

    public Thread getMyThread() {
        return thread;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Print the count " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
        System.out.println("My thread run is over");
    }
}
