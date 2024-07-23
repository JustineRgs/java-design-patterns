package fr.diginamic.builder;

import fr.diginamic.factory.entities.Additif;
import fr.diginamic.factory.entities.Allergene;
import fr.diginamic.factory.entities.Ingredient;

import java.util.List;

public class Produit {
    private String nom;
    private String description;
    private double prix;
    private int quantite;

    private List<Allergene> allergenes;
    private List<Additif> additifs;
    private List<Ingredient> ingredients;

    private Produit(String nom, String description, double prix, int quantite, List<Allergene> allergenes, List<Additif> additifs, List<Ingredient> ingredients) {
        this.nom = nom;
        this.description = description;
        this.prix = prix;
        this.quantite = quantite;
        this.allergenes = allergenes;
        this.additifs = additifs;
        this.ingredients = ingredients;
    }

    public String getNom() {
        return nom;
    }

    public String getDescription() {
        return description;
    }

    public double getPrix() {
        return prix;
    }

    public int getQuantite() {
        return quantite;
    }

    public List<Allergene> getAllergenes() {
        return allergenes;
    }

    public List<Additif> getAdditifs() {
        return additifs;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public static class ProduitBuilder {
        private String nom;
        private String description;
        private double prix;
        private int quantite;
        private List<Allergene> allergenes;
        private List<Additif> additifs;
        private List<Ingredient> ingredients;

        public ProduitBuilder setNom(String nom) {
            this.nom = nom;
            return this;
        }

        public ProduitBuilder setDescription(String description) {
            this.description = description;
            return this;
        }

        public ProduitBuilder setPrix(double prix) {
            this.prix = prix;
            return this;
        }

        public ProduitBuilder setQuantite(int quantite) {
            this.quantite = quantite;
            return this;
        }

        public ProduitBuilder setAllergenes(List<Allergene> allergenes) {
            this.allergenes = allergenes;
            return this;
        }

        public ProduitBuilder setAdditifs(List<Additif> additifs) {
            this.additifs = additifs;
            return this;
        }

        public ProduitBuilder setIngredients(List<Ingredient> ingredients) {
            this.ingredients = ingredients;
            return this;
        }

        public Produit build() {
            return new Produit(nom, description, prix, quantite, allergenes, additifs, ingredients);
        }
    }
}
