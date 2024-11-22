package org.example.entities;

public class PrudoctManager {
    private Produit produit;

    double calculerReduction(){

        return produit.getPrix()-0.10;
    }


}
