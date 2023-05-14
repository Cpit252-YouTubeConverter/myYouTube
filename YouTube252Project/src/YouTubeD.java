import java.io.BufferedReader;
import java.io.InputStreamReader;

public class YouTubeD {
    private static YouTubeD instance = null;
    private YouTubeD() {}

    public static YouTubeD getInstance() {
        if (instance == null) {
            instance = new YouTubeD();
        }
        return instance;
    }

    public void downloadVideo(String url) {
        try {
            String output_path = "C:\\Users\\Fahad\\Music";
            ProcessBuilder pb = new ProcessBuilder("C:\\Users\\Fahad\\AppData\\Local\\Programs\\Python\\Python311\\python.exe", "C:\\Users\\Fahad\\video_downloader\\main.py", url, output_path);

            pb.redirectErrorStream(true);
            Process p = pb.start();

            BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            int exitCode = p.waitFor();
            System.out.println("\nExited with error code : " + exitCode);
        } catch (Exception e) {
            System.out.println("Error downloading video: " + e.getMessage());
        }
    }


    public void downloadAudio(String url) {
        try {
            String output_path = "C:\\Users\\Fahad\\Music"; 
            ProcessBuilder pb = new ProcessBuilder("C:\\Users\\Fahad\\AppData\\Local\\Programs\\Python\\Python311\\python.exe", "C:\\Users\\Fahad\\video_downloader\\audi.py", url, output_path);
            Process p = pb.start();
            p.waitFor();
            System.out.println("Audio downloaded successfully!");
        } catch (Exception e) {
            System.out.println("Error downloading audio: " + e.getMessage());
        }
    }






}

