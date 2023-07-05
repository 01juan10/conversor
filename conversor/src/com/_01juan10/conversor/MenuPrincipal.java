package com._01juan10.conversor;

import java.awt.BorderLayout;
import java.awt.GridLayout;
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



public class MenuPrincipal extends JFrame {
	
	private JTextField moneda, monedaConvertida, temperatura, temperaturaConvertida;
	private JButton botonConvertir;
	private JComboBox selectorMonedas, selectorTemperaturas1, selectorTemperaturas2;
	private String nombresMonedas[] = {"Dolar Estadounidense", "Dolar Canadiense", "Peso Argentino", "Sol Peruano", "Euro", "Libra"};
	private String nombresTemperaturas[] = {"Grados Centigrado", "Grados Farenheit", "Grados Kelvin"};
	private float multiplicadorMonedas[] = {};
	public MenuPrincipal() {
		
		super("conversor de moneda y temperatura");
		
		Toolkit toolkitIcono = Toolkit.getDefaultToolkit();
		Image ventanaIcono = toolkitIcono.getImage("./Imagenes/icono-github.png");
		setIconImage(ventanaIcono);
		
		
	}
}
