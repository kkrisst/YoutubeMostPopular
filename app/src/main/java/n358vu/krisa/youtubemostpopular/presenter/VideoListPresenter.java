package n358vu.krisa.youtubemostpopular.presenter;

import javax.inject.Inject;

import n358vu.krisa.youtubemostpopular.YoutubeMostPopularApplication;
import n358vu.krisa.youtubemostpopular.interactor.VideoListInteractor;
import n358vu.krisa.youtubemostpopular.view.VideoListView;

/**
 * Created by mobsoft on 2016. 04. 25..
 */
public class VideoListPresenter extends Presenter<VideoListView> {
    @Inject
    public VideoListInteractor interactor;

    public VideoListPresenter() {
        YoutubeMostPopularApplication.injector.inject(this);
    }

}
