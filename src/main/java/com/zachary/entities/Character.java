package com.zachary.entities;
//Superclass meant to hold the general information that every character has.

public class Character {
    public String name;
    public String age;
    public String height;
    public String weight;
    public String background;
    public String backstory;
    public String ancestry;
    public String heritage;
    public int strengthScore;
    public int strengthBonus;
    public int constitutionScore;
    public int constitutionBonus;
    public int dexterityScore;
    public int dexterityBonus;
    public int wisdomScore;
    public int wisdomBonus;
    public int intelligenceScore;
    public int intelligenceBonus;
    public int charismaScore;
    public int charismaBonus;

    public Character(String name, String age, String height, String weight, String background, String backstory, String ancestry) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.background = background;
        this.backstory = backstory;
        this.ancestry = ancestry;
    }
}
