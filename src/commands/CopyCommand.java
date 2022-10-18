package commands;

import application.Editeur;

public class CopyCommand extends Command {

	public CopyCommand(Editeur editeur){
		super(editeur);
	}
	
	@Override
	public void execute() {
		getEditeur().setClipboard(getEditeur().getTextField().getSelectedText());
	}

}
