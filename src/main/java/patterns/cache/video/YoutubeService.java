package patterns.cache.video;

import java.util.HashMap;

public class YoutubeService implements YoutubeLib {

    @Override
    public HashMap<String, Video> popularVideos() {
//        connectToServer("http://www.youtube.com");
//        return getRandomVideos();
        return new HashMap<>();
    }
}
