package com.example;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class CreateLionExceptionTest {

    Feline feline = new Feline();

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    //Метод ожидает исключения
    @Test(expected = Exception.class)
    public void CreateLionManException() throws Exception {
        new Lion("qwert", feline);
        thrown.expectMessage("Используйте допустимые значения пола животного - самей или самка");
    }
}
