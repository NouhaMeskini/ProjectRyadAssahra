/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.util.Date;
import java.util.List;

/**
 *
 * @author M
 */
public class Fournisseur extends Personne {
    private List<Produit> produits;
    private Date dateEmbauche;
    private double salaire;

    public Fournisseur() {
    }

    public Fournisseur(List<Produit> produits, Date dateEmbauche, double salaire, String id, String prenom, String nom, String telephone, String adresse, String ville,String sex,String email) {
        super(prenom, nom, telephone, adresse, sex, email, ville);
        this.produits = produits;
    }

    public List<Produit> getProduits() {
        return produits;
    }

    public void setProduits(List<Produit> produits) {
        this.produits = produits;
    }

    public Date getDateEmbauche() {
        return dateEmbauche;
    }

    public void setDateEmbauche(Date dateEmbauche) {
        this.dateEmbauche = dateEmbauche;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    @Override
    public String toString() {
        return "Fournisseur{" + "produits=" + produits + ", dateEmbauche=" + dateEmbauche + ", salaire=" + salaire + '}';
    }
    

   

    
    
    
    
} 


