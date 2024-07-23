package fr.diginamic.factory;

import fr.diginamic.factory.entities.Additif;
import fr.diginamic.factory.entities.Allergene;
import fr.diginamic.factory.entities.Element;
import fr.diginamic.factory.entities.Ingredient;
import fr.diginamic.factory.enums.ElementType;
import fr.diginamic.factory.enums.Unite;

public class ElementFactory {
    public static Element Factory(ElementType type, String nom, double quantite, Unite unite) {
        switch (type) {
            case INGREDIENT:
                return new Ingredient(nom, quantite, unite);
            case ALLERGENE:
                return new Allergene(nom, quantite, unite);
            case ADDITIF:
                return new Additif(nom, quantite, unite);
            default:
                throw new IllegalArgumentException("Type d'élément non reconnu : " + type);
        }
    }
}
