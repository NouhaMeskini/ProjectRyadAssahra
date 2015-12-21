/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

/**
 *
 * @author toshiba
 */
public class Compte {
    private String id ;
    private double solde ;
    private Client client ; 

    public Compte() {
    }

    public Compte(String id) {
        this.id = id;
    }

    public Compte(double solde) {
        this.solde = solde;
    }

    public String getId() {
        return id;
    }

    public double getSolde() {
        return solde;
    }

    public Client getClient() {
        return client;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public String toString() {
        return "Compte{" + "id=" + id + ", solde=" + solde + '}';
    }
    
    
}
