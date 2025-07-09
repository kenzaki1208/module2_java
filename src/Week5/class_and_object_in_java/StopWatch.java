package Week5.class_and_object_in_java;

import java.util.Random;

public class StopWatch {
    private long startTime;
    private long endTime;

    public StopWatch() {
        this.startTime = System.currentTimeMillis();
    }

    public StopWatch(long startTime, long endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public void start() {
        this.startTime = System.currentTimeMillis();
    }

    public void stop() {
        this.endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return this.endTime - this.startTime;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public static void main(String[] args) throws InterruptedException {
        int[] arr = new int[100000];
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100000);
        }

        System.out.print("Original array: ");
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
        System.out.println("+ setStartTime(): long");
        System.out.println("+ setEndTime(): long");
        System.out.println("+ getElapsedTime(): long");

        System.out.println("Thời gian sắp xếp: " + sw.getElapsedTime() + " ms");
        System.out.print("Sorted array: ");
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
