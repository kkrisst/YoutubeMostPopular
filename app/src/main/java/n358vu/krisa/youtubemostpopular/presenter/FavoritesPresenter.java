package n358vu.krisa.youtubemostpopular.presenter;

import javax.inject.Inject;

import n358vu.krisa.youtubemostpopular.YoutubeMostPopularApplication;
import n358vu.krisa.youtubemostpopular.interactor.FavoritesInteractor;
import n358vu.krisa.youtubemostpopular.view.FavoritesView;

/**
 * Created by mobsoft on 2016. 04. 25..
 */
public class FavoritesPresenter extends Presenter<FavoritesView> {
    @Inject
    public FavoritesInteractor favoritesInteractor;

    public FavoritesPresenter() {
        YoutubeMostPopularApplication.injector.inject(this);
    }

    public void doStuff() {
        view.showFavorites(favoritesInteractor.getFavorite());
    }
}
