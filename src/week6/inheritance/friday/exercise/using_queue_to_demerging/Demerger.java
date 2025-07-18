package week6.inheritance.friday.exercise.using_queue_to_demerging;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Demerger {
    public static void process(String inputFile, String outputFile) throws IOException {
        Queue<Employee> nuQueue = new LinkedList<>();
        Queue<Employee> namQueue = new LinkedList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                Employee nv = Employee.parse(line);
                if (nv.getSex().equalsIgnoreCase("Nu")) {
                    nuQueue.add(nv);
                } else {
                    namQueue.add(nv);
                }
            }
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            while (!nuQueue.isEmpty()) {
                writer.write(nuQueue.poll().toString());
                writer.newLine();
            }
            while (!namQueue.isEmpty()) {
                writer.write(namQueue.poll().toString());
                writer.newLine();
            }
        }
    }

    public static void main(String[] args) {
        String inputFile = "input.txt";   // đã sắp xếp theo ngày sinh
        String outputFile = "output.txt";

        System.out.println("Working directory: " + System.getProperty("user.dir"));
        try {
            process(inputFile, outputFile);
            System.out.println("Đã xử lý xong. Kết quả lưu tại: " + outputFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
