package javaTest;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SumTest_PrimerTest {

    @Test
    public void sumTest(){
        int r =  1 + 1;

        assertEquals(" 1 + 1 = 2 ", 2 ,r);
    }
}
