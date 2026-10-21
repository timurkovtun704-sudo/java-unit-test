package org.test;

import org.example.Program;
import org.junit.Assert;
import org.junit.Test;

public class Task_2 {

    boolean expected = false;

    @Test
    public void checkIsAdultWhenAgeIsLessThan18False() {
        Program program = new Program();
        boolean isAdult = program.checkIsAdult(17);
        Assert.assertEquals("Пользователю меньше 18ти лет!", isAdult, expected);
    }
}
