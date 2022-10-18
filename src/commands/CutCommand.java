package commands;
import application.Editeur;

public class CutCommand extends Command {

	public CutCommand(Editeur editeur) {
		super(editeur);
	}

	@Override
	void execute() {
		if (getEditeur().getTextField().getSelectedText().isEmpty()) return ;

        String source = getEditeur().getTextField().getText();
        getEditeur().setClipboard(getEditeur().getTextField().getSelectedText());
        getEditeur().getTextField().setText(afterCut(source));
	}
	
	private String afterCut(String source) {
        String start = source.substring(0, getEditeur().getTextField().getSelectionStart());
        String end = source.substring(getEditeur().getTextField().getSelectionEnd());
        return start + end;
	}

}
