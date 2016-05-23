package n358vu.krisa.youtubemostpopular.model.mock;

import java.util.LinkedList;
import java.util.List;

import n358vu.krisa.youtubemostpopular.model.Video;
import n358vu.krisa.youtubemostpopular.model.prod.VideoListModel;

public class MockVideoListModel extends VideoListModel {

    LinkedList<Video> videolist = new LinkedList<>();

    public MockVideoListModel() {
        videolist.add(new Video("title1", "uploader1"));
        videolist.add(new Video("title2", "uploader2"));
    }

    @Override
    public void addVideo(Video vid) {
        videolist.add(vid);
    }

}
