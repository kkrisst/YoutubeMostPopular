package n358vu.krisa.youtubemostpopular.screen;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

import javax.inject.Inject;

import n358vu.krisa.youtubemostpopular.R;
import n358vu.krisa.youtubemostpopular.YoutubeMostPopularApplication;
import n358vu.krisa.youtubemostpopular.presenter.CategoriesPresenter;
import n358vu.krisa.youtubemostpopular.view.CategoriesView;

/**
 * Created by mobsoft on 2016. 04. 25..
 */
public class CategoriesActivity extends Activity implements CategoriesView {
    @Inject
    CategoriesPresenter categoriesPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);

        YoutubeMostPopularApplication.injector.inject(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
        categoriesPresenter.attachView(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        categoriesPresenter.detachView();
    }

    @Override
    public void showCategories(String s) {
        Toast.makeText(this, s, Toast.LENGTH_LONG).show();
    }
}
