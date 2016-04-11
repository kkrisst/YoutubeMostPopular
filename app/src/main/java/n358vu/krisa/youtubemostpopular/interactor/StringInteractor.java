package n358vu.krisa.youtubemostpopular.interactor;

import javax.inject.Inject;

import n358vu.krisa.youtubemostpopular.YTMostPopApplication;
import n358vu.krisa.youtubemostpopular.model.StringModel;

public class StringInteractor {
    @Inject
    StringModel model;

    public StringInteractor() {
        YTMostPopApplication.injector.inject(this);
    }

    public String getString() {
        return model.getNextString();
    }
}
