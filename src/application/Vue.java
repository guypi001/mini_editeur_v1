package application;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import commands.*;
import javax.swing.JInternalFrame;


public class Vue {

	

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the application.
	 */
	public Vue(Editeur editeur, JFrame frame, Invoker invoker) {
		initialize(editeur, frame, invoker);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(Editeur editeur, JFrame frame, Invoker invoker) {
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.NORTH);
		
		JButton btnNewButton_3 = new JButton(new ImageIcon(Vue.class.getResource("/assets/copier.png")));
		btnNewButton_3.setToolTipText("Copier");
		btnNewButton_3.setText("Copier");
		btnNewButton_3.setMaximumSize(new Dimension(24, 24));
		btnNewButton_3.setMargin(new Insets(15, 15, 15, 15));
		btnNewButton_3.setName("Copier");
		btnNewButton_3.setFocusable(false);
		btnNewButton_3.setPreferredSize(new Dimension(24, 24));
		btnNewButton_3.setMinimumSize(new Dimension(24, 24));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				invoker.invoke(new CopyCommand(editeur));
			}
		});
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_1 = new JButton(new ImageIcon(Vue.class.getResource("/assets/couper.png")));
		btnNewButton_1.setMaximumSize(new Dimension(24, 24));
		btnNewButton_1.setMargin(new Insets(15, 15, 15, 15));
		btnNewButton_1.setName("Couper");
		btnNewButton_1.setFocusable(false);
		btnNewButton_1.setPreferredSize(new Dimension(24, 24));
		btnNewButton_1.setMinimumSize(new Dimension(24, 24));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				invoker.invoke(new CutCommand(editeur));
			}
		});
		panel.add(btnNewButton_1);
		
		JButton btnNewButton = new JButton(new ImageIcon(Vue.class.getResource("/assets/paste.png")));
		btnNewButton.setMaximumSize(new Dimension(24, 24));
		btnNewButton.setMargin(new Insets(15, 15, 15, 15));
		btnNewButton.setName("Coller");
		btnNewButton.setFocusable(false);
		btnNewButton.setPreferredSize(new Dimension(24, 24));
		btnNewButton.setMinimumSize(new Dimension(24, 24));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				invoker.invoke(new PasteCommand(editeur));
			}
		});
		panel.add(btnNewButton);
		

		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.GRAY);
		frame.getContentPane().add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		textArea.setBounds(26, 30, 379, 169);
		panel_1.add(textArea);
		editeur.setTextField(textArea);
	}

}
