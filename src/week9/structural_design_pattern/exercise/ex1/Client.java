package week9.structural_design_pattern.exercise.ex1;

public class Client {
    public static void main(String[] args) {
        Downloader downloader = new FileDownloaderProxy();

        String url = "file:///C:/Users/duytr/Downloads/[2]%20Bo%CC%A3%CC%82%20ca%CC%82u%20ho%CC%89i%20pho%CC%89ng%20va%CC%82%CC%81n%20module%202%20JAVA.pdf";
        String destination = "C:\\Users\\duytr\\IdeaProjects\\module2_java\\src\\week9\\structural_design_pattern\\exercise\\ex1\\Question_module2.pdf";

        downloader.download(url, destination);
    }
}
