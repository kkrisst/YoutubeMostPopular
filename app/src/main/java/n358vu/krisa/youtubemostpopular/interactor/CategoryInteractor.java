package n358vu.krisa.youtubemostpopular.interactor;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import n358vu.krisa.youtubemostpopular.YoutubeMostPopularApplication;
import n358vu.krisa.youtubemostpopular.model.Category;
import n358vu.krisa.youtubemostpopular.model.CategoryModel;

import n358vu.krisa.youtubemostpopular.model.CategoryResult;
import n358vu.krisa.youtubemostpopular.network.NetworkConfig;
import n358vu.krisa.youtubemostpopular.network.YoutubeApi;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.GsonConverterFactory;

public class CategoryInteractor {

    @Inject
    YoutubeApi youtubeApi;

    public CategoryInteractor() {
        YoutubeMostPopularApplication.injector.inject(this);
    }

    public List<Category> getCategories() throws Exception {
        Response<CategoryResult> response = null;

        Call<CategoryResult> call = youtubeApi.categoryListGet("snippet", "US", NetworkConfig.API_KEY);

        try {
            response = call.execute();
        } catch (Exception e) {
            System.out.println(e.toString());
            throw new Exception("Network error on execute with get!");
        }
        if (response.code() != 200) {
            throw new Exception("Network error with get!");
        }

        return response.body().getItems();

    }

}
