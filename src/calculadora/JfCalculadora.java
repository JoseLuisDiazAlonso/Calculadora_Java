package calculadora;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import calculadora.CalculadoraController.CalculadoraListener;

import java.awt.TextField;
import java.awt.Button;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JfCalculadora extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JButton boton1;
	private JButton boton2;
	private JButton boton3;
	private JButton boton4;
	private JButton boton5;
	private JButton boton6;
	private JButton boton7;
	private JButton boton8;
	private JButton boton9;
	private JButton boton0;
	private JButton coma;
	private JButton resultado;
	private JButton sumar;
	private JButton restar;
	private JButton multiplicar;
	private JButton dividir;
	private JButton botonLimpiar;
	private JButton botonGuardar;
	private JButton botonRecuperar;

	Calculadora modelo = new Calculadora();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JfCalculadora frame = new JfCalculadora();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JfCalculadora() {
		setTitle("Calculadora Java");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 735, 503);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		textField = new JTextField();
		textField.setBackground(new Color(255, 255, 255));
		textField.setEditable(false);
		textField.setBounds(10, 39, 1252, 47);
		contentPane.add(textField);
		textField.setColumns(10);

		boton1 = new JButton("1");

		// Agregamos el evento ActionListener al botón1

		boton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				/*
				 * Para evitar que se borre el contenido del textField cada vez que se pulse un
				 * nuevo botón creamos una variable para almacenar el contenido del textField.
				 * 
				 */
				String contenidoActual = textField.getText();
				textField.setText(contenidoActual + "1");
			}
		});
		boton1.setBounds(27, 137, 61, 37);
		contentPane.add(boton1);

		boton2 = new JButton("2");
		boton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String contenidoActual = textField.getText();
				textField.setText(contenidoActual + "2");
			}
		});
		boton2.setBounds(120, 137, 61, 37);
		contentPane.add(boton2);

		boton3 = new JButton("3");
		boton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String contenidoActual = textField.getText();
				textField.setText(contenidoActual + "3");
			}
		});
		boton3.setBounds(220, 137, 61, 37);
		contentPane.add(boton3);

		sumar = new JButton("+");
		sumar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				modelo.sumar();

			}
		});
		sumar.setBounds(325, 137, 61, 37);
		contentPane.add(sumar);

		boton4 = new JButton("4");
		boton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String contenidoActual = textField.getText();
				textField.setText(contenidoActual + "4");
			}
		});
		boton4.setBounds(27, 209, 61, 37);
		contentPane.add(boton4);

		boton5 = new JButton("5");
		boton5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String contenidoActual = textField.getText();
				textField.setText(contenidoActual + "5");
			}
		});
		boton5.setBounds(120, 209, 61, 37);
		contentPane.add(boton5);

		boton6 = new JButton("6");
		boton6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String contenidoActual = textField.getText();
				textField.setText(contenidoActual + "6");
			}
		});
		boton6.setBounds(220, 209, 61, 37);
		contentPane.add(boton6);

		restar = new JButton("-");
		restar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		restar.setBounds(325, 209, 61, 37);
		contentPane.add(restar);

		boton7 = new JButton("7");
		boton7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String contenidoActual = textField.getText();
				textField.setText(contenidoActual + "7");
			}
		});
		boton7.setBounds(27, 279, 61, 37);
		contentPane.add(boton7);

		boton8 = new JButton("8");
		boton8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String contenidoActual = textField.getText();
				textField.setText(contenidoActual + "8");
			}
		});
		boton8.setBounds(120, 279, 61, 37);
		contentPane.add(boton8);

		boton9 = new JButton("9");
		boton9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String contenidoActual = textField.getText();
				textField.setText(contenidoActual + "9");
			}
		});
		boton9.setBounds(220, 279, 61, 37);
		contentPane.add(boton9);

		multiplicar = new JButton("*");
		multiplicar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		multiplicar.setBounds(325, 279, 61, 37);
		contentPane.add(multiplicar);

		boton0 = new JButton("0");
		boton0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String contenidoActual = textField.getText();
				textField.setText(contenidoActual + "0");
			}
		});
		boton0.setBounds(27, 359, 61, 37);
		contentPane.add(boton0);

		coma = new JButton(".");
		coma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String contenidoActual = textField.getText();
				textField.setText(contenidoActual + ".");
			}
		});
		coma.setBounds(120, 359, 61, 37);
		contentPane.add(coma);

		resultado = new JButton("=");
		resultado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(String.valueOf(resultado));

			}
		});
		resultado.setBounds(220, 359, 61, 37);
		contentPane.add(resultado);

		dividir = new JButton("/");
		dividir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		dividir.setBounds(325, 359, 61, 37);
		contentPane.add(dividir);

		botonLimpiar = new JButton("Limpiar");
		botonLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		botonLimpiar.setBounds(435, 137, 85, 67);
		contentPane.add(botonLimpiar);

		botonGuardar = new JButton("Guardar");
		botonGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		botonGuardar.setBounds(435, 228, 85, 67);
		contentPane.add(botonGuardar);

		botonRecuperar = new JButton("Recuperar");
		botonRecuperar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		botonRecuperar.setBounds(435, 329, 85, 67);
		contentPane.add(botonRecuperar);
	}

}
