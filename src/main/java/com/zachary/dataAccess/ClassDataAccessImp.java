package com.zachary.dataAccess;

import com.zachary.utilities.interfaces.ClassDataAccessInt;
import com.zachary.utilities.PathfinderService;

import retrofit2.Retrofit;
import retrofit2.Call;
import retrofit2.converter.scalars.ScalarsConverterFactory;

import java.io.IOException;

public class ClassDataAccessImp implements ClassDataAccessInt {
    private static final Retrofit retrofit = new Retrofit.Builder()
            .addConverterFactory(ScalarsConverterFactory.create())
            .baseUrl("https://wanderersguide.app/api/")
            .build();
    private static final PathfinderService service = retrofit.create(PathfinderService.class);

    private static final String authKey = System.getenv("AUTHKEY");

    @Override
    public String getFighterData() {
        String fighterData = "";
        final Call<String> call = service.classData("fighter", authKey);
        try {
            fighterData = call.execute().body();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        return fighterData;
    }
}
