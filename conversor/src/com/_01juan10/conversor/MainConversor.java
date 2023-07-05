package com._01juan10.conversor;


import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;

public class MainConversor {

	public static void main(String[] args) {
		try {
			for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		
		Toolkit pantalla = Toolkit.getDefaultToolkit();
		Dimension tamanoPantalla = pantalla.getScreenSize();
		
		MenuPrincipal conversor = new MenuPrincipal();
		conversor.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		
		conversor.setSize( tamanoPantalla.width/4, tamanoPantalla.height/4 );
		conversor.setVisible( true );
		conversor.setResizable( true );
		conversor.setLocationRelativeTo(null);
	}

}
