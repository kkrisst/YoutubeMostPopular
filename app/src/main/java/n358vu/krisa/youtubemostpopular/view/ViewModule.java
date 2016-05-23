package n358vu.krisa.youtubemostpopular.view;

import android.content.Context;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import n358vu.krisa.youtubemostpopular.di.Network;
import n358vu.krisa.youtubemostpopular.presenter.CategoriesPresenter;
import n358vu.krisa.youtubemostpopular.presenter.FavoritesPresenter;
import n358vu.krisa.youtubemostpopular.presenter.VideoListPresenter;

/**
 * Created by kkrisst on 24/04/2016.
 */
@Module
public class ViewModule {
    private Context context;

    public ViewModule(Context context) {
        this.context = context;
    }

    @Provides
    public Context provideContext() {
        return context;
    }

    @Provides
    @Singleton
    public VideoListPresenter getVideoListPresenter() {
        return new VideoListPresenter();
    }

    @Provides
    @Singleton
    public CategoriesPresenter getCategoriesPresenter() {
        return new CategoriesPresenter();
    }

    @Provides
    @Singleton
    public FavoritesPresenter getFavoritesPresenter() {
        return new FavoritesPresenter();
    }

    @Provides
    @Singleton
    @Network
    public Executor provideNetworkExecutor() {
        return Executors.newFixedThreadPool(1);
    }
}