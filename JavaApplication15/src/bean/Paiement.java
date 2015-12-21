/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.util.Date;

/**
 *
 * @author toshiba
 */
public class Paiement {
    private String id ;
    private String type ;
    private int montant ;
    private Facture facture ;
    private Date date_paiement ;
    private boolean encaissement ;

    public Paiement() {
    }

    public Paiement(String id) {
        this.id = id;
    }

    public Paiement(String type, int montant, Date date_paiement, boolean encaissement) {
        this.type = type;
        this.montant = montant;
        this.date_paiement = date_paiement;
        this.encaissement = encaissement;
    }

    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public int getMontant() {
        return montant;
    }

    public Facture getFacture() {
        return facture;
    }

    public Date getDate_paiement() {
        return date_paiement;
    }

    public boolean isEncaissement() {
        return encaissement;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setMontant(int montant) {
        this.montant = montant;
    }

    public void setFacture(Facture facture) {
        this.facture = facture;
    }

    public void setDate_paiement(Date date_paiement) {
        this.date_paiement = date_paiement;
    }

    public void setEncaissement(boolean encaissement) {
        this.encaissement = encaissement;
    }

    @Override
    public String toString() {
        return "Paiement{" + "id=" + id + ", type=" + type + ", montant=" + montant + ", date_paiement=" + date_paiement + ", encaissement=" + encaissement + '}';
    }
    
    
}
