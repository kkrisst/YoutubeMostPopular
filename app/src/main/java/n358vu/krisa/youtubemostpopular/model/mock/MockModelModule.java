package n358vu.krisa.youtubemostpopular.model.mock;

import dagger.Module;
import dagger.Provides;
import n358vu.krisa.youtubemostpopular.model.prod.CategoryModel;
import n358vu.krisa.youtubemostpopular.model.prod.FavoriteModel;
import n358vu.krisa.youtubemostpopular.model.prod.ModelModule;
import n358vu.krisa.youtubemostpopular.model.prod.VideoListModel;

/**
 * Created by mobsoft on 2016. 05. 06..
 */
@Module
public class MockModelModule {

    @Provides
    public VideoListModel getVideoListModel() {
        return new MockVideoListModel();
    }

    @Provides
    public FavoriteModel getFavoriteModel() {
        return new FavoriteModel();
    }

    @Provides
    public CategoryModel getCategoryModel() {
        return new CategoryModel();
    }

}
