package com.zachary.processing;

import com.zachary.dataAccess.ClassDataAccessImp;
import com.zachary.entities.ClassData;
import com.zachary.entities.interfaces.ClassProcessingInt;
import com.zachary.entities.jsonContainers.classContainers.*;

import java.util.List;

import com.google.gson.Gson;


public class ClassProcessingImp implements ClassProcessingInt {
    private ClassDataAccessImp classDataAccess;
    private Gson gson;

    public ClassProcessingImp(ClassDataAccessImp classDataAccess) {
        this.classDataAccess = classDataAccess;
        this.gson = new Gson();
    }

    public ClassData processFighterData() {
        ClassData classData = new ClassData();

        String resultData = classDataAccess.getFighterData();
        APIClassResult apiClassResult = gson.fromJson(resultData, APIClassResult.class);
        List<Result> resultList = apiClassResult.getResults();
        Data individualData = resultList.get(0).getData();

        classData.abilityBoostLevels = individualData.getAbilityBoostLevels().getValue();
        classData.generalFeatLevels = individualData.getGeneralFeatLevels().getValue();
        classData.skillFeatLevels = individualData.getSkillFeatLevels().getValue();
        classData.ancestryFeatLevels = individualData.getAncestryFeatLevels().getValue();

        classData.offensiveProficiencies.put()

        return classData;
    }
}
