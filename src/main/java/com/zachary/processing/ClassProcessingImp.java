package com.zachary.processing;

import com.zachary.entities.ClassData;
import com.zachary.entities.interfaces.ClassProcessingInt;

public class ClassProcessingImp implements ClassProcessingInt {
    private ClassData classData;

    public ClassProcessingImp(ClassData classData) {
        this.classData = classData;
    }
}
