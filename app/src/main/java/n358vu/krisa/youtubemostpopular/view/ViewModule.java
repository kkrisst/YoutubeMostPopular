package n358vu.krisa.youtubemostpopular.view;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import n358vu.krisa.youtubemostpopular.presenter.MainPresenter;

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
    public MainPresenter getMainPresenter() {
        return new MainPresenter();
    }
}