package org.test;

import org.example.Program;
import org.junit.Assert;
import org.junit.Test;

public class Task_2_1 {
    boolean expected = true;
    @Test
    public void checkIsAdultWhenAgeIs18True()
    {
        Program program = new Program();
        boolean isAdult = program.checkIsAdult(18);
        Assert.assertEquals("Пользователю меньше 18ти лет!",isAdult, expected);
    }
}

