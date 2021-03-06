package n358vu.krisa.youtubemostpopular.interactor;

import dagger.Module;
import dagger.Provides;

/**
 * Created by kkrisst on 24/04/2016.
 */
@Module
public class InteractorModule {
    @Provides
    public CategoryInteractor getCategoryInteractor() {
        return new CategoryInteractor();
    }

    @Provides
    public FavoritesInteractor getFavoritesInteractor() {
        return new FavoritesInteractor();
    }

    @Provides
    public VideoListInteractor getVideoListInteractor() {
        return new VideoListInteractor();
    }
}