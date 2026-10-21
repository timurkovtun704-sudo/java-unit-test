package org.test;
import org.example.Program;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class Task_3_parametr_test {
    private int age;
    private boolean expected;

    public Task_3_parametr_test(int age, boolean expected)
    {
        this.age = age;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] getData()
    {
        return new Object[][]
                {
                        {17, false},
                        {18, true},
                        {19,true},
                        {-1, false},
                        {10000, true},
                };
    }

    @Test
    public void checkIsAdultWhenAgeThenResult()
    {
        Program prog = new Program();
        boolean actual = prog.checkIsAdult(age);
        Assert.assertEquals(expected, actual);
    }
}
