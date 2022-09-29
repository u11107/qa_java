package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;
@RunWith(MockitoJUnitRunner.class)
public class AnimalTest {

    @Spy
    Animal animal;

    @Test
    public void getFood() throws Exception {
        List<String> expectedPredator = List.of("Животные", "Птицы", "Рыба");
        List<String> expectedHerbivore = List.of("Трава", "Различные растения");
        assertEquals(expectedPredator, animal.getFood("Хищник"));
        assertEquals(expectedHerbivore, animal.getFood("Травоядное"));
    }

    @Test
    public void getFamily() {
        String expected = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
        assertEquals("Метод возратил не верную строку", expected, animal.getFamily());
    }
}