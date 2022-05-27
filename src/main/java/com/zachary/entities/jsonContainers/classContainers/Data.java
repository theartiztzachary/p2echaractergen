package com.zachary.entities.jsonContainers.classContainers;

import java.util.List;
import java.util.Map;

public class Data {
    private int classDC;
    private int hp;
    private int perception;
    private List<Object> rules;
    private AbilityBoostLevels abilityBoostLevels;
    private AncestryFeatLevels ancestryFeatLevels;
    private Attacks attacks;
    private ClassFeatLevels classFeatLevels;
    private Defenses defenses;
    private Description description;
    private GeneralFeatLevels generalFeatLevels;
    private Map<String, Map<String, String>> items;
    private KeyAbility keyAbility;
    private SavingThrows savingThrows;
    private SkillFeatLevels skillFeatLevels;
    private SkillIncreaseLevels skillIncreaseLevels;
    private Source source;
    private TrainedSkills trainedSkills;
    private Traits traits;

    public int getClassDC() {
        return classDC;
    }

    public void setClassDC(int classDC) {
        this.classDC = classDC;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getPerception() {
        return perception;
    }

    public void setPerception(int perception) {
        this.perception = perception;
    }

    public List<Object> getRules() {
        return rules;
    }

    public void setRules(List<Object> rules) {
        this.rules = rules;
    }

    public AbilityBoostLevels getAbilityBoostLevels() {
        return abilityBoostLevels;
    }

    public void setAbilityBoostLevels(AbilityBoostLevels abilityBoostLevels) {
        this.abilityBoostLevels = abilityBoostLevels;
    }

    public AncestryFeatLevels getAncestryFeatLevels() {
        return ancestryFeatLevels;
    }

    public void setAncestryFeatLevels(AncestryFeatLevels ancestryFeatLevels) {
        this.ancestryFeatLevels = ancestryFeatLevels;
    }

    public Attacks getAttacks() {
        return attacks;
    }

    public void setAttacks(Attacks attacks) {
        this.attacks = attacks;
    }

    public ClassFeatLevels getClassFeatLevels() {
        return classFeatLevels;
    }

    public void setClassFeatLevels(ClassFeatLevels classFeatLevels) {
        this.classFeatLevels = classFeatLevels;
    }

    public Defenses getDefenses() {
        return defenses;
    }

    public void setDefenses(Defenses defenses) {
        this.defenses = defenses;
    }

    public Description getDescription() {
        return description;
    }

    public void setDescription(Description description) {
        this.description = description;
    }

    public GeneralFeatLevels getGeneralFeatLevels() {
        return generalFeatLevels;
    }

    public void setGeneralFeatLevels(GeneralFeatLevels generalFeatLevels) {
        this.generalFeatLevels = generalFeatLevels;
    }

    public Map<String, Map<String, String>> getItems() {
        return items;
    }

    public void setItems(Map<String, Map<String, String>> items) {
        this.items = items;
    }

    public KeyAbility getKeyAbility() {
        return keyAbility;
    }

    public void setKeyAbility(KeyAbility keyAbility) {
        this.keyAbility = keyAbility;
    }

    public SavingThrows getSavingThrows() {
        return savingThrows;
    }

    public void setSavingThrows(SavingThrows savingThrows) {
        this.savingThrows = savingThrows;
    }

    public SkillFeatLevels getSkillFeatLevels() {
        return skillFeatLevels;
    }

    public void setSkillFeatLevels(SkillFeatLevels skillFeatLevels) {
        this.skillFeatLevels = skillFeatLevels;
    }

    public SkillIncreaseLevels getSkillIncreaseLevels() {
        return skillIncreaseLevels;
    }

    public void setSkillIncreaseLevels(SkillIncreaseLevels skillIncreaseLevels) {
        this.skillIncreaseLevels = skillIncreaseLevels;
    }

    public Source getSource() {
        return source;
    }

    public void setSource(Source source) {
        this.source = source;
    }

    public TrainedSkills getTrainedSkills() {
        return trainedSkills;
    }

    public void setTrainedSkills(TrainedSkills trainedSkills) {
        this.trainedSkills = trainedSkills;
    }

    public Traits getTraits() {
        return traits;
    }

    public void setTraits(Traits traits) {
        this.traits = traits;
    }
}
