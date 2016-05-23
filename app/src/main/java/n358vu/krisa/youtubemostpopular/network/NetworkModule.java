package n358vu.krisa.youtubemostpopular.network;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;
import retrofit2.GsonConverterFactory;

/**
 * Created by kkrisst on 23/05/2016.
 */
@Module
public class NetworkModule {
    @Provides
    @Singleton
    public Retrofit provideRetrofit() {
        return new Retrofit.Builder()
                .baseUrl(NetworkConfig.ENDPOINT_ADDRESS)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    @Provides
    @Singleton
    public YoutubeApi provideYoutubeApi(Retrofit retrofit) {
        return retrofit.create(YoutubeApi.class);
    }
}
