package week9.structural_design_pattern.exercise.ex1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class FileDownloader implements Downloader{
    private String userAgent;

    public FileDownloader(String userAgent) {
        this.userAgent = userAgent;
    }

    @Override
    public void download(String url, String destination) {
        try {
            URL website = new URL(url);
            URLConnection connection = website.openConnection();
            connection.setRequestProperty("User-Agent", userAgent);

            try (InputStream in = connection.getInputStream()) {
                FileOutputStream out = new FileOutputStream(destination);

                byte[] buffer = new byte[1024];
                int bytesRead;
                while ((bytesRead = in.read(buffer)) != -1) {
                    out.write(buffer, 0, bytesRead);
                }
            }
            System.out.println("Download complete: " + destination);
        } catch (IOException e) {
            System.out.println("Download failed: " + e.getMessage());
        }
    }
}
