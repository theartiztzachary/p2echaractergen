package com.zachary.entities;

import java.util.List;
import java.util.HashMap;

public class ClassData {
    public List<Integer> abilityBoostLevels;
    public List<Integer> generalFeatLevels;
    public List<Integer> skillFeatLevels;
    public List<Integer> ancestryFeatLevels;
    public HashMap<String, String> offensiveProficiencies;
    public HashMap<String, String> defensiveProficiencies;
    public HashMap<String, Integer> generalClassFeatLevels;
    public List<Integer> selectedClassFeatLevels;
    public HashMap<String, Object> classFeatureData;
    public int hp;
    public List<String> keyAbility;
    public String perceptionProficiency;
    public HashMap<String, String> savingThrowsProficiencies;
    public List<Integer> skillIncreaseLevels;
    public List<String> baseTrainedSkills;
    public int additionalTrainedSkills;
}
