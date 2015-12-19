/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.util.List;

/**
 *
 * @author M
 */
public class Fournisseur extends Personne {
    private List<Produit> produits;

    public Fournisseur() {
    }

    public Fournisseur(List<Produit> produits, String id, String prenom, String nom, String telephone, String adresse, String ville) {
        super(id, prenom, nom, telephone, adresse, ville);
        this.produits = produits;
    }

    public List<Produit> getProduits() {
        return produits;
    }

    public void setProduits(List<Produit> produits) {
        this.produits = produits;
    }

    @Override
    public String toString() {
        return super.toString() + "produits=" + produits + '}';
    }
    
    
    
}
