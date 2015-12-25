/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author M
 */
public class Produit {
    private String id;
    private String reference;
    private String dateArrivee;
    private String libelle;
    private SousCategorie sousCategorie;
    private Fournisseur fournisseur;

    public Produit() {
    }

    public Produit(String id) {
        this.id = id;
    }

    public Produit(String references, String dateArrivee, String libelle) {
        this.reference = reference;
        this.dateArrivee = dateArrivee;
        this.libelle = libelle;
        this.sousCategorie = sousCategorie;
        this.fournisseur = fournisseur;
    }

   

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getReference() {
        return reference;
    }

    

    public void setReference(String reference) {
        this.reference = reference;
    }
    

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public SousCategorie getSousCategorie() {
        return sousCategorie;
    }

    public void setSousCategorie(SousCategorie sousCategorie) {
        this.sousCategorie = sousCategorie;
    }

    public Fournisseur getFournisseur() {
        return fournisseur;
    }

    public void setFournisseur(Fournisseur fournisseur) {
        this.fournisseur = fournisseur;
    }

    public String getDateArrivee() {
        return dateArrivee;
    }

    public void setDateArrivee(String dateArrivee) {
        this.dateArrivee = dateArrivee;
    }
    

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.id);
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
        final Produit other = (Produit) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Produit{" + "id=" + id + ", references=" + reference + ", dateArrivee=" + dateArrivee + ", libelle=" + libelle + '}';
    }

    
    
    
    
}
