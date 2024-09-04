package calculadora;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculadoraController {
	
	//Atributos
	
	private JfCalculadora vista;
	private Calculadora modelo;
	double primerValor;
	double segundoValor;
	
	
	//Controlador
	
	public CalculadoraController(JfCalculadora vista, Calculadora modelo) {
		super();
		this.vista = vista;
		this.modelo = modelo;
	}
	
	class CalculadoraListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			
			primerValor = modelo.getNumero1();
			segundoValor = modelo.getNumero2();
			
			

			
		}
		
	
		
	}
	
	
	
	
	

}
