package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionParameterizedDoesHaveManeTest {


    private final String checkedSex;
    private final boolean expectedHasMane;

    public LionParameterizedDoesHaveManeTest(String checkedSex, boolean expectedHasMane) {
        this.checkedSex = checkedSex;
        this.expectedHasMane = expectedHasMane;
    }

    @Parameterized.Parameters
    public static Object[][] getLionData() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
        };
    }

    @Test
    public void doesHaveManeForCorrectValueShowTrueOrFalse() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion(checkedSex, feline);
        boolean actualHasMane = lion.doesHaveMane();
        assertEquals("Метод doesHaveMane() в классе Lion не может определить есть ли грива."
                , expectedHasMane, actualHasMane);
    }

}
