package fr.diginamic.factory.entities;

import fr.diginamic.factory.enums.Unite;

public class Categorie extends Element {

    public Categorie(String nom, double quantite, Unite unite) {
        super(nom, quantite, unite);
    }

    @Override
    public String toString() {
        return "Categorie : {}";
    }
}
