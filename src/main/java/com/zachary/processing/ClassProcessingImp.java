package com.zachary.processing;

import com.zachary.dataAccess.ClassDataAccessImp;
import com.zachary.utilities.ClassData;
import com.zachary.utilities.FeatData;
import com.zachary.utilities.interfaces.ClassProcessingInt;
import com.zachary.utilities.jsonContainers.classContainers.*;
import com.zachary.utilities.ProficiencyInfo;

import java.util.List;
import java.util.Map;

import com.google.gson.Gson;

public class ClassProcessingImp implements ClassProcessingInt {
    private ClassDataAccessImp classDataAccess;
    private FeatProcessingImp featProcessing;
    private Gson gson;
    private ProficiencyInfo proficiencies;


    public ClassProcessingImp(ClassDataAccessImp classDataAccess, FeatProcessingImp featProcessing) {
        this.classDataAccess = classDataAccess;
        this.featProcessing = featProcessing;
        this.gson = new Gson();
        this.proficiencies = new ProficiencyInfo();
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

        classData.offensiveProficiencies.put("Unarmed", proficiencies.proficiencies.get(individualData.getAttacks().getUnarmed()));
        classData.offensiveProficiencies.put("Simple", proficiencies.proficiencies.get(individualData.getAttacks().getSimple()));
        classData.offensiveProficiencies.put("Advanced", proficiencies.proficiencies.get(individualData.getAttacks().getAdvanced()));
        classData.offensiveProficiencies.put("Martial", proficiencies.proficiencies.get(individualData.getAttacks().getMartial()));

        classData.defensiveProficiencies.put("Unarmored", proficiencies.proficiencies.get(individualData.getDefenses().getUnarmored()));
        classData.defensiveProficiencies.put("Light", proficiencies.proficiencies.get(individualData.getDefenses().getLight()));
        classData.defensiveProficiencies.put("Medium", proficiencies.proficiencies.get(individualData.getDefenses().getMedium()));
        classData.defensiveProficiencies.put("Heavy", proficiencies.proficiencies.get(individualData.getDefenses().getHeavy()));

        for (Map<String, String> i : individualData.getItems().values()) {
            classData.generalClassFeatLevels.put(i.get("name"), Integer.valueOf(i.get("level")));
        }

        classData.selectedClassFeatLevels = individualData.getClassFeatLevels().getValue();

        List<FeatData> featList = featProcessing.processFighterFeats();
        for (FeatData feat : featList) {
            classData.classFeatureData.put(feat.name, feat);
        }

        classData.hp = individualData.getHp();

        classData.keyAbility = individualData.getKeyAbility().getValue();

        classData.perceptionProficiency = proficiencies.proficiencies.get(individualData.getPerception());

        classData.savingThrowsProficiencies.put("Fortitude", proficiencies.proficiencies.get(individualData.getSavingThrows().getFortitude()));
        classData.savingThrowsProficiencies.put("Reflex", proficiencies.proficiencies.get(individualData.getSavingThrows().getReflex()));
        classData.savingThrowsProficiencies.put("Will", proficiencies.proficiencies.get(individualData.getSavingThrows().getWill()));

        classData.skillIncreaseLevels = individualData.getSkillIncreaseLevels().getValue();

        classData.baseTrainedSkills.add("Acrobatics");
        classData.baseTrainedSkills.add("Athletics");

        classData.additionalTrainedSkills = individualData.getTrainedSkills().getAdditional();

        return classData;
    }
}
