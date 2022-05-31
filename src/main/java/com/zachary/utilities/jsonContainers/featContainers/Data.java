package com.zachary.utilities.jsonContainers.featContainers;

import java.util.List;

public class Data {
    private List<Object> rules;
    private ActionCategory actionCategory;
    private ActionType actionType;
    private Actions actions;
    private Description description;
    private FeatType featType;
    private Level level;
    private Prerequisites prerequisites;
    private Source source;
    private Traits traits;

    public List<Object> getRules() {
        return rules;
    }

    public void setRules(List<Object> rules) {
        this.rules = rules;
    }

    public ActionCategory getActionCategory() {
        return actionCategory;
    }

    public void setActionCategory(ActionCategory actionCategory) {
        this.actionCategory = actionCategory;
    }

    public ActionType getActionType() {
        return actionType;
    }

    public void setActionType(ActionType actionType) {
        this.actionType = actionType;
    }

    public Actions getActions() {
        return actions;
    }

    public void setActions(Actions actions) {
        this.actions = actions;
    }

    public Description getDescription() {
        return description;
    }

    public void setDescription(Description description) {
        this.description = description;
    }

    public FeatType getFeatType() {
        return featType;
    }

    public void setFeatType(FeatType featType) {
        this.featType = featType;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public Prerequisites getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(Prerequisites prerequisites) {
        this.prerequisites = prerequisites;
    }

    public Source getSource() {
        return source;
    }

    public void setSource(Source source) {
        this.source = source;
    }

    public Traits getTraits() {
        return traits;
    }

    public void setTraits(Traits traits) {
        this.traits = traits;
    }
}
