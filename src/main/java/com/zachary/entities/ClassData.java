package com.zachary.entities;

import java.util.ArrayList;
import java.util.HashMap;

public class ClassData {
    public ArrayList<Integer> abilityBoostLevels;
    public ArrayList<Integer> generalFeatLevels;
    public ArrayList<Integer> skillFeatLevels;
    public ArrayList<Integer> ancestryFeatLevels;
    public HashMap<String, String> offensiveProficiencies;
    public HashMap<String, String> defensiveProficiencies;
    public HashMap<Integer, String> classFeatLevels;
    public HashMap<String, String> classFeatures;
    public String fullDescription;
    public int hp;
    public ArrayList<String> keyAbility;
    public HashMap<String, String> perceptionProficiency;
    public HashMap<String, String> savingThrowsProficiencies;
    public ArrayList<Integer> skillIncreaseLevels;
    public ArrayList<String> baseTrainedSkills;
    public int additionalTrainedSkills;
}
