package n358vu.krisa.youtubemostpopular.model.prod;

import dagger.Module;
import dagger.Provides;

/**
 * Created by kkrisst on 24/04/2016.
 */
@Module
public class ModelModule {
    @Provides
    public CategoryModel getCategoryModel() {
        return new CategoryModel();
    }

    @Provides
    public FavoriteModel getFavoriteModel() {
        return new FavoriteModel();
    }

    @Provides
    public VideoListModel getVideoListModel() {
        return new VideoListModel();
    }
}
