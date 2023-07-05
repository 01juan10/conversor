package com._01juan10.conversor;

import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;



public class MenuPrincipal extends JFrame {
	
	private JTextField moneda, monedaConvertida, temperatura, temperaturaConvertida;
	private JButton botonConvertir;
	private JComboBox selectorMonedas, selectorTemperaturas1, selectorTemperaturas2;
	private String nombresMonedas[] = {"Dolar Estadounidense", "Dolar Canadiense", "Peso Argentino", "Sol Peruano", "Euro", "Libra"};
	private String nombresTemperaturas[] = {"Grados Centigrados", "Grados Farenheit", "Grados Kelvin"};
	private float multiplicadorMonedas[] = {};
	private JLabel labelConvertirDe, labelConvertirDePesoMexicano, labelA, placeHolder;
	
	public MenuPrincipal() {
		
		super("Conversor de moneda y temperatura");
		
		Toolkit toolkitIcono = Toolkit.getDefaultToolkit();
		Image ventanaIcono = toolkitIcono.getImage("./Imagenes/icono-github.png");
		setIconImage(ventanaIcono);
		
		labelConvertirDe = new JLabel(" Convertir de: ");
		labelConvertirDePesoMexicano = new JLabel(" Convertir de Peso Mexicano A: ");
		labelA = new JLabel(" A: ");
		placeHolder = new JLabel();
		
		moneda = new JTextField(1000);
		monedaConvertida = new JTextField(1000);
		monedaConvertida.setEnabled(false);
		
		temperatura = new JTextField(1000);
		temperaturaConvertida = new JTextField(1000);
		temperaturaConvertida.setEnabled(false);
		
		botonConvertir = new JButton("HACER LA CONVERSION");
		botonConvertir.setBackground(new Color(0,255,255));
		
		selectorMonedas = new JComboBox(nombresMonedas);
		selectorTemperaturas1 = new JComboBox(nombresTemperaturas);
		selectorTemperaturas2 = new JComboBox(nombresTemperaturas);
		
		GridBagLayout gbl = new GridBagLayout();
		setLayout(gbl);
		
		GridBagConstraints gcon = new GridBagConstraints();
		
		// labelConvertirDePesoMexicano
		
		gcon.weightx = 1;
		gcon.weighty = 1;
		gcon.fill = GridBagConstraints.BOTH;
		
		gcon.gridx = 0;
		gcon.gridy = 0;
		gcon.gridwidth = 7;
		gcon.gridheight = 1;
		
		gbl.setConstraints(labelConvertirDePesoMexicano, gcon);
		add(labelConvertirDePesoMexicano);
		
		// selectorMonedas
		
		gcon.gridx = 7;
		gcon.gridwidth = 3;
		gbl.setConstraints(selectorMonedas, gcon);
		add(selectorMonedas);
		
		//moneda
		
		gcon.gridx = 0;
		gcon.gridy = 1;
		gcon.gridwidth = 7;
		gcon.gridheight = 1;
		
		gbl.setConstraints(moneda, gcon);
		add(moneda);
		
		//moneda convertida
		gcon.gridx = 7;
		gcon.gridwidth = 3;
		gbl.setConstraints(monedaConvertida, gcon);
		add(monedaConvertida);
		
		//placeholder
		gcon.weightx = 2;
		gcon.weighty = 2;
		gcon.gridx = 0;
		gcon.gridy = 2;
		gcon.gridwidth = 10;
		gcon.gridheight = 5;
		
		gbl.setConstraints(placeHolder, gcon);
		add(placeHolder);
		
		//labelConvertirDe
		gcon.weightx = 1;
		gcon.weighty = 1;
		gcon.gridx = 0;
		gcon.gridy = 7;
		gcon.gridwidth = 3;
		gcon.gridheight = 1;
		
		gbl.setConstraints(labelConvertirDe, gcon);
		add(labelConvertirDe);
		
		//selectorTemperaturas1
		gcon.gridx = 3;
		gcon.gridwidth = 3;
		gcon.gridheight = 1;
		
		gbl.setConstraints(selectorTemperaturas1, gcon);
		add(selectorTemperaturas1);
		
		//labelConvertirDe
		gcon.gridx = 6;

		gcon.gridwidth = 1;
		gcon.gridheight = 1;
		
		gbl.setConstraints(labelA, gcon);
		add(labelA);
		
		//selectorTemperaturas2
		gcon.gridx = 7;

		gcon.gridwidth = 3;
		gcon.gridheight = 1;
		
		gbl.setConstraints(selectorTemperaturas2, gcon);
		add(selectorTemperaturas2);
		
		//temperatura
		gcon.gridx = 0;
		gcon.gridy = 8;
		gcon.gridwidth = 7;
		gcon.gridheight = 1;
		
		gbl.setConstraints(temperatura, gcon);
		add(temperatura);
		
		//temperaturaConvertida;
		
		gcon.gridx = 7;

		gcon.gridwidth = 3;
		gcon.gridheight = 1;
		
		gbl.setConstraints(temperaturaConvertida, gcon);
		add(temperaturaConvertida);
		
		//botonConvertir
		gcon.gridx = 0;
		gcon.gridy = 9;
		gcon.gridwidth = 10;
		gcon.gridheight = 1;
		
		gbl.setConstraints(botonConvertir, gcon);
		add(botonConvertir);
		
	}
}
