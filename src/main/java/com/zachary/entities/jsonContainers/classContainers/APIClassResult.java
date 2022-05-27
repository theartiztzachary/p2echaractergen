package com.zachary.entities.jsonContainers.classContainers;

import java.util.List;

public class APIClassResult {
    private int count;
    private List<Result> results;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<Result> getResults() {
        return results;
    }

    public void setResults(List<Result> results) {
        this.results = results;
    }
}
