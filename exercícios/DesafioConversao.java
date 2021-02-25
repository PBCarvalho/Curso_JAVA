package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	
	public static void main(String[] args) {
		
		// Criar um mecanismo de Scanner, pegando 3 String usando o Nextline, ultimos 3 salários
		// Possibilidade de separar . ou ,
		// Somar os 3 salários e mostrar a média.
				
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Informe o primeiro Salário: ");
		String salario1 = entrada.nextLine().replace(",", ".");
		
		System.out.print("Informe o segundo Salário: ");
		String salario2 = entrada.nextLine().replace(",", ".");
		
		System.out.print("Informe o terceiro Salário: ");
		String salario3 = entrada.nextLine().replace(",", ".");
		
		double sal1 = Double.parseDouble(salario1);
		double sal2 = Double.parseDouble(salario2);
		double sal3 = Double.parseDouble(salario3);
		
		double soma = sal1 + sal2 + sal3;
				
		System.out.println("A soma é: " + soma);
		System.out.println("A média é: " + soma / 3);
		
		entrada.close();
	}

}
