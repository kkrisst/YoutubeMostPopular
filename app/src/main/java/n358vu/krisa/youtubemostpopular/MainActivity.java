package n358vu.krisa.youtubemostpopular;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import javax.inject.Inject;

import n358vu.krisa.youtubemostpopular.presenter.MainPresenter;
import n358vu.krisa.youtubemostpopular.view.MainView;

public class MainActivity extends AppCompatActivity implements MainView {

    @Inject
    MainPresenter mainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        YoutubeMostPopularApplication.injector.inject(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
        mainPresenter.attachView(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mainPresenter.detachView();
    }

    @Override
    public void showCategories(String s) {
        Toast.makeText(this, s, Toast.LENGTH_LONG).show();
    }
}