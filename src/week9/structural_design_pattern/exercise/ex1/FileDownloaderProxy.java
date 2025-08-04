package week9.structural_design_pattern.exercise.ex1;

public class FileDownloaderProxy implements Downloader{
    private static final String FIRE_FOX_USER_AGENT = "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:70.0) Gecko/20100101 Firefox/70.0";
    private FileDownloader fileDownloader;

    public FileDownloaderProxy() {
        this.fileDownloader = new FileDownloader(FIRE_FOX_USER_AGENT);
    }

    @Override
    public void download(String url, String destination) {
        fileDownloader.download(url, destination);
    }
}
