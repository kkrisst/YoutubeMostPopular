package n358vu.krisa.youtubemostpopular.interactor;

import dagger.Module;
import dagger.Provides;

/**
 * Created by kkrisst on 24/04/2016.
 */
@Module
public class InteractorModule {
    @Provides
    public StringInteractor getStringInteractor() {
        return new StringInteractor();
    }
}