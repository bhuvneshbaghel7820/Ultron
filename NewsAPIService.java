import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface NewsAPIService {
    @GET("v2/top-headlines")
    Call<NewsResponse> getTopHeadlines(@Query("country") String country, @Query("apiKey") String apiKey);

    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://newsapi.org/")
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    NewsAPIService service = retrofit.create(NewsAPIService.class);
}
