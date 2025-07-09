package Week5.class_and_object_in_java;

import java.util.Random;

public class StopWatch {
    private long startTime;
    private long endTime;

    public StopWatch() {
        startTime = System.currentTimeMillis();
    }

    public void start() {
        startTime = System.currentTimeMillis();
    }

    public void stop() {
        endTime = System.currentTimeMillis();
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public long getElapsedTime() {
        return endTime - startTime;
    }

    public static void main(String[] args) throws InterruptedException {
        int[] arr = new int[100000];
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100000);
        }

        StopWatch sw = new StopWatch();
        sw.start();
        selectionSort(arr);
        sw.stop();

        System.out.println("UML: ");
        System.out.println("StopWatch");
        System.out.println("- startTime: long");
        System.out.println("- endTime: long");
        System.out.println("+ StopWatch()");
        System.out.println("+ start(): void ");
        System.out.println("+ stop(): void");
        System.out.println("+ getStartTime(): long");
        System.out.println("+ getEndTime(): long");
        System.out.println("+ getElapsedTime(): long");

        System.out.println("Thời gian sắp xếp: " + sw.getElapsedTime() + " ms");
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }
}
