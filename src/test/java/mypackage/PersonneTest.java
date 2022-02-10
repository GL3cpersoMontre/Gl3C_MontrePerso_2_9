package mypackage;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class PersonneTest {

    @Test
    void testPorteMontre() {
    }

    @Test
    void enleveMontre() {
        pers.porteMontre(m);
        assertNotNull(pers.montre);
    }

    @Test
    void demanderHeure() {
    }

    @Test
    void donneHeure() {
    }
}