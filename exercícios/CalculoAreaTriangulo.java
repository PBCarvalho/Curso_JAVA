package fundamentos;

import java.util.Scanner;

public class CalculoAreaTriangulo {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("C�lculo da �rea de um tri�ngulo.");
		
		System.out.print("Informe a base do tri�ngulo: ");
		double base = entrada.nextDouble();
		
		System.out.print("Informe a altura do tri�ngulo: ");
		double altura = entrada.nextDouble();
		
		double area = base * altura / 2;
		
		System.out.print("A �rea do tri�ngulo �: " + area + ".");
		
		entrada.close();
	}

}
