package petr.tests;

import org.testng.Assert;
import org.testng.annotations.*;

@Listeners(petr.tests.Hi.class)
public class Class1Suite1 {

    @Test(enabled = false)
    @Parameters({"x", "y"})
    public void test1(int x, int y) {
        Assert.assertEquals(x, y, "Test1 -faild");}


    @Test
    @Parameters({"x", "y"})
    public void test2(int x, int y) {
        Assert.assertNotEquals(x, y, "Test2 -faild");
    }
}