package com.zachary.utilities.jsonContainers.classContainers;

import java.util.List;

public class Traits {
    private String custom;
    private List<Object> value;
    private Rarity rarity;

    public String getCustom() {
        return custom;
    }

    public void setCustom(String custom) {
        this.custom = custom;
    }

    public List<Object> getValue() {
        return value;
    }

    public void setValue(List<Object> value) {
        this.value = value;
    }

    public Rarity getRarity() {
        return rarity;
    }

    public void setRarity(Rarity rarity) {
        this.rarity = rarity;
    }
}
