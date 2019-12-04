
import com.colette.Advent;
import org.junit.Assert;
import org.junit.Test;

public class FuelCalculatorTest {
    @Test
    public void testFuelCalcs()
    {

        Assert.assertTrue("test1", Advent.getFuelForMass(12)== 2);
        Assert.assertTrue("test2", Advent.getFuelForMass(14)== 2);
        Assert.assertTrue("test3", Advent.getFuelForMass(1969)== 654);
        Assert.assertFalse("test4", Advent.getFuelForMass(100756)== 654);
        Assert.assertTrue("test5", Advent.getFuelForMass(100756)== 33583);



    }
    @Test
    public void testgetFuelForInitialAndFuel()
    {
        Assert.assertTrue("test12", Advent.getFuelForInitialAndFuel(12)==2);
        Assert.assertTrue("test1969", Advent.getFuelForInitialAndFuel(1969)==966);
        Assert.assertTrue("test12", Advent.getFuelForInitialAndFuel(100756)==50346);

    }


}