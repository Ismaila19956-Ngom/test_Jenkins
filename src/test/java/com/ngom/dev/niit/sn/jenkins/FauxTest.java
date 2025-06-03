package com.ngom.dev.niit.sn.jenkins;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FauxTest {

    @Test
    void testAdditionFaillie() {
        int resultat = 5 + 5;
        assertEquals(10, resultat); // volontairement faux
    }
}
