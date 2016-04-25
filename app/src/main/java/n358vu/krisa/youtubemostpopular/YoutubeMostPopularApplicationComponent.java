package n358vu.krisa.youtubemostpopular;

import javax.inject.Singleton;

import dagger.Component;
import n358vu.krisa.youtubemostpopular.interactor.InteractorModule;
import n358vu.krisa.youtubemostpopular.interactor.CategoryInteractor;
import n358vu.krisa.youtubemostpopular.model.ModelModule;
import n358vu.krisa.youtubemostpopular.presenter.CategoriesPresenter;
import n358vu.krisa.youtubemostpopular.presenter.FavoritesPresenter;
import n358vu.krisa.youtubemostpopular.presenter.VideoListPresenter;
import n358vu.krisa.youtubemostpopular.screen.CategoriesActivity;
import n358vu.krisa.youtubemostpopular.screen.FavoritesActivity;
import n358vu.krisa.youtubemostpopular.screen.VideoListActivity;
import n358vu.krisa.youtubemostpopular.view.ViewModule;

/**
 * Created by kkrisst on 24/04/2016.
 */
@Singleton
@Component(modules = {ViewModule.class, InteractorModule.class, ModelModule.class})
public interface YoutubeMostPopularApplicationComponent {
    void inject(VideoListActivity videoListActivity);
    void inject(VideoListPresenter videoListPresenter);
    void inject(CategoryInteractor CategoryInteractor);

    void inject(CategoriesActivity categoriesActivity);
    void inject(CategoriesPresenter categoriesPresenter);
    //void inject(CategoryInteractor CategoryInteractor);

    void inject(FavoritesActivity favoritesActivity);
    void inject(FavoritesPresenter favoritesPresenter);
    //void inject(CategoryInteractor CategoryInteractor);
}
