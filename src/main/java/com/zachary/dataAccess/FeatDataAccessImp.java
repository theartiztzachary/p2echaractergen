package com.zachary.dataAccess;

import com.zachary.utilities.interfaces.FeatDataAccessInt;
import com.zachary.utilities.PathfinderService;

import retrofit2.Retrofit;
import retrofit2.Call;
import retrofit2.converter.scalars.ScalarsConverterFactory;

import java.io.IOException;

public class FeatDataAccessImp implements FeatDataAccessInt {
    private static final Retrofit retrofit = new Retrofit.Builder()
            .addConverterFactory(ScalarsConverterFactory.create())
            .baseUrl("https://api.pathfinder2.fr/v1/pf2/")
            .build();

    private static final PathfinderService service = retrofit.create(PathfinderService.class);

    private static final String authKey = System.getenv("AUTHKEY");
    @Override
    public String getFighterFeats() {
        String fighterFeatData = "";
        final Call<String> call = service.classFeatData("fighter", authKey);
        try {
            fighterFeatData = call.execute().body();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        return fighterFeatData;
    }
}
