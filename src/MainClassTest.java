import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass
{
    @Test
    public void testGetLocalNumber()
    {
        System.out.println("getLocalNumber = " + this.getLocalNumber());
        Assert.assertTrue("Error! getLocalNumber is not 14!",this.getLocalNumber() == 14);
    }
}