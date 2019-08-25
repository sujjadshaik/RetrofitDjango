package com.example.retrofitdjango;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers("Content-Type: application/json")
    @POST("api/login")
    @FormUrlEncoded
    Call<Login> savepost(@Field("Username") String Username,
                         @Field("Password") String Password);

}
