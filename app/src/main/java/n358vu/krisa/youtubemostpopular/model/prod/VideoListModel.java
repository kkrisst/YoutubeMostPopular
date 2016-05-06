package n358vu.krisa.youtubemostpopular.model.prod;

import java.util.List;

import n358vu.krisa.youtubemostpopular.model.Video;

/**
 * Created by kkrisst on 05/05/2016.
 */
public class VideoListModel {

    public VideoListModel() {

    }

    /*
    // Get al videos in a list
    public List<Video> fetchVideos() {

    }
    */

    public void addVideo(Video vid) {
        vid.save();
    }

}
