package com.zachary.utilities.jsonContainers.featContainers;

import java.util.List;

public class APIFeatResult {
    private Long count;
    private List<Result> results;

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public List<Result> getResults() {
        return results;
    }

    public void setResults(List<Result> results) {
        this.results = results;
    }
}
