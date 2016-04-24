package n358vu.krisa.youtubemostpopular.presenter;

import javax.inject.Inject;

import n358vu.krisa.youtubemostpopular.YoutubeMostPopularApplication;
import n358vu.krisa.youtubemostpopular.interactor.StringInteractor;
import n358vu.krisa.youtubemostpopular.view.MainView;

/**
 * Created by kkrisst on 24/04/2016.
 */
public class MainPresenter extends Presenter<MainView> {
    @Inject
    public StringInteractor interactor;

    public MainPresenter() {
        YoutubeMostPopularApplication.injector.inject(this);
    }

    public void doStuff() {
        view.showCategories(interactor.getString());
    }
}
