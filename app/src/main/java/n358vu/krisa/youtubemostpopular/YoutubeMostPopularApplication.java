package n358vu.krisa.youtubemostpopular;

import android.app.Application;

import n358vu.krisa.youtubemostpopular.view.ViewModule;

/**
 * Created by kkrisst on 24/04/2016.
 */
public class YoutubeMostPopularApplication extends Application {
    public static YoutubeMostPopularApplicationComponent injector;

    @Override
    public void onCreate() {
        super.onCreate();
        /*if (BuildConfig.FLAVOR.equals("mock")) {
            injector = DaggerMockYoutubeMostPopularApplicationComponent.builder().viewModule(new ViewModule(this)).build();
        }else {*/
            injector = DaggerYoutubeMostPopularApplicationComponent.builder().viewModule(new ViewModule(this)).build();
        //}
    }

}
