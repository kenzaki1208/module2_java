package week9.structural_design_pattern.practice.p3.file_worker;

import java.io.File;

public class FileCalculatorAdapter implements FileCalculator{
    @Override
    public long calculateSize(String path) {
        FileUtil fileUtil = new FileUtil();
        File file = new File(path);
        return fileUtil.calculateSize(file);
    }
}
