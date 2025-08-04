package week9.structural_design_pattern.practice.p3.file_worker;

import java.io.File;

public class FileUtil {
    public long calculateSize(File file) {
        if (file.isFile()) {
            return file.length();
        } else {
            File[] children = file.listFiles();
            int size = 0;

            for(File child : children) {
                size = (int)((long)size + this.calculateSize(child));
            }

            return (long)size;
        }
    }
}
