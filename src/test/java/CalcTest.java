import org.testng.Assert;
import org.testng.annotations.Test;

public class CalcTest {
    private Calc calc = new Calc();

    @Test
    public void testSum() throws Exception{
      Assert.assertEquals(5,calc.sum(3,2));
    }

    @Test
    public void testSubstract() throws Exception{
        Assert.assertEquals(3, calc.substract(10,7));
    }

    @Test
    public void testMul() throws Exception{
        Assert.assertEquals(56, calc.mul(7,8));
    }

    @Test
    public void testDiv() throws Exception{
        Assert.assertEquals(5, calc.div(50,10));
    }

}
