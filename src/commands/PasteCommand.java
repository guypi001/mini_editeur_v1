package commands;

import application.Editeur;

public class PasteCommand extends Command {

	public PasteCommand(Editeur editeur) {
		super(editeur);
	}

	@Override
	void execute() {
		if (getEditeur().getClipboard() == null || getEditeur().getClipboard().isEmpty()) return ;

        getEditeur().getTextField().insert(getEditeur().getClipboard(), getEditeur().getTextField().getCaretPosition());
        return ;
	}

}
