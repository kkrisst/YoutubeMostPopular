package n358vu.krisa.youtubemostpopular.model.prod;

import dagger.Module;
import dagger.Provides;
import n358vu.krisa.youtubemostpopular.model.FavoriteModel;

/**
 * Created by kkrisst on 24/04/2016.
 */
@Module
public class ModelModule {
    @Provides
    public n358vu.krisa.youtubemostpopular.model.CategoryModel getCategoryModel() {
        return new n358vu.krisa.youtubemostpopular.model.CategoryModel();
    }

    @Provides
    public n358vu.krisa.youtubemostpopular.model.FavoriteModel getFavoriteModel() {
        return new FavoriteModel();
    }

    @Provides
    public VideoListModel getVideoListModel() {
        return new VideoListModel();
    }
}
