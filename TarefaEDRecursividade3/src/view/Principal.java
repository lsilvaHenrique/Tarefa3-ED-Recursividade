package view;

import controller.DigitosController;

public class Principal {
	public static void main (String[] args) {
		int num = 1234566;
		
	DigitosController dc = new DigitosController();
	int resultado = dc.contarDigitos(num);
	System.out.println("A quantidade de dígitos é: " + resultado);
	
	}
}
