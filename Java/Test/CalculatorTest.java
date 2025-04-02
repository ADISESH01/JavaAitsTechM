package Test;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class CalculatorTest {
    @Test
    public void testAdd()
    {
        Calculator calculator=new Calculator();
        int res=calculator.add(5,3);
        assertEquals(8,res);
    }
}
    

