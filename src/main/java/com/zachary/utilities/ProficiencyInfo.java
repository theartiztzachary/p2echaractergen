package com.zachary.utilities;

import java.util.HashMap;

public class ProficiencyInfo {
    public HashMap<Integer, String> proficiencies;

    public void ProficiencyInfo() {
        proficiencies.put(0, "Untrained");
        proficiencies.put(1, "Trained");
        proficiencies.put(2, "Expert");
        proficiencies.put(3, "Master");
        proficiencies.put(4, "Legendary");
    }
}
