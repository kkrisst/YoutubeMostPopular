package n358vu.krisa.youtubemostpopular.screen;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

import javax.inject.Inject;

import n358vu.krisa.youtubemostpopular.R;
import n358vu.krisa.youtubemostpopular.YoutubeMostPopularApplication;
import n358vu.krisa.youtubemostpopular.presenter.FavoritesPresenter;
import n358vu.krisa.youtubemostpopular.view.FavoritesView;

/**
 * Created by mobsoft on 2016. 04. 25..
 */
public class FavoritesActivity extends Activity implements FavoritesView {
    @Inject
    FavoritesPresenter favoritesPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        YoutubeMostPopularApplication.injector.inject(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
        favoritesPresenter.attachView(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        favoritesPresenter.detachView();
    }

    @Override
    public void showCategories(String s) {
        Toast.makeText(this, s, Toast.LENGTH_LONG).show();
    }
}
