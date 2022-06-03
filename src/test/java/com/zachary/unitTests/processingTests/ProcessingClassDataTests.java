//package com.zachary.unitTests.processingTests;
//
//import org.apache.commons.io.IOUtils;
//import org.testng.annotations.Test;
//import org.testng.Assert;
//import org.testng.annotations.BeforeClass;
//
//import org.mockito.Mockito;
//import org.mockito.internal.verification.VerificationModeFactory;
//
//import com.zachary.testData.ClassInformation;
//import com.zachary.dataAccess.*;
//import com.zachary.processing.*;
//import com.zachary.utilities.*;
//
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//import java.nio.charset.StandardCharsets;
//
//public class ProcessingClassDataTests {
//    public static ClassDataAccessImp classDataAccess;
//    public static FeatDataAccessImp featDataAccess;
//    public static FeatProcessingImp featProcessing;
//    public static ClassProcessingImp classProcessing;
//
//    @BeforeClass
//    public void setup() {
//        classDataAccess = Mockito.mock(ClassDataAccessImp.class);
//        featDataAccess = Mockito.mock(FeatDataAccessImp.class);
//        featProcessing = new FeatProcessingImp(featDataAccess);
//        classProcessing = new ClassProcessingImp(classDataAccess, featProcessing);
//
//    }
//
//
//    @Test
//    public void processFighterDataSuccess() throws IOException {
//        FileInputStream fis = new FileInputStream("src/test/resources/fighterFeatData.txt");
//        String fighterFeatData = IOUtils.toString(fis, StandardCharsets.UTF_8);
//
//        Mockito.doReturn(ClassInformation.fighterClassData).when(classDataAccess).getFighterData();
//        Mockito.doReturn(fighterFeatData).when(featDataAccess).getFighterFeats();
//
//        ClassData fighterData = classProcessing.processFighterData();
//        Assert.assertEquals(fighterData.abilityBoostLevels.get(0), 5);
//        Assert.assertEquals(fighterData.generalFeatLevels.get(0), 3);
//        Assert.assertEquals(fighterData.skillFeatLevels.get(0), 2);
//        Assert.assertEquals(fighterData.ancestryFeatLevels.get(0), 1);
//        Assert.assertEquals(fighterData.offensiveProficiencies.get("Unarmed"), "Expert");
//        Assert.assertEquals(fighterData.defensiveProficiencies.get("Unarmored"), "Trained");
//        Assert.assertEquals(fighterData.generalClassFeatLevels.get("Attack of Opportunity"), 1);
//        Assert.assertEquals(fighterData.selectedClassFeatLevels.get(0), 1);
//        Assert.assertEquals(fighterData.classFeatureData.get("Attack of Opportunity (Fighter)").description, ClassInformation.attackOfOpp().description);
//        Assert.assertEquals(fighterData.hp, 10);
//        Assert.assertEquals(fighterData.keyAbility.get(0), "Strength");
//        Assert.assertEquals(fighterData.perceptionProficiency, "Expert");
//        Assert.assertEquals(fighterData.savingThrowsProficiencies.get("Will"), "Trained");
//        Assert.assertEquals(fighterData.skillIncreaseLevels.get(0), 3);
//        Assert.assertEquals(fighterData.baseTrainedSkills.get(0), "Acrobatics");
//        Assert.assertEquals(fighterData.additionalTrainedSkills, 3);
//    }
//
//}
