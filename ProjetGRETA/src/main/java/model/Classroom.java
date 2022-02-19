package model;

import java.util.ArrayList;

public class Classroom {
	String nom;
	Acces prof;
	ArrayList<Acces> eleves;
	Matiere matiere;
	Devoir devoir;
	
    public Classroom(String nom, Acces prof, ArrayList<Acces> eleves, Matiere matiere, Devoir devoir) {
        this.nom = nom;
        this.prof = prof;
        this.eleves = eleves;
        this.matiere = matiere;
        this.devoir = devoir;
    }

	public Devoir getDevoir() {
		return devoir;
	}

	public void setDevoir(Devoir devoir) {
		this.devoir = devoir;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Acces getProf() {
		return prof;
	}

	public void setProf(Acces prof) {
		this.prof = prof;
	}

	public ArrayList<Acces> getEleves() {
		return eleves;
	}

	public void setEleves(ArrayList<Acces> eleves) {
		this.eleves = eleves;
	}

	public Matiere getMatiere() {
		return matiere;
	}

	public void setMatiere(Matiere matiere) {
		this.matiere = matiere;
	}

}
