package n358vu.krisa.youtubemostpopular;

import android.app.Application;

import com.crashlytics.android.Crashlytics;
import io.fabric.sdk.android.Fabric;
import n358vu.krisa.youtubemostpopular.view.ViewModule;

import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.analytics.Tracker;


/**
 * Created by kkrisst on 24/04/2016.
 */
public class YoutubeMostPopularApplication extends Application {
    public static YoutubeMostPopularApplicationComponent injector;

    private Tracker mTracker;


    @Override
    public void onCreate() {
        super.onCreate();
        Fabric.with(this, new Crashlytics());
        injector = DaggerYoutubeMostPopularApplicationComponent.builder().viewModule(new ViewModule(this)).build();
    }

    synchronized public Tracker getDefaultTracker() {
        if (mTracker == null) {
            GoogleAnalytics analytics = GoogleAnalytics.getInstance(this);
            // To enable debug logging use: adb shell setprop log.tag.GAv4 DEBUG
            mTracker = analytics.newTracker(R.xml.global_tracker);
        }
        return mTracker;
    }

}
