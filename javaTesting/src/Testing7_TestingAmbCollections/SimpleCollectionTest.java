package Testing7_TestingAmbCollections;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SimpleCollectionTest {

    @Test
    public void firstColletionTest() {
        String[] nombres = {"zero", "un", "dos", "tres"};

        List<String> numerals = new ArrayList<>();

        for (String s : nombres) {
            numerals.add(s);
        }

        numerals.add("quatre");

        assertTrue(numerals.size() == 5);

        List<String> llistaNumeros = Arrays.asList(nombres);

        //llistaNumeros.add("quatre");

        assertTrue(llistaNumeros.size() == 4);
    }

    @Test
    public void diesSetmana() {
        List<String> diesSetmana = new ArrayList<>();
        List<String> diesFeina = new ArrayList<>();
        List<String> diesCapDeSetmana = new ArrayList<>();

        initDiesFeiners(diesFeina);

        assertTrue(diesFeina.size() == 5);

        assertEquals(0, diesSetmana.size());
        assertFalse(diesSetmana.containsAll(diesFeina));

        diesSetmana.addAll(diesFeina);

        assertEquals(5, diesSetmana.size());
        assertTrue(diesSetmana.containsAll(diesFeina));

        diesCapDeSetmana.add("dissabte");
        diesCapDeSetmana.add("diumenge");

        diesSetmana.addAll(diesCapDeSetmana);

        assertEquals(7, diesSetmana.size());
        assertTrue(diesSetmana.containsAll(diesCapDeSetmana));
    }

    public void initDiesFeiners(List<String> dies) {
        dies.add("dilluns");
        dies.add("dimarts");
        dies.add("dimecres");
        dies.add("dijous");
        dies.add("divendres");

    }
}
