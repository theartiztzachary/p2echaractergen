package com.zachary.processing;

import com.zachary.dataAccess.FeatDataAccessImp;
import com.zachary.utilities.FeatData;
import com.zachary.utilities.interfaces.FeatProcessingInt;
import com.zachary.utilities.jsonContainers.featContainers.*;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

public class FeatProcessingImp implements FeatProcessingInt {

    private FeatDataAccessImp featDataAccess;
    private Gson gson;

    public FeatProcessingImp(FeatDataAccessImp featDataAccess) {
        this.featDataAccess = featDataAccess;
        this.gson = new Gson();
    }

    public List<FeatData> processFighterFeats() {
        List<FeatData> featList = new ArrayList<>();

        String resultData = featDataAccess.getFighterFeats();
        APIFeatResult apiFeatResult = gson.fromJson(resultData, APIFeatResult.class);
        List<Result> resultList = apiFeatResult.getResults();

        for (Result result : resultList) {
            FeatData currentFeat = new FeatData();

            currentFeat.name = result.getName();
            currentFeat.description = result.getData().getDescription().getValue();
            currentFeat.actionType = result.getData().getActionType().getValue();

            try {
                currentFeat.actionCount  = result.getData().getActions().getValue();
            } catch (NullPointerException exception) {
                currentFeat.actionCount = 0;
            }

            currentFeat.level = result.getData().getLevel().getValue();

            currentFeat.traits.add(result.getData().getTraits().getRarity().getValue());
            currentFeat.traits.addAll(result.getData().getTraits().getValue());

            featList.add(currentFeat);
        }

        return featList;
    }

}
