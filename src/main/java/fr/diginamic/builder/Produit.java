package fr.diginamic.builder;

public class Produit {
    private String nom;
    private String description;
    private double prix;
    private int quantite;

    private Produit(String nom, String description, double prix, int quantite) {
        this.nom = nom;
        this.description = description;
        this.prix = prix;
        this.quantite = quantite;
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

    public static class ProduitBuilder {
        private String nom;
        private String description;
        private double prix;
        private int quantite;

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

        public Produit build() {
            return new Produit(nom, description, prix, quantite);
        }
    }
}
