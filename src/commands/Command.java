package commands;

import application.Editeur;

public abstract class Command {

	private Editeur editeur;
	public Editeur getEditeur() {
		return editeur;
	}
	public void setEditeur(Editeur editeur) {
		this.editeur = editeur;
	}
	Command(Editeur editeur) {
        this.editeur = editeur;
    }
	abstract void execute();
	
}
