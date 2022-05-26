package com.zachary.unitTests.dataAccessTests;

import org.testng.annotations.Test;
import org.testng.Assert;

import com.zachary.dataAccess.*;
import com.zachary.unitTests.testData.*;

public class GetClassDataTests {
    ClassDataAccessImp classDataAccess = new ClassDataAccessImp();

    @Test
    public void getFighterDataFromAPISuccess() {
        String fighterData = classDataAccess.getFighterData();
        Assert.assertEquals(fighterData, ClassInformation.fighterClassData);
    }
    
}
