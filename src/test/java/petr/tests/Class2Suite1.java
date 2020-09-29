package petr.tests;


import com.ctc.wstx.exc.WstxOutputException;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


//@Listeners(petr.tests.Hi.class)
public class Class2Suite1 {
    @BeforeTest()
    @Test(enabled = false)
    @Parameters({"x","y"})
    public void test1(String x, String y) {
        Assert.assertEquals(x,y,"Test1- faild");
    }


    @Test
    @Parameters({"x","y"})
    public void test2(String x, String y) {
       Assert.assertNotEquals(x,y,"Test2-faild");
    }

}
