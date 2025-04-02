package Testing3_TreballAmbAltresClasses;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class IntegerStudyTest {

    @Test
    public void IntegerStudy(){
        Integer vuit = new Integer(8);
        Integer vint = new Integer("20");
        Integer tretze = 13;
        int esperat = 13;

        int minim = -2147483648;

        assertEquals(" el nombre tretze val realment 13 ", esperat, tretze.intValue());

        assertEquals(" el nombre vint val realment 20 ", 20, vint.intValue());

        assertEquals( " el valor minim d'un integer es -214748348", minim, Integer.MIN_VALUE);
    }

    @Test
    public void IntegerComparationStudy(){
        Integer vuit = new Integer(8);
        Integer eight = new Integer("8");

        assertEquals(" el nombre vuit val realment 8 ", 8, vuit.intValue());

        assertEquals(" el nombre vuit val realment 8 ", 8, eight.intValue());

        //assertTrue(vuit == eight);

        assertTrue(vuit.equals(eight));
    }

    @Test
    public void BinaryStudy(){
        Integer dos = new Integer(2);
        Integer vint = new Integer("20");
        Integer tretze = 13;

        String tipusPersones = " Hi ha  " + Integer.toBinaryString(dos) + " de perosnes, les  qu eentrene bianri i les que no! ";

        assertEquals( tipusPersones, 2, dos.intValue());

        assertEquals(" el nombre tretze val realment 13 ", 13, tretze.intValue());

        //assertEquals(" el nombre vint val realment 20 ", 20, vint.intValue());
    }
}
