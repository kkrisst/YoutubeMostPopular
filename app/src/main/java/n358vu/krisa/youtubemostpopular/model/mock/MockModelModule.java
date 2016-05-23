package n358vu.krisa.youtubemostpopular.model.mock;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import n358vu.krisa.youtubemostpopular.model.FavoriteModel;
import n358vu.krisa.youtubemostpopular.model.prod.CategoryModel;
import n358vu.krisa.youtubemostpopular.model.prod.VideoListModel;

@Module
public class MockModelModule {

    @Provides
    public VideoListModel getVideoListModel() {
        return new MockVideoListModel();
    }

    @Provides
    @Singleton
    public FavoriteModel getFavoriteModel() {
        return new FavoriteModel();
    }

    @Provides
    public CategoryModel getCategoryModel() {
        return new CategoryModel();
    }

}
