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
 * @author toshiba
 */
public class Facture {
    private String id ;
    private Client client ;
    private Date date_facture ;
    private int montant ;
    private int montant_totale ;
    private Reservation reservation ;
    private List<Paiement> paiements ;

    public Facture() {
    }

    public Facture(String id) {
        this.id = id;
    }

    public Facture(Date date_facture, int montant, int montant_totale) {
        this.date_facture = date_facture;
        this.montant = montant;
        this.montant_totale = montant_totale;
    }

    public String getId() {
        return id;
    }

    public Client getClient() {
        return client;
    }

    public Date getDate_facture() {
        return date_facture;
    }

    public int getMontant() {
        return montant;
    }

    public int getMontant_totale() {
        return montant_totale;
    }

    public Reservation getReservation() {
        return reservation;
    }

    public List<Paiement> getPaiements() {
        return paiements;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void setDate_facture(Date date_facture) {
        this.date_facture = date_facture;
    }

    public void setMontant(int montant) {
        this.montant = montant;
    }

    public void setMontant_totale(int montant_totale) {
        this.montant_totale = montant_totale;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }

    public void setPaiements(List<Paiement> paiements) {
        this.paiements = paiements;
    }

    @Override
    public String toString() {
        return "Facture{" + "id=" + id + ", date_facture=" + date_facture + ", montant=" + montant + ", montant_totale=" + montant_totale + '}';
    }
    
    
}
