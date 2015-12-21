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

    public Fournisseur() {
    }

    public Fournisseur( Date dateEmbauche, String id, String prenom, String nom, String telephone, String adresse, String ville,String sexe,String email) {
        super(prenom, nom, telephone, adresse, sexe, email, ville);
        
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

    @Override
    public String toString() {
        return "Fournisseur{" + "dateEmbauche=" + dateEmbauche + '}';
    }

    

    
    

   

    
    
    
    
} 


