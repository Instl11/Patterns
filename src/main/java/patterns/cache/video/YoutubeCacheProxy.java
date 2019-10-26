package patterns.cache.video;

import java.util.HashMap;

public class YoutubeCacheProxy implements YoutubeLib {

    private YoutubeLib youtubeService;
    private HashMap<String, Video> cachePopular =
            new HashMap<String, Video>();

    public YoutubeCacheProxy() {
        this.youtubeService = new YoutubeService();
    }

    @Override
    public HashMap<String, Video> popularVideos() {

        if (cachePopular.isEmpty()) {
            cachePopular = youtubeService.popularVideos();
        } else {
            System.out.println("Retrieved list from cache.");
        }
        return cachePopular;
    }

    public void reset() {
        cachePopular.clear();
    }
}
