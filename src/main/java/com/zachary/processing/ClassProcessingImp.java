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

        String fighterData = classDataAccess.getFighterData();
        ClassResponseAPI apiResponse = gson.fromJson(fighterData, ClassResponseAPI.class);

        classData.className = apiResponse.getCharacterClass().getName();
        classData.classRarity = apiResponse.getCharacterClass().getRarity();

        String[] workingAbility = apiResponse.getCharacterClass().getKeyAbility().split(" ");
        for (String ability : workingAbility) {
            if (!ability.equals("or")) {
                classData.keyAbility.add(ability);
            }
        }

        classData.hitPoints = apiResponse.getCharacterClass().getHitPoints();
        classData.perception = proficiencies.proficiencies.get(apiResponse.getCharacterClass().gettPerception());

        classData.savingThrows.put("Fortitude", proficiencies.proficiencies.get(apiResponse.getCharacterClass().gettFortitude()));
        classData.savingThrows.put("Reflex", proficiencies.proficiencies.get(apiResponse.getCharacterClass().gettReflex()));
        classData.savingThrows.put("Will", proficiencies.proficiencies.get(apiResponse.getCharacterClass().gettWill()));

        String[] workingSkill = apiResponse.getCharacterClass().gettSkills().split(" ");
        for (String skill : workingSkill) {

        }

        return classData;
    }
}
