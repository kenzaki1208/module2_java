package week8.io_binarytree_and_serialization.exercise.ex2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class CopyFileBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the source file path: ");
        String sourceFilePath = scanner.nextLine();

        System.out.print("Enter the destination file path: ");
        String destFilePath = scanner.nextLine();

        File sourceFile = new File(sourceFilePath);
        File destFile = new File(destFilePath);

        if (!sourceFile.exists()) {
            System.out.println("File not found!");
            return;
        }

        if (destFile.exists()) {
            System.out.print("Destination file already exists. Overwrite? (y/n): ");
            String answer = scanner.nextLine();
            if (!answer.equalsIgnoreCase("y")) {
                System.out.println("Please enter 'y' to overwrite the file!");
                return;
            }
        }

        try (FileInputStream inputStream = new FileInputStream(sourceFile);
            FileOutputStream outputStream = new FileOutputStream(destFile)) {

            byte[] buffer = new byte[1024];
            int length;
            int totalBytes = 0;
            while ((length = inputStream.read(buffer)) > 0) {
                outputStream.write(buffer, 0, length);
                totalBytes += length;
            }

            System.out.printf("File copied successfully. Total bytes: %d", totalBytes);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
