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
public class Client extends Personne {
   private List<Commande> commandes;

    public Client() {
    }

    public Client(List<Commande> commandes, String id, String prenom, String nom, String telephone, String adresse, String ville) {
        super(id, prenom, nom, telephone, adresse, ville);
        this.commandes = commandes;
    }

    
    
    public List<Commande> getCommandes() {
        return commandes;
    }

    public void setCommandes(List<Commande> commandes) {
        this.commandes = commandes;
    }

    @Override
    public String toString() {
        return  super.toString() +  "commandes=" + commandes + '}';
    }
    
    
   
   
   
 
    
}
