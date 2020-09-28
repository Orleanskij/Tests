package petr.tests;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Class1Suite2 {

    @Test
    @Parameters({"x","y"})
    public void test1(char x, char y) {
        Assert.assertEquals(x, y);
    }
    @Test
    @Parameters({"x","y"})
    public void test2(char x, char y) {
        Assert.assertNotEquals(x, y);
    }

}
