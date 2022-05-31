package com.zachary.utilities.jsonContainers.featContainers;

import java.util.List;

public class Traits {
    private String custom;
    private List<String> value;
    private Rarity rarity;

    public String getCustom() {
        return custom;
    }

    public void setCustom(String custom) {
        this.custom = custom;
    }

    public List<String> getValue() {
        return value;
    }

    public void setValue(List<String> value) {
        this.value = value;
    }

    public Rarity getRarity() {
        return rarity;
    }

    public void setRarity(Rarity rarity) {
        this.rarity = rarity;
    }
}
