package week8.io_textfile.exercise.ex1;

import java.io.*;
import java.util.Scanner;

public class FileCopyText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String sourcePath = getInputPath(scanner, "C:\\Users\\duytr\\IdeaProjects\\module2_java\\src\\week8\\io_textfile\\exercise\\test1.txt");
        String targerPath = getInputPath(scanner, "C:\\Users\\duytr\\IdeaProjects\\module2_java\\src\\week8\\io_textfile\\exercise\\test2.txt");

        if (!checkSourceFileExists(sourcePath)) return;
//        if (checkTargetFileExists(targerPath)) return;

        int copiedCharacters = copyFile(sourcePath, targerPath);
        if (copiedCharacters >= 0) {
            System.out.println(("Sao chép thành công! Tổng số ký tự: " + copiedCharacters));
        }
    }

    public static String getInputPath(Scanner scanner, String defaultPath) {
        System.out.print("Nhập đường dẫn tệp (nhấn Enter để dùng mặc định): ");
        String input = scanner.nextLine().trim();
        return input.isEmpty() ? defaultPath : input;
    }

    public static boolean checkSourceFileExists(String sourcePath) {
        File sourceFile = new File(sourcePath);
        if (!sourceFile.exists()) {
            System.out.println("Tệp nguồn ko tồn tại !");
            return false;
        }
        return true;
    }

    public static boolean checkTargetFileExists(String targetPath, Scanner scanner) {
        File targerFile = new File(targetPath);
        if (targerFile.exists()) {
            System.out.print("Tệp đích đã tồn tại! Bạn có muốn ghi đè không? (y/n): ");
            String answer = scanner.nextLine().trim();
            return !answer.equalsIgnoreCase("y");
        }
        return false;
    }

    public static int copyFile(String sourcePath, String targerPath) {
        int charCount = 0;
        try (
                BufferedReader reader = new BufferedReader(new FileReader(sourcePath));
                BufferedWriter writer = new BufferedWriter(new FileWriter(targerPath));
        ) {
            int character;
            while ((character = reader.read()) != -1) {
                writer.write(character);
                charCount++;
            }
            return charCount;
        } catch (IOException e) {
            System.out.println("Lỗi khi sao chép: " + e.getMessage());
            return -1;
        }
    }
}
