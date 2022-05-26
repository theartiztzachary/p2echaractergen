package com.zachary.dataAccess;

import com.zachary.entities.interfaces.ClassDataAccessInt;

import com.zachary.entities.PathfinderService;

import retrofit2.Retrofit;
import retrofit2.Call;

import retrofit2.converter.scalars.ScalarsConverterFactory;

import java.io.IOException;

public class ClassDataAccessImp implements ClassDataAccessInt {
    private static final Retrofit retrofit = new Retrofit.Builder()
            .addConverterFactory(ScalarsConverterFactory.create())
            .baseUrl("https://api.pathfinder2.fr/v1/pf2/")
            .build();
    private static final PathfinderService service = retrofit.create(PathfinderService.class);

    private static final String authKey = System.getenv("AUTHKEY");

    @Override
    public String getFighterData() {
        String fighterData = "";
        final Call<String> call = service.classData("Fighter", authKey);
        try {
            fighterData = call.execute().body();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        return fighterData;
    }
}
