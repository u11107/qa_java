package com.example;

import org.junit.Assert;
import org.junit.Test;

public class CreateLionExceptionTest {

    Feline feline = new Feline();

    //Метод ожидает исключения
    @Test
    public void createLionManException() {
        Assert.assertThrows(Exception.class, () -> {
            new Lion("ldnjfgojdogjer", feline);
        });
    }
}
