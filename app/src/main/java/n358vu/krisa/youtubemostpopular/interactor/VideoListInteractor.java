package n358vu.krisa.youtubemostpopular.interactor;

import javax.inject.Inject;

import n358vu.krisa.youtubemostpopular.YoutubeMostPopularApplication;
import n358vu.krisa.youtubemostpopular.model.prod.VideoListModel;

/**
 * Created by kkrisst on 05/05/2016.
 */
public class VideoListInteractor {

    @Inject
    VideoListModel model;

    public VideoListInteractor() {
        YoutubeMostPopularApplication.injector.inject(this);
    }

    public String getVideo() {
        return ""; /*model.getNextVideo();*/
    }

}
