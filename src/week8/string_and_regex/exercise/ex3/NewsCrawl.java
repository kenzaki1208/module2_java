package week8.string_and_regex.exercise.ex3;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NewsCrawl {
    public static void main(String[] args) {
        try {
            InputStreamReader inputStreamReader = getInputStreamReader();
            Scanner scanner = new Scanner(inputStreamReader);
            scanner.useDelimiter("\\Z");

            String content = scanner.next();
            content = content.replaceAll("\\n+", "");

            Pattern pattern = Pattern.compile("title=\"([^\"]+)\"");
            Matcher matcher = pattern.matcher(content);
            while (matcher.find()) {
                System.out.println(matcher.group(1));
            }

            scanner.close();
            inputStreamReader.close();
            System.out.println("Done.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static InputStreamReader getInputStreamReader() throws IOException{
        URL url  = new URL("https://dantri.com.vn/the-gioi.htm");
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();

        httpURLConnection.setRequestProperty("User-Agent",
                "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 "
                        + "(KHTML, like Gecko) Chrome/122.0.0.0 Safari/537.36");
        httpURLConnection.setRequestProperty("Accept",
                "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8");
        httpURLConnection.setRequestProperty("Accept-Language", "vi-VN,vi;q=0.9,en;q=0.8");
        httpURLConnection.setRequestProperty("Referer", "https://www.google.com/");
        httpURLConnection.setRequestProperty("Connection", "keep-alive");

        return new InputStreamReader(httpURLConnection.getInputStream(), StandardCharsets.UTF_8);
    }
}
