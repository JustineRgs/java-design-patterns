package fr.diginamic.factory.entities;

import fr.diginamic.factory.enums.Unite;

public class Allergene extends Element
{
    public Allergene(String nom, double quantite, Unite unite)
    {
        super(nom, quantite, unite);
    }

    @Override
    public String toString()
    {
        return "Allergenes : [" + super.toString() + "]";
    }
}