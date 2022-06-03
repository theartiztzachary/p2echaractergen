package com.zachary.utilities.jsonContainers.classContainers;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class ClassResponseAPI {
    @SerializedName("class")
    private CharacterClass characterClass;
    @SerializedName("class_features")
    private List<ClassFeat> classFeatures;

    public CharacterClass getCharacterClass() {
        return characterClass;
    }

    public void setCharacterClass(CharacterClass characterClass) {
        this.characterClass = characterClass;
    }

    public List<ClassFeat> getClassFeatures() {
        return classFeatures;
    }

    public void setClassFeatures(List<ClassFeat> classFeatures) {
        this.classFeatures = classFeatures;
    }
}
