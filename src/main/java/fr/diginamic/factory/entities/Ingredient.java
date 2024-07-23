package fr.diginamic.factory.entities;

import fr.diginamic.factory.enums.Unite;

public class Ingredient extends Element
{
    public Ingredient(String nom, double quantite, Unite unite)
    {
        super(nom, quantite, unite);
    }

    @Override
    public String toString()
    {
        return "Ingredients : [" + super.toString() + "]";
    }
}