package com.zachary.unitTests.processingTests;

import com.zachary.testData.ClassInformation;
import org.testng.annotations.Test;
import org.testng.Assert;

import com.zachary.dataAccess.*;
import com.zachary.processing.*;
import com.zachary.entities.*;
import com.zachary.testData.*;

public class ProcessingClassDataTests {
    ClassDataAccessImp classDataAccess = new ClassDataAccessImp();
    ClassProcessingImp classProcessing = new ClassProcessingImp(classDataAccess);

    @Test
    public void processFighterDataSuccess() {
        ClassData fighterData = classProcessing.processFighterData();
        Assert.assertEquals(fighterData.abilityBoostLevels.get(0), 5);
        Assert.assertEquals(fighterData.generalFeatLevels.get(0), 3);
        Assert.assertEquals(fighterData.skillFeatLevels.get(0), 2);
        Assert.assertEquals(fighterData.ancestryFeatLevels.get(0), 1);
        Assert.assertEquals(fighterData.offensiveProficiencies.get("Unarmed"), "Expert");
        Assert.assertEquals(fighterData.defensiveProficiencies.get("Unarmored"), "Trained");
        Assert.assertEquals(fighterData.generalClassFeatLevels.get("Attack of Opportunity"), 1);
        Assert.assertEquals(fighterData.selectedClassFeatLevels.get(0), 1);
        Assert.assertEquals(fighterData.classFeatureData.get("Attack of Opportunity"), ClassInformation.attackOfOpp);
        Assert.assertEquals(fighterData.hp, 10);
        Assert.assertEquals(fighterData.keyAbility.get(0), "Strength");
        Assert.assertEquals(fighterData.perceptionProficiency, "Expert");
        Assert.assertEquals(fighterData.savingThrowsProficiencies.get("Will"), "Trained");
        Assert.assertEquals(fighterData.skillIncreaseLevels.get(0), 3);
        Assert.assertEquals(fighterData.baseTrainedSkills.get(0), "Acrobatics");
        Assert.assertEquals(fighterData.additionalTrainedSkills, 3);
    }

}
