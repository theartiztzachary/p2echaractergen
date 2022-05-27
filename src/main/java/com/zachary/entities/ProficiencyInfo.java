package com.zachary.entities;

import java.util.HashMap;

public class ProficiencyInfo {
    public HashMap<Integer, String> proficiencies;

    public ProficiencyInfo() {
        proficiencies.put(0, "Untrained");
        proficiencies.put(1, "Trained");
    }
}
