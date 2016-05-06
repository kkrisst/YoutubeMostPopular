package n358vu.krisa.youtubemostpopular.model.mock;

import java.util.LinkedList;
import java.util.List;

import n358vu.krisa.youtubemostpopular.model.Video;
import n358vu.krisa.youtubemostpopular.model.prod.VideoListModel;

/**
 * Created by mobsoft on 2016. 05. 06..
 */
public class MockVideoListModel extends VideoListModel {

    LinkedList<Video> videolist = new LinkedList<>();

    public MockVideoListModel() {
        videolist.add(new Video("title1", "uploader1"));
        videolist.add(new Video("title2", "uploader2"));
    }

    /*
    // Get all videos in a list
    @Override
    public List<Video> fetchVideos() {
        return videolist;
    }
    */

    @Override
    public void addVideo(Video vid) {
        videolist.add(vid);
    }

}
