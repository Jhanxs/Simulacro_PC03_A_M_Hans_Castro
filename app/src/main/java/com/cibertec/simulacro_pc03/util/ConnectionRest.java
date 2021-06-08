package com.cibertec.simulacro_pc03.util;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ConnectionRest {

    private static Retrofit retrofit ;

    private static final String URL = "https://api-cibertec-moviles.herokuapp.com/servicio/";

    public static Retrofit getConnection(){
        if (retrofit == null){
            retrofit = new Retrofit.Builder().baseUrl(URL).addConverterFactory(GsonConverterFactory.create()).build();
        }
        return retrofit;
    }
}
