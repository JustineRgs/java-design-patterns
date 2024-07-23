package fr.diginamic.tp_builder;

import fr.diginamic.factory.ElementFactory;
import fr.diginamic.factory.entities.Additif;
import fr.diginamic.factory.entities.Allergene;
import fr.diginamic.factory.entities.Element;
import fr.diginamic.factory.entities.Ingredient;
import fr.diginamic.factory.enums.ElementType;
import fr.diginamic.factory.enums.Unite;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ProduitBuilderTest {

    @Test
    public void testCreateIngredient() {
        Element ingredient = ElementFactory.Factory(ElementType.INGREDIENT, "Tomate", 100, Unite.MILLI_GRAMMES);
        assertTrue(ingredient instanceof Ingredient);
        assertEquals("Tomate", ingredient.getNom());
        assertEquals(100, ingredient.getQuantite(), 0.001);
        assertEquals(Unite.MILLI_GRAMMES, ingredient.getUnite());
    }

    @Test
    public void testCreateAllergene() {
        Element allergene = ElementFactory.Factory(ElementType.ALLERGENE, "Gluten", 0.1, Unite.MILLI_GRAMMES);
        assertTrue(allergene instanceof Allergene);
        assertEquals("Gluten", allergene.getNom());
        assertEquals(0.1, allergene.getQuantite(), 0.001);
        assertEquals(Unite.MILLI_GRAMMES, allergene.getUnite());
    }

    @Test
    public void testCreateAdditif() {
        Element additif = ElementFactory.Factory(ElementType.ADDITIF, "E200", 0.05, Unite.MICRO_GRAMMES);
        assertTrue(additif instanceof Additif);
        assertEquals("E200", additif.getNom());
        assertEquals(0.05, additif.getQuantite(), 0.001);
        assertEquals(Unite.MICRO_GRAMMES, additif.getUnite());
    }
}
