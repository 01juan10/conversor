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
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JOptionPane;



public class MenuPrincipal extends JFrame {
	
	private JTextField moneda, monedaConvertida, temperatura, temperaturaConvertida;
	private JButton botonConvertir;
	private JComboBox selectorMonedas, selectorTemperaturas1, selectorTemperaturas2;
	private String nombresMonedas[] = {"Dolar Estadounidense", "Dolar Canadiense", "Peso Argentino", "Sol Peruano", "Euro", "Libra Esterlina"};
	private String nombresTemperaturas[] = {"Grados Centigrados", "Grados Fahrenheit", "Grados Kelvin"};
	private double multiplicadorMonedas[] = {0.058, 0.078, 15.12, 0.21, 0.053, 0.046};
	private JLabel labelConvertirDe, labelConvertirDePesoMexicano, labelA, placeHolder;
	
	public MenuPrincipal() {
		
		super("Conversor de pesos mexicanos y temperatura");
		
		Toolkit toolkitIcono = Toolkit.getDefaultToolkit();
		Image ventanaIcono = toolkitIcono.getImage("./Imagenes/icono-github.png");
		setIconImage(ventanaIcono);
		
		labelConvertirDe = new JLabel(" Convertir de: ");
		labelConvertirDePesoMexicano = new JLabel(" Convertir de Peso Mexicano A: ");
		labelA = new JLabel("A: ",SwingConstants.CENTER);
		placeHolder = new JLabel("* Conversiones actualizadas al 5 de Julio del 2023.");
		placeHolder.setForeground(Color.RED);
		
		moneda = new JTextField(1000);
		monedaConvertida = new JTextField(1000);
		monedaConvertida.setEditable(false);
		
		temperatura = new JTextField(1000);
		temperaturaConvertida = new JTextField(1000);
		temperaturaConvertida.setEditable(false);
		
		botonConvertir = new JButton("HACER LA CONVERSION");
		botonConvertir.setBackground(new Color(100,100,100));
		
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
		
		ManagerButton managerButton = new ManagerButton();
		botonConvertir.addActionListener(managerButton);
		gbl.setConstraints(botonConvertir, gcon);
		add(botonConvertir);
	}
	
	private class ManagerButton implements ActionListener{
		
		public void actionPerformed(ActionEvent event) {
			
			if(event.getSource() == botonConvertir) {
				//JOptionPane.showMessageDialog( null, "atjkjukuyku ", "!", JOptionPane.PLAIN_MESSAGE );
				int i_selectorMonedas = selectorMonedas.getSelectedIndex(); 
				int i_selectorTemperaturas1 = selectorTemperaturas1.getSelectedIndex(); 
				int i_selectorTemperaturas2 = selectorTemperaturas2.getSelectedIndex();
				double cantidadPesosMexicanos=0, cantidadTemperatura1=0, cantidadTemperatura2=0, cantidadTemperaturaConvertida=0;
				try {
					if(!moneda.getText().equals("")) {
						cantidadPesosMexicanos = Double.parseDouble(moneda.getText());
						monedaConvertida.setText(String.format ("%.2f", cantidadPesosMexicanos * multiplicadorMonedas[i_selectorMonedas]));
						monedaConvertida.setForeground(Color.BLUE);
					}
					else {
						monedaConvertida.setText("");
					}
					
					
				}
				catch(NumberFormatException e) {
					JOptionPane.showMessageDialog( null, "No se pudo procesar la cantidad de moneda", "!", JOptionPane.WARNING_MESSAGE );
				}
				try{
					if(!temperatura.getText().equals("")) {
						
						cantidadTemperatura1 = Double.parseDouble(temperatura.getText());
						
						//conversor centigrados
						if(i_selectorTemperaturas1 == 0 && i_selectorTemperaturas2 == 1) {
							
							cantidadTemperaturaConvertida = cantidadTemperatura1* (double)(1.8)+32; // centigrados a fahrenheit
							
						}
						else if(i_selectorTemperaturas1 == 0 && i_selectorTemperaturas2 == 2) {
							
							cantidadTemperaturaConvertida = cantidadTemperatura1 + 273.15; // centigrados a kelvin
						}
						
						//conversor fahrenheit
						else if(i_selectorTemperaturas1 == 1 && i_selectorTemperaturas2 == 0) {
							
							cantidadTemperaturaConvertida = (cantidadTemperatura1 - 32) * (double)(0.55555); // fahrenheit a centigrados
							
						}
						else if(i_selectorTemperaturas1 == 1 && i_selectorTemperaturas2 == 2) {
							
							cantidadTemperaturaConvertida = (cantidadTemperatura1 - 32) * (double)(0.55555) + 273.15; // fahrenheit a kelvin
						}
						
						//conversor kelvin
						else if(i_selectorTemperaturas1 == 2 && i_selectorTemperaturas2 == 0) {
							
							cantidadTemperaturaConvertida = cantidadTemperatura1 - 273.15; // kelvin a centigrados
							
						}
						else if(i_selectorTemperaturas1 == 2 && i_selectorTemperaturas2 == 1) {
							
							cantidadTemperaturaConvertida = (cantidadTemperatura1 - 273.15) * 1.8 + 32; // kelvin a fahrenheit 
						}
						else {
							cantidadTemperaturaConvertida = cantidadTemperatura1;
						}
						
						temperaturaConvertida.setText(String.format ("%.2f",  cantidadTemperaturaConvertida ));
						temperaturaConvertida.setForeground(Color.BLUE);
					}
					else {
						temperaturaConvertida.setText("");
					}
				}
				catch(NumberFormatException e) {
					JOptionPane.showMessageDialog( null, "No se pudo procesar la cantidad de temperatura", "!", JOptionPane.WARNING_MESSAGE );
				}
			}
			
			
		}
	}
}
