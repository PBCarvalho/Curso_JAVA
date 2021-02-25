package fundamentos;

import java.util.Scanner;

public class CalculoIMC {
	
	public static void main(String[] args) {
		
		// IMC = peso / (altura * altura)
		
		Scanner entrada = new Scanner (System.in);
				
				System.out.print("Informe seu peso: ");
				double peso = entrada.nextDouble();
				
				System.out.print("Informe sua altura: ");
				double altura = entrada.nextDouble();
				
				double resultado = peso / (altura * altura);
				
				System.out.println("O IMC deste paciente é de " + resultado + ".");
				
				entrada.close();
	}

}
