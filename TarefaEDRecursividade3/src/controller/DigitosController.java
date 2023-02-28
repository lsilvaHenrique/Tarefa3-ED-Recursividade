package controller;

public class DigitosController {
	
	public DigitosController() {
		super();
	}
	public int contarDigitos(int num) {
		// Condicao de parada --> Quando o num for igual a 0 
		if (num == 0) {
			return 0;
		}
		return 1 + contarDigitos(num/10);
		/*
		 12345 / 10 = 1234 
		 1234 / 10 = 123
		 123 / 10 = 12
		 12 / 10 = 1
		 1 / 10 = 0
		 */
	} 
} 
