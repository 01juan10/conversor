package com._01juan10.conversor;


import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;

public class MainConversor {

	public static void main(String[] args) {
		
		MenuPrincipal conversor = new MenuPrincipal();
		conversor.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		
		conversor.setSize( 800, 600 );
		conversor.setVisible( true );
		conversor.setResizable( true );
		conversor.setLocationRelativeTo(null);
	}

}
