package application;

import javax.swing.JTextArea;

public class Editeur {
	
	private JTextArea textField;
	private String clipboard;
	
    public JTextArea getTextField() {
		return textField;
	}
	public void setTextField(JTextArea textField) {
		this.textField = textField;
	}
	public String getClipboard() {
		return clipboard;
	}
	public void setClipboard(String clipboard) {
		this.clipboard = clipboard;
	}

}
