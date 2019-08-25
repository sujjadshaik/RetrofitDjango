package com.example.retrofitdjango;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class MainActivity extends AppCompatActivity {
    private APIService apiService;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        apiService = ApiUtils.getAPIService();
    }

    public void Login(View view) {
        apiService.savepost("sujjathuddin@yahoo.com","1234").enqueue(new Callback<Login>() {
            @Override
            public void onResponse(Call<Login> call, Response<Login> response) {
                if (response.isSuccessful()){
                    Toast.makeText(MainActivity.this, response.body().toString(), Toast.LENGTH_SHORT).show();
                    Log.i("response",response.body().toString());
                }else{
                    Toast.makeText(MainActivity.this, "Enable to login", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<Login> call, Throwable t) {
                Toast.makeText(MainActivity.this, "Error :)", Toast.LENGTH_SHORT).show();

            }
        });


    }

    public void Get_Token(View view) {

    }
}
