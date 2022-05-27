package com.zachary.entities.jsonContainers.classContainers;

import java.util.List;

public class Result {
    private String id;
    private List<Object> effects;
    private String name;
    private String type;
    private Data data;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Object> getEffects() {
        return effects;
    }

    public void setEffects(List<Object> effects) {
        this.effects = effects;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }
}
