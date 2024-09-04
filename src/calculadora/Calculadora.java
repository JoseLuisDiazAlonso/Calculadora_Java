package calculadora;

/**
 * Creamos el Modelo de la clase calculadora en donde se instaurará la lógica
 * del programa. El valor de los dos números que escojeremos se guardarán en dos
 * variables numero1 y numero2 y además se llevarán diferentes funciones como
 * son sumar, restar, dividir, multiplicar, además de Guardar, Recuperar y
 * Limpiar.
 */
public class Calculadora {

	// Variables.

	private Double numero1;
	private Double numero2;

	// Constructor

	public Calculadora() {
		super();
		this.numero1 = numero1;
		this.numero2 = numero2;

	}

	public Double getNumero1() {
		return numero1;
	}

	public void setNumero1(Double numero1) {
		this.numero1 = numero1;
	}

	public Double getNumero2() {
		return numero2;
	}

	public void setNumero2(Double numero2) {
		this.numero2 = numero2;
	}

	public void sumar() {
		double resultado = numero1 + numero2;
	}

	public void restar() {
		double resultado = numero1 - numero2;
	}

	public void multiplicar() {
		double resultado = numero1 * numero2;

	}

	public void dividir() {
		try {

			if (numero2 == 0) {
				throw new ArithmeticException("Division entre cero");
			}

		} catch (ArithmeticException e) {
			System.out.println("Error: " + e.getMessage());

		}
	}

}
