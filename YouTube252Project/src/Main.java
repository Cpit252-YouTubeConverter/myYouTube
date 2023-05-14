import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter YouTube video URL: ");
        String url = scanner.nextLine();

        System.out.print("Download video or audio? (v/a): ");
        String choice = scanner.nextLine();

        YouTubeD downloader = YouTubeD.getInstance();
        if (choice.equals("v")) {
            downloader.downloadVideo(url);
        } else if (choice.equals("a")) {
            downloader.downloadAudio(url);
        } else {
            System.out.println("Invalid choice!");
        }
    }
}
