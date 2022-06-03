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

        return featList;
    }

}
