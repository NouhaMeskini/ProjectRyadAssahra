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
    private static int cmp;
    
    public void generateId(){
    
    cmp++;
    id = id+ cmp;
 
}
   

    public Client() {
        
       generateId();
        
    }

   
    
    public Client(String id, String prenom, String nom, String telephone, String adresse, String ville,String sexe,String email) {
        super(prenom, nom, telephone, adresse, sexe, email, ville);
      
    }

    
    
    public List<Commande> getCommandes() {
        return commandes;
    }

    public void setCommandes(List<Commande> commandes) {
        this.commandes = commandes;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    
    
    
   
   
   
 
    
}
