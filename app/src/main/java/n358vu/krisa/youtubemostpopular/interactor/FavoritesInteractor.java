package n358vu.krisa.youtubemostpopular.interactor;

import javax.inject.Inject;

import n358vu.krisa.youtubemostpopular.YoutubeMostPopularApplication;
import n358vu.krisa.youtubemostpopular.model.FavoriteModel;

/**
 * Created by kkrisst on 05/05/2016.
 */
public class FavoritesInteractor {

    @Inject
    FavoriteModel model;

    public FavoritesInteractor() {
        YoutubeMostPopularApplication.injector.inject(this);
    }

    public String getFavorite() {
        return model.getNextFavorite();
    }

}
