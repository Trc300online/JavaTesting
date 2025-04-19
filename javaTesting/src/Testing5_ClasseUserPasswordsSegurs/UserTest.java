package Testing5_ClasseUserPasswordsSegurs;

import org.junit.Test;
import static org.junit.Assert.*;

public class UserTest {

    @Test
    public void constructUserTest() {
        User usuari = new User("Toni","secret");

        assertTrue(usuari != null);

        assertEquals(usuari.getNom(), "Toni");
        // assertEquals(usuari.getPassword(), "secret");

        assertTrue(usuari.verifyPassword("secret"));
        
    }
}
