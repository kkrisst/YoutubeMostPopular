package n358vu.krisa.youtubemostpopular.presenter;

import javax.inject.Inject;

import n358vu.krisa.youtubemostpopular.YTMostPopApplication;
import n358vu.krisa.youtubemostpopular.interactor.StringInteractor;
import n358vu.krisa.youtubemostpopular.view.MainView;

public class MainPresenter extends Presenter<MainView> {

    @Inject
    public StringInteractor interactor;

    public MainPresenter() {
        YTMostPopApplication.injector.inject(this);
    }

    public void doStuff() {
        view.showString(interactor.getString());
    }
}
