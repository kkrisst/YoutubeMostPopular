package n358vu.krisa.youtubemostpopular.interactor;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import n358vu.krisa.youtubemostpopular.presenter.MainPresenter;

@Module
public class InteractorModule {
    @Provides
    public StringInteractor getStringInteractor() {
        return new StringInteractor();
    }
}
