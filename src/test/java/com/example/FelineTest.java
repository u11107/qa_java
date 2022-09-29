package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {


    @Spy
    private Feline feline;


    @Test
    public void eatMeat() throws Exception {
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expected, feline.eatMeat());

    }

    @Test
    public void getFamilyTest() {
        assertEquals(feline.getFamily(), "Кошачьи");
    }

    @Test
    public void getKittensCountTest() {
        assertEquals(feline.getKittens(), 1);
    }

}