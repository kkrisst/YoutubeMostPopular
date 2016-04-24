package n358vu.krisa.youtubemostpopular;

import javax.inject.Singleton;

import dagger.Component;
import n358vu.krisa.youtubemostpopular.interactor.InteractorModule;
import n358vu.krisa.youtubemostpopular.interactor.StringInteractor;
import n358vu.krisa.youtubemostpopular.model.ModelModule;
import n358vu.krisa.youtubemostpopular.presenter.MainPresenter;
import n358vu.krisa.youtubemostpopular.view.ViewModule;

/**
 * Created by kkrisst on 24/04/2016.
 */
@Singleton
@Component(modules = {ViewModule.class, InteractorModule.class, ModelModule.class})
public interface YoutubeMostPopularApplicationComponent {
    void inject(MainActivity mainActivity);
    void inject(MainPresenter mainPresenter);
    void inject(StringInteractor stringInteractor);
}
