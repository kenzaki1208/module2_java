package week8.io_textfile.exercise.ex2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadCountryCSV {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\duytr\\IdeaProjects\\module2_java\\src\\week8\\io_textfile\\exercise\\ex2\\test.csv";
        List<Country> countryList = readCSV(filePath);
        for (Country country : countryList) {
            System.out.println(country);
        }
    }

    public static List<Country> readCSV(String path) {
        List<Country> countryList = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                int id = Integer.parseInt(data[0]);
                String code = data[1].replace("\"", "");
                String name = data[2].replace("\"", "");
                Country country = new Country(id, code, name);
                countryList.add(country);
            }
            br.close();
        } catch (IOException e) {
            System.out.println("Lỗi đọc file: " + e.getMessage());
        }
        return countryList;
    }
}
