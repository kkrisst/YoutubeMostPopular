package n358vu.krisa.youtubemostpopular.network;

import java.util.List;

import n358vu.krisa.youtubemostpopular.model.CategoryResult;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by kkrisst on 23/05/2016.
 */
public interface YoutubeApi {

    /**
     *
     *
     * @return Call<CategoryResult>
     */
    @GET("videoCategories")
    Call<CategoryResult> categoryListGet(@Query("part") String part,
                                         @Query("regionCode") String regionCode,
                                         @Query("key") String key);


}