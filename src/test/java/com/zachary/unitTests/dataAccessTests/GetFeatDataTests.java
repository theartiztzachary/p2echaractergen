//package com.zachary.unitTests.dataAccessTests;
//
//import org.testng.annotations.Test;
//import org.testng.Assert;
//
//import com.zachary.dataAccess.*;
//
//import java.io.FileInputStream;
//import java.io.IOException;
//import java.nio.charset.StandardCharsets;
//
//import org.apache.commons.io.IOUtils;
//
//public class GetFeatDataTests {
//    FeatDataAccessImp featDataAccess = new FeatDataAccessImp();
//
//    @Test
//    public void getFighterFeatDataSuccess() throws IOException {
//        String result = featDataAccess.getFighterFeats();
//        FileInputStream fis = new FileInputStream("src/test/resources/fighterFeatData.txt");
//        String fighterFeatData = IOUtils.toString(fis, StandardCharsets.UTF_8);
//        Assert.assertEquals(result, fighterFeatData);
//    }
//}
