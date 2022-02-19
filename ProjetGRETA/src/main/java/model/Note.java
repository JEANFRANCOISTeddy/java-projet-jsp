package model;

public class Note {
	int id;
	int coefficient;
	int note;
	
    public Note(int id, int coefficient, int note) {
        this.id = id;
        this.coefficient = coefficient;
        this.note = note;
    }
    
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCoefficient() {
		return coefficient;
	}

	public void setCoefficient(int coefficient) {
		this.coefficient = coefficient;
	}

	public int getNote() {
		return note;
	}

	public void setNote(int note) {
		this.note = note;
	}
	

}
