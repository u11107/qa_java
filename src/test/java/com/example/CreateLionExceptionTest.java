package com.example;

import org.junit.Assert;
import org.junit.Test;

public class CreateLionExceptionTest {

    Feline feline = new Feline();

    //Метод ожидает исключения
    @Test
    public void createLionManException() {
        Assert.assertThrows("Используйте допустимые значения пола животного - самей или самка",
                Exception.class, () -> {
                    throw new Exception("Используйте допустимые значения пола животного - самей или самка");
                }
        );
    }
}
