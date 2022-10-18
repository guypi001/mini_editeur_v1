package application;

import java.awt.EventQueue;

import javax.swing.JFrame;

import commands.Invoker;

public class Application {
	private Editeur editeur;

	public Editeur getEditeur() {
		return editeur;
	}

	public void setEditeur(Editeur editeur) {
		this.editeur = editeur;
	}
	
	
	
	public static void main(String[] args) {
		
		Editeur editeur = new Editeur();
		JFrame frame = new JFrame();
		Invoker invoker = new Invoker();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					Vue window = new Vue(editeur,frame, invoker);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
