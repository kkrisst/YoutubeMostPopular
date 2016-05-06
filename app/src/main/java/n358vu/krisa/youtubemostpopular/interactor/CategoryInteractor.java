package n358vu.krisa.youtubemostpopular.interactor;

import javax.inject.Inject;

import n358vu.krisa.youtubemostpopular.YoutubeMostPopularApplication;
import n358vu.krisa.youtubemostpopular.model.prod.CategoryModel;

/**
 * Created by mobsoft on 2016. 04. 25..
 */
public class CategoryInteractor {
    @Inject
    CategoryModel model;

    public CategoryInteractor() {
        YoutubeMostPopularApplication.injector.inject(this);
    }

    public String getCategory() {
        return model.getNextCategory();
    }
}
