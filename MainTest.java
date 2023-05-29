import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

public class MainTest {

    @Test
    public void testSingleton() {
        YoutubeDownloaderFacade instance1 = YoutubeDownloaderFacade.getInstance();
        YoutubeDownloaderFacade instance2 = YoutubeDownloaderFacade.getInstance();
        assertSame(instance1, instance2);
    }

    @Test
    public void testDownloadVideo() {
        YoutubeDownloaderFacade facade = YoutubeDownloaderFacade.getInstance();
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        String url = "https://youtu.be/UIo-WRAo-s4";
        facade.downloadVideo(url);
        String expectedOutput = "Video downloaded successfully!";
        assertEquals(expectedOutput, outContent.toString().trim());
    }

    @Test
    public void testDownloadAudio() {
        YoutubeDownloaderFacade facade = YoutubeDownloaderFacade.getInstance();
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        String url = "https://youtu.be/UIo-WRAo-s4";
        facade.downloadAudio(url);
        String expectedOutput = "Audio downloaded successfully!";
        assertEquals(expectedOutput, outContent.toString().trim());
    }
}