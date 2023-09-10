package com.victor.banque;

import java.util.HashMap;
import java.util.Map;

public class Banque {
    private Map<Integer, Compte> comptes = new HashMap<>();

    public void ajouterCompte(Compte compte) {
        comptes.put(compte.getId(), compte);
    }

    public boolean transferer(int srcId, int destId, double montant) {
        Compte src = comptes.get(srcId);
        Compte dest = comptes.get(destId);
        
        if (src == null || dest == null || !src.debiter(montant)) {
            return false;
        }
        
        dest.crediter(montant);
        return true;
    }
}
