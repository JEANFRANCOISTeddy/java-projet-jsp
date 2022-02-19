package model;

public class Matiere {
    String nom;
    String nb_heures;

    public Matiere(String nom, String nb_heures) {
        this.nom = nom;
        this.nb_heures = nb_heures;
    }
    
    public String getNom() {
        return nom;
    }

    public void setNbHeures(String nb_heures) {
        this.nb_heures = nb_heures;
    }
    
}
