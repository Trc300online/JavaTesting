package Testing7_TestingAmbCollections;

import org.junit.Test;

import java.util.*;

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
        List<String> diesSenars = new ArrayList<>();
        List<String> calculDies = new ArrayList<>();


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

        diesSenars.addAll(diesSetmana);

        assertTrue(diesSenars.contains("dimarts"));

        diesSenars.remove(1);

        assertFalse(diesSenars.contains("dimarts"));

        diesSenars.remove("dijous");

        assertFalse(diesSenars.contains("dijous"));

        List<String> diesFeinersSenars = new ArrayList();

        diesFeinersSenars.addAll(diesSenars);

        diesFeinersSenars.removeAll(diesCapDeSetmana);

        assertTrue(diesFeinersSenars.size() == 3);

        assertFalse(diesFeinersSenars.contains("dissabte"));

        calculDies.addAll(diesSetmana);

        assertTrue(calculDies.containsAll(diesFeina));
        assertTrue(calculDies.containsAll(diesCapDeSetmana));

        calculDies.clear();

        assertTrue(calculDies.isEmpty());

        calculDies.addAll(diesSetmana);

        calculDies.removeAll(diesCapDeSetmana);

        assertEquals(5, calculDies.size());
    }

    @Test
    public void provesAmbMapsTest(){

        Map<String, String> map = new HashMap<>();

        map.put("fons", "negre");
        map.put("menus", "blau");
        map.put("dialeg", "verd");

        assertEquals(map.size(), 3);

        assertTrue(map.containsKey("menus"));
        assertTrue(map.containsValue("negre"));

        map.remove("dialeg");

        assertEquals(map.size(), 2);

        map.remove("clauNoExistent");

        assertEquals(map.size(), 2);

        assertEquals(map.get("fons"), "negre");
    }

    public void initDiesFeiners(List<String> dies) {
        dies.add("dilluns");
        dies.add("dimarts");
        dies.add("dimecres");
        dies.add("dijous");
        dies.add("divendres");

    }

    @Test
    public void provesSetTest() {

        Set<String> dies = new HashSet<>();

        dies.add("dilluns");
        dies.add("dilluns");
        dies.add("dilluns");


        assertEquals(dies.size(), 1);

    }
}
