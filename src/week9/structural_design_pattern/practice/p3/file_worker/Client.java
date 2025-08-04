package week9.structural_design_pattern.practice.p3.file_worker;

public class Client {
    private FileCalculator fileCalculator;

    public Client(FileCalculator fileCalculator) {
        this.fileCalculator = fileCalculator;
    }

    public void printFileSize(String path) {
        System.out.println("File size: " + fileCalculator.calculateSize(path));
    }
}
