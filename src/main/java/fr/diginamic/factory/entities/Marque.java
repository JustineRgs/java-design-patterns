package fr.diginamic.factory.entities;

import fr.diginamic.factory.enums.Unite;

public class Marque extends Element {

    public Marque(String nom, double quantite, Unite unite) {
        super(nom, quantite, unite);
    }

    @Override
    public String toString() {
        return "Marque : {}";
    }
}
