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
public class Personne {
    protected String id;
    protected String prenom;
    protected String nom;
    protected String telephone; 
    protected String adresse;
    private String sexe;
    private String email;
    protected String ville;

    public Personne() {
    }

    public Personne(String id) {
        this.id = id;
    }

    
    
    public Personne(String prenom, String nom, String telephone, String adresse, String sexe, String email, String ville) {
        this.prenom = prenom;
        this.nom = nom;
        this.telephone = telephone;
        this.adresse = adresse;
        this.sexe = sexe;
        this.email = email;
        this.ville = ville;
    }
     
    
    
    
    
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSex() {
        return sexe;
    }

    public String getEmail() {
        return email;
    }

    


    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getSexe() {
        return sexe;
    }
    

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public void setSexe(String sex) {
        this.sexe = sexe;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    

    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.id);
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
        final Personne other = (Personne) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Personne{" + "id=" + id + ", prenom=" + prenom + ", nom=" + nom + ", telephone=" + telephone + ", adresse=" + adresse + ", sexe=" + sexe + ", email=" + email + ", ville=" + ville + '}';
    }

    

    
    

    
}
