package Testing9_ExplorantJUnit;

import org.junit.*;
import org.junit.rules.ExpectedException;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class ExplorantJUnitTest {

    @Rule
    public ExpectedException expected = ExpectedException.none();

    @Test(expected = IllegalArgumentException.class)
    public void testetjantIllegalArgumentExceptiontest() {

        throw new IllegalArgumentException();
    }


    @Ignore
    @Test
    public void illegalParamentersTest() {
        expected.expect(IllegalArgumentException.class);

        throw  new IllegalArgumentException();
    }

    @Test
    public void missatgeExepioTest() {
        expected.expect(IllegalArgumentException.class);
        expected.expectMessage("the");

        throw new IllegalArgumentException("the exception");
    }

    @BeforeClass
    public static void executaUnCopPerClasseAbansDeQualsevolTest() {
        System.out.println("abans d'executar qualsevol test, un cop per classe");
    }

    @AfterClass
    public static void executaUnCopDespresDeQualsevolTest() {
        System.out.println("despres d'executar qualsevol test, un cop per classe");
    }

    @Before
    public void executaAbansDeCadaTest() {
        System.out.println("Abans d'executar qualsevol test, per cada test !!!");
    }

    @After
    public void executaDespresDeCadaTest() {
        System.out.println("Despres d'executar qualsevol test, per cada test !!!");
    }

    @Test
    public void assercionsDeJUnit() {
        assertEquals(5, 3+2);

        assertFalse("fals es fals", false);
        assertFalse((3 > 5));

        assertTrue((5 > 3));

        int[] finsA10 = {1,2,3,4,5,6,7,8,9,10};
        int[] primers10 = {2,4,5,6,1,9,7,3,8,10};

        Arrays.sort(primers10);

        assertArrayEquals(finsA10, primers10);

        assertNotNull("Un String buit NO es null", "");
        assertNotNull( "");

        assertNotSame("Un String buit NO es null", "",null);
        assertNotSame("",null);

        assertNull("nomes null es considerat null", null);

        Object obj = null;
        assertSame(obj, null);
    }

    @Test
    public void assertThatAmbHamcrest() {

        assertThat("testetjanet que 4+5 son 9",4+5, is(9));

        assertThat("fals es false", false, equalTo(false));

        assertThat(false, is(false));

        assertThat("true es true", true, equalTo(true));

        assertThat(true, is(true));

        assertThat("Un String buit NO es null", is(not(nullValue())));

        assertThat("Aixo es un text", containsString("un"));

        assertThat("Aixo es un text", endsWith("xt"));

        assertThat("Aixo es un text", startsWith("Ai"));
    }
}
