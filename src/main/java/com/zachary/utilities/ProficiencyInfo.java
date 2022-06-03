package com.zachary.utilities;

import java.util.HashMap;

public class ProficiencyInfo {
    public HashMap<String, String> proficiencies;

    public ProficiencyInfo() {
        proficiencies.put("U", "Untrained");
        proficiencies.put("T", "Trained");
        proficiencies.put("E", "Expert");
        proficiencies.put("M", "Master");
        proficiencies.put("L", "Legendary");
    }
}
