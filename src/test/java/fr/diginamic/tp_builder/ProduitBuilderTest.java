package fr.diginamic.tp_builder;

import fr.diginamic.builder.Produit;

import static org.junit.Assert.*;
import org.junit.Test;

public class ProduitBuilderTest {

    @Test
    public void testProduitBuilder_NominalCase() {
        Produit produit = new Produit.ProduitBuilder()
                .setNom("Produit 1")
                .setDescription("Description du produit 1")
                .setPrix(19.99)
                .setQuantite(10)
                .build();

        System.out.println("Nom: " + produit.getNom());
        System.out.println("Description: " + produit.getDescription());
        System.out.println("Prix: " + produit.getPrix());
        System.out.println("Quantite: " + produit.getQuantite());

        assertEquals("Produit 1", produit.getNom());
        assertEquals("Description du produit 1", produit.getDescription());
        assertEquals(19.99, produit.getPrix(), 0.001);
        assertEquals(10, produit.getQuantite());
    }

    @Test
    public void testProduitBuilder_AlternativeCase() {
        Produit produit = new Produit.ProduitBuilder()
                .setNom("Produit 2")
                .setPrix(29.99)
                .build();

        System.out.println("Nom: " + produit.getNom());
        System.out.println("Description: " + produit.getDescription());
        System.out.println("Prix: " + produit.getPrix());
        System.out.println("Quantite: " + produit.getQuantite());

        assertEquals("Produit 2", produit.getNom());
        assertNull(produit.getDescription());
        assertEquals(29.99, produit.getPrix(), 0.001);
        assertEquals(0, produit.getQuantite());
    }
}
