package com.zachary.entities;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Query;

public interface PathfinderService {
    @GET("class")
    Call<String> classData(@Query("name") String className, @Header("Authorization") String authorization);
}
