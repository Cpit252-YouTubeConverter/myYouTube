import java.io.BufferedReader;
import java.io.InputStreamReader;

public class YoutubeDownloader {
    YoutubeDownloader() {}

    public void downloadVideo(String url) {
        try {
            String output_path = "C:\\Users\\Best\\Downloads"; // replace with your directory
            ProcessBuilder pb = new ProcessBuilder("C:\\Users\\Best\\Documents\\CPIT252\\myYouTube\\video_downloader\\venv\\Scripts\\python.exe", "C:\\Users\\Best\\Documents\\CPIT252\\myYouTube\\video_downloader\\main.py", url, output_path);
            Process p = pb.start();
            p.waitFor();
            System.out.println("Video downloaded successfully!");
        } catch (Exception e) {
            System.out.println("Error downloading video: " + e.getMessage());
        }
    }

    public void downloadAudio(String url) {
        try {
            String output_path = "C:\\Users\\Best\\Downloads"; // replace with your directory
            ProcessBuilder pb = new ProcessBuilder("C:\\Users\\Best\\Documents\\CPIT252\\myYouTube\\video_downloader\\venv\\Scripts\\python.exe", "C:\\Users\\Best\\Documents\\CPIT252\\myYouTube\\video_downloader\\audi.py", url, output_path);
            Process p = pb.start();
            p.waitFor();
            System.out.println("Audio downloaded successfully!");
        } catch (Exception e) {
            System.out.println("Error downloading audio: " + e.getMessage());
        }
    }
}