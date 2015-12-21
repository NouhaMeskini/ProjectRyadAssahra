/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.util.List;
import java.util.Objects;

/**
 *
 * @author HASNA
 */
public class CommandeItem {
    private String id;
    private String quantite;
    private double prix;
    private Produit produit ;

    public CommandeItem() {
    }

    public CommandeItem(String id) {
        this.id = id;
    }
    

    public CommandeItem(String quantite, double prix) {
        this.quantite = quantite;
        this.prix = prix;
    }

    public String getId() {
        return id;
    }

    public String getQuantite() {
        return quantite;
    }

    public double getPrix() {
        return prix;
    }

    public Produit getProduit() {
        return produit;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setQuantite(String quantite) {
        this.quantite = quantite;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final CommandeItem other = (CommandeItem) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
    

    @Override
    public String toString() {
        return "CommandeItem{" + "id=" + id + ", quantite=" + quantite + ", prix=" + prix + '}';
    }
    
    

    
    
    
     
    
}
