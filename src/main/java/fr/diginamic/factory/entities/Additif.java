package fr.diginamic.factory.entities;

import fr.diginamic.factory.enums.Unite;

public class Additif extends Element
{
    public Additif(String nom, double quantite, Unite unite)
    {
        super(nom, quantite, unite);
    }

    @Override
    public String toString()
    {
        return "Additifs : [" + super.toString() + "]";
    }
}