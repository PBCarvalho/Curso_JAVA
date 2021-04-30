package arrays;

import java.util.Scanner;

public class DesafioArray {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Quantas notas voc� quer informar? ");
		int quantNotas = entrada.nextInt();
		
		double[] notas = new double[quantNotas];
						
		for (int i = 0; i < notas.length; i++) {
			System.out.printf("Digite a nota " + (i + 1) + ": ");
			notas[i] = entrada.nextDouble();	
		}
		
		double total = 0;
		for (double nota: notas) {
			total += nota;
		}
		
		System.out.println("Valor total das notas � " + total);
		
		double media = total / notas.length;
		
		System.out.println("Resultado da m�dia � " + media);
		
		entrada.close();
	}
}
