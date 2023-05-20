import java.io.BufferedReader;
import java.io.InputStreamReader;

public class YoutubeDownloader {
    YoutubeDownloader() {}

    public void downloadVideo(String url) {
        try {
            String output_path = "C:\\Users\\Best\\Downloads"; // replace with your directory
            ProcessBuilder pb = new ProcessBuilder("C:\\Users\\Best\\Documents\\cpit252pro\\venv\\Scripts\\python.exe", "C:\\Users\\Best\\Documents\\cpit252pro\\main.py", url, output_path);

            pb.redirectErrorStream(true); // Redirects stderr to stdout
            Process p = pb.start();

            BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            int exitCode = p.waitFor();
            System.out.println("\nExitedwith error code : " + exitCode);
        } catch (Exception e) {
            System.out.println("Error downloading video: " + e.getMessage());
        }
    }

    public void downloadAudio(String url) {
        try {
            String output_path = "C:\\Users\\Best\\Downloads"; // replace with your directory
            ProcessBuilder pb = new ProcessBuilder("C:\\Users\\Best\\Documents\\cpit252pro\\venv\\Scripts\\python.exe", "C:\\Users\\Best\\Documents\\cpit252pro\\audi.py", url, output_path);
            Process p = pb.start();
            p.waitFor();
            System.out.println("Audio downloaded successfully!");
        } catch (Exception e) {
            System.out.println("Error downloading audio: " + e.getMessage());
        }
    }
}