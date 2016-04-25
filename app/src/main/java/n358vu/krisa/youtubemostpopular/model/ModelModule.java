package n358vu.krisa.youtubemostpopular.model;

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
}
