package fr.diginamic.factory;

import fr.diginamic.factory.entities.Element;
import fr.diginamic.factory.enums.Unite;

public class FactoryTest
{
    public static void main(String[] args)
    {
        Element additif = ElementFactory.Factory(fr.diginamic.factory.enums.ElementType.ADDITIF, "Colorants", 15.2758, Unite.MICRO_GRAMMES);
        System.out.println(additif);

        Element allergene = ElementFactory.Factory(fr.diginamic.factory.enums.ElementType.ALLERGENE, "Arachides", 25000.0, Unite.MILLI_GRAMMES);
        System.out.println(allergene);

        Element ingredient1 = ElementFactory.Factory(fr.diginamic.factory.enums.ElementType.INGREDIENT, "Pomme de terre", 1250.3, Unite.MILLI_GRAMMES);
        System.out.println(ingredient1);

        Element ingredient2 = ElementFactory.Factory(fr.diginamic.factory.enums.ElementType.INGREDIENT, "Riz", 15000, Unite.MILLI_GRAMMES);
        System.out.println(ingredient2);

        Element ingredient3 = ElementFactory.Factory(fr.diginamic.factory.enums.ElementType.INGREDIENT, "Tomate", 2425.44, Unite.MICRO_GRAMMES);
        System.out.println(ingredient3);
    }
}