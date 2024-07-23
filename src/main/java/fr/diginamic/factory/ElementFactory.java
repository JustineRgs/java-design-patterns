package fr.diginamic.factory;

import fr.diginamic.factory.entities.Additif;
import fr.diginamic.factory.entities.Allergene;
import fr.diginamic.factory.entities.Element;
import fr.diginamic.factory.entities.Ingredient;
import fr.diginamic.factory.enums.Unite;

public class ElementFactory
{
    public static Element Factory(fr.diginamic.factory.enums.ElementType type, String name, double quantite, Unite unite)
    {
        switch (type)
        {
            case ADDITIF:
                return new Additif(name, quantite, unite);
            case ALLERGENE:
                return new Allergene(name, quantite, unite);
            case INGREDIENT:
                return new Ingredient(name, quantite, unite);
            default:
                return null;
        }
    }
}