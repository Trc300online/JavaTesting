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

        assertEquals(" el nombre tretze val realment 13 ", esperat, tretze.intValue());

        assertEquals(" el nombre vint val realment 20 ", 20, vint.intValue());
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
}
