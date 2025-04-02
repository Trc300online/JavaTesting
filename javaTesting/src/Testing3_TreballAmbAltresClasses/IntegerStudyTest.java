package Testing3_TreballAmbAltresClasses;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

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
}
