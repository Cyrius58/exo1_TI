package com.victor.banque;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Tests {

    @Test
    public void testCrediter() {
        Compte compte = new Compte(1, 50);
        compte.crediter(50);
        assertEquals(100, compte.getSolde());
    }

    @Test
    public void testDebiterSuffisant() {
        Compte compte = new Compte(1, 50);
        assertTrue(compte.debiter(25));
        assertEquals(25, compte.getSolde());
    }

    @Test
    public void testDebiterInsuffisant() {
        Compte compte = new Compte(1, 50);
        assertFalse(compte.debiter(100));
        assertEquals(50, compte.getSolde());
    }
    
}
