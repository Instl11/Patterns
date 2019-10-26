package patterns.cache.video;

import java.util.HashMap;

public interface YoutubeLib {
    HashMap<String, Video> popularVideos();
}
