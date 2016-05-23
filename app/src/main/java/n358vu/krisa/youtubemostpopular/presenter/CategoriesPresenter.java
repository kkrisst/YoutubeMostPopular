package n358vu.krisa.youtubemostpopular.presenter;

import javax.inject.Inject;

import n358vu.krisa.youtubemostpopular.YoutubeMostPopularApplication;
import n358vu.krisa.youtubemostpopular.interactor.CategoryInteractor;
import n358vu.krisa.youtubemostpopular.view.CategoriesView;

/**
 * Created by mobsoft on 2016. 04. 25..
 */
public class CategoriesPresenter extends Presenter<CategoriesView> {
    @Inject
    public CategoryInteractor categoryInteractor;

    public CategoriesPresenter() {
        YoutubeMostPopularApplication.injector.inject(this);
    }

    public void showCategories() {
        try {
            view.showCategories(categoryInteractor.getCategories());
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
