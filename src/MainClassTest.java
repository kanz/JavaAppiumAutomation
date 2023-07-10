import jdk.nashorn.internal.runtime.regexp.joni.Regex;
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

    @Test
    public void testGetClassNumber()
    {
        System.out.println("getClassNumber = " + this.getClassNumber());
        Assert.assertTrue("Error! getClassNumber cannot be less than 45!", this.getClassNumber() > 45);
    }

    @Test
    public void testClassString() {
        String str = this.getClassString();
        System.out.println(this.getClassString());
        Assert.assertTrue("Error! class_string doesn't contain 'Hello' or 'hello'",str.matches("(.*)[Hh]ello(.*)"));
    }
}