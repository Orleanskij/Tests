package petr.tests;


import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Class2Suite2 {

    @Test
    @Parameters({"x","y"})
    public void test1(boolean x, boolean y) {
        Assert.assertEquals(x, y);
    }
    @Test
    @Parameters({"x","y"})
    public void test2(boolean x, boolean y) {
        Assert.assertNotEquals(x, y);
    }

}
