package mypackage;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class PersonneTest {Personne P = new Personne("Longuè");
    Montre m = new Montre(9,25);

    @Test
    void testPorteMontre() {
        P.porteMontre(m);
        assertNotNull(P.Pmontre);
    }

    @Test
    void enleveMontre() {
    }

    @Test
    void demanderHeure() {
    }

    @Test
    void donneHeure() {
    }
}
