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
 * @author M
 */
public class Commande {
  private String id;
  private List<Produit> produits ; 
  private Client client;
  private boolean annulée;
  

    public Commande() {
    }

    public Commande(String id) {
        this.id = id;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Produit> getProduits() {
        return produits;
    }

    public void setProduits(List<Produit> produits) {
        this.produits = produits;
    }

    public boolean isAnnulée() {
        return annulée;
    }

    public void setAnnulée(boolean annulée) {
        this.annulée = annulée;
    }
    

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.id);
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
        final Commande other = (Commande) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Commande{" + "id=" + id + ", annul\u00e9e=" + annulée + '}';
    }

   
    
    
  
    
}
