package com.kuro.daksh.retrologin.POJO;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class APIClient {
    private static Retrofit retrofit;
    static Retrofit getClient(){
        HttpLoggingInterceptor intercerptor = new HttpLoggingInterceptor();
        intercerptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient client = new OkHttpClient.Builder().addInterceptor(intercerptor).build();
        retrofit = new Retrofit.Builder().baseUrl("https://reqres.in/")
                .addConverterFactory(GsonConverterFactory.create())
                .client(client)
                .build();
        return retrofit;
    };
}
