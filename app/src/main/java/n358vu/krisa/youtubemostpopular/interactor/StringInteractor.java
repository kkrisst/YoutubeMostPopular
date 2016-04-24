package n358vu.krisa.youtubemostpopular.interactor;

import javax.inject.Inject;

import n358vu.krisa.youtubemostpopular.YoutubeMostPopularApplication;
import n358vu.krisa.youtubemostpopular.model.CategoryModel;

/**
 * Created by kkrisst on 24/04/2016.
 */
public class StringInteractor {
    @Inject
    CategoryModel model;

    public StringInteractor() {
        YoutubeMostPopularApplication.injector.inject(this);
    }

    public String getString() {
        return model.getNextCategory();
    }
}