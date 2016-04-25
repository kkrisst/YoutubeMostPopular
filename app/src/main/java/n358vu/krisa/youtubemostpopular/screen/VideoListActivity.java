package n358vu.krisa.youtubemostpopular.screen;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import javax.inject.Inject;

import n358vu.krisa.youtubemostpopular.R;
import n358vu.krisa.youtubemostpopular.YoutubeMostPopularApplication;
import n358vu.krisa.youtubemostpopular.presenter.VideoListPresenter;
import n358vu.krisa.youtubemostpopular.view.VideoListView;

/**
 * Created by mobsoft on 2016. 04. 25..
 */
public class VideoListActivity extends AppCompatActivity implements VideoListView {

    @Inject
    VideoListPresenter videoListPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_videolist);

        YoutubeMostPopularApplication.injector.inject(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
        videoListPresenter.attachView(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        videoListPresenter.detachView();
    }

    @Override
    public void showCategories(String s) {
        Toast.makeText(this, s, Toast.LENGTH_LONG).show();
    }
}