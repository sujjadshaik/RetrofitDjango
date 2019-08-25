package com.example.retrofitdjango;

import java.util.ArrayList;

public class ApiUtils {
    private ApiUtils(){}
    public static final String Base_url = "http://10.0.2.2:8000/";
    public static APIService getAPIService(){
        return RetrofitClient.getClient(Base_url).create(APIService.class);
    }
}
