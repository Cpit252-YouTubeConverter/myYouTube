public class YoutubeDownloaderFacade {
    private static YoutubeDownloaderFacade instance = null;
    private YoutubeDownloader downloader = null;

    private YoutubeDownloaderFacade() {
        downloader = new YoutubeDownloader();
    }

    public static YoutubeDownloaderFacade getInstance() {
        if (instance == null) {
            instance = new YoutubeDownloaderFacade();
        }
        return instance;
    }

    public void downloadVideo(String url) {
        downloader.downloadVideo(url);
    }

    public void downloadAudio(String url) {
        downloader.downloadAudio(url);
    }
}