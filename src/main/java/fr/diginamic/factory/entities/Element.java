package fr.diginamic.factory.entities;

import fr.diginamic.factory.enums.Unite;

import java.text.DecimalFormat;

public abstract class Element
{
    private String nom;
    private double quantite;
    private Unite unite;

    //Constructors

    public Element(String nom, double quantite, Unite unite)
    {
        setNom(nom);
        setQuantite(quantite);
        setUnite(unite);
    }

    public Element() {}

    //ToString
    @Override
    public String toString()
    {
        DecimalFormat df = new DecimalFormat("#.###");

        return getNom() + ": " + df.format(getQuantite()) + getUniteAsString();
    }

    //Getters

    public String getNom()
    {
        return nom;
    }

    public double getQuantite()
    {
        return quantite;
    }

    public Unite getUnite()
    {
        return unite;
    }

    public String getUniteAsString()
    {
        if(unite != null)
        {
            if(unite == Unite.MILLI_GRAMMES)
                return "mg";
            if(unite == Unite.MICRO_GRAMMES)
                return "µg";
        }

        return "";
    }

    //Setters

    public void setNom(String nom)
    {
        this.nom = nom;
    }

    public void setQuantite(double quantite)
    {
        this.quantite = quantite;
    }

    public void setUnite(Unite unite)
    {
        this.unite = unite;
    }
}