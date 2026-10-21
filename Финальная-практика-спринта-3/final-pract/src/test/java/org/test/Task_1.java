package org.test;
import org.example.Program;
import org.junit.Assert;
import org.junit.Test;
public class Task_1 {
    boolean expected = true;
    @Test
    public void checkIsAdultWhenAgeIsMoreThan18True() {
        Program program = new Program();
        boolean isAdult = program.checkIsAdult(19);
        Assert.assertEquals("Пользователю меньше 18ти лет.", isAdult, expected);
    }
}
