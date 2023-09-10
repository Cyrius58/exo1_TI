package com.victor.banque;

public class Compte {
    private int id;
    private double solde;

    public Compte(int id, double soldeInitial) {
        this.id = id;
        this.solde = soldeInitial;
    }

    public int getId() {
        return id;
    }

    public boolean crediter(double montant) {
        solde += montant;
        return true;
    }

    public boolean debiter(double montant) {
        if (solde < montant) {
            return false;
        }
        solde -= montant;
        return true;
    }

    public double getSolde() {
        return solde;
    }
}
