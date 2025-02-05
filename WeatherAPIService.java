public interface WeatherAPIService {

    @GET("data/2.5/weather")
    Call<WeatherResponse> getWeather(@Query("q") String city, @Query("appid") String apiKey, @Query("units") String units);

    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://api.openweathermap.org/")
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    WeatherAPIService service = retrofit.create(WeatherAPIService.class);
}
