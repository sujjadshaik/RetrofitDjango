package com.example.retrofitdjango;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Login {
    public Login(String token) {
        Token = token;
    }

    @SerializedName("Username")
    @Expose
    private String Token;

    public String getToken() {
        return Token;
    }

    public void setToken(String token) {
        Token = token;
    }
}
