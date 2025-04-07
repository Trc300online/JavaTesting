package Testing4_TreballAmbClassesPropies_i_Singleton;

import org.junit.Assert;
import org.junit.Test;

public class AppParametersTest {
    public static final String DOMAIN_EXPECTED = "127.0.0.1";

    public static final String PORT_EXPECTED = "80";

    public static final  String URL_EXPECTED = "https://" + DOMAIN_EXPECTED + ":" + PORT_EXPECTED;

    @Test
    public void domainURLCorrect() {
        Assert.assertEquals("Retorna la part FQDN", DOMAIN_EXPECTED, AppParamenters.DOMAIN);
    }

    @Test
    public void correctPORT() {
        Assert.assertEquals("Retorna el port correcte", PORT_EXPECTED, AppParamenters.PORT);
    }

    @Test
    public void correctURL() {
        Assert.assertEquals("Retorna la URL de forma correcte", URL_EXPECTED, AppParamenters.deployedURL());
    }

    @Test
    public void singletonCorrectness() {
        AppParamenters inst1 = AppParamenters.getInstance();

        AppParamenters inst2 = AppParamenters.getInstance();

        Assert.assertTrue("Comprovacio unicitat instancia del singleton", (inst2 == inst2));
    }
}
