package com.zachary.unitTests.dataAccessTests;

import com.zachary.testData.ClassInformation;
import org.testng.annotations.Test;
import org.testng.Assert;

import com.zachary.dataAccess.*;
import com.zachary.testData.*;

public class GetClassDataTests {
    ClassDataAccessImp classDataAccess = new ClassDataAccessImp();

    @Test
    public void getFighterDataFromAPISuccess() {
        String fighterData = classDataAccess.getFighterData();
        Assert.assertEquals(fighterData, ClassInformation.fighterClassData);
    }

}
