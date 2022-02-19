package model;

public class Devoir {
	int id;
	String sujet;
	Note note;
	int id_eleve;
	
    public Devoir(int id, String sujet, Note note, int id_eleve) {
        this.id = id;
        this.sujet = sujet;
        this.note = note;
        this.id_eleve = id_eleve;
    }

	public int getId() {
		return id;
	}

	public int getId_eleve() {
		return id_eleve;
	}

	public void setId_eleve(int id_eleve) {
		this.id_eleve = id_eleve;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSujet() {
		return sujet;
	}

	public void setSujet(String sujet) {
		this.sujet = sujet;
	}

	public Note getNote() {
		return note;
	}

	public void setNote(Note note) {
		this.note = note;
	}
    
}
