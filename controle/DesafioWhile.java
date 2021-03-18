package controle;

import java.util.Scanner;

public class DesafioWhile {


	public static void main(String[] args) {
		//Calcular média das notas de uma turma
		//Usuário digitar uma nota válida em uma variável 0 à 10
		//Quantidade de notas digitadas
		//Sair do programa "-1"
		
		Scanner entrada = new Scanner(System.in);
		
		int quantidadeDeNotas = 0;
		double nota = 0;
		double total = 0;
		
		while(nota != -1) {
			System.out.print("Informe a nota ou (-1) para sair: ");
			nota = entrada.nextDouble();
			
			if(nota <= 10 && nota >= 0) {
				total += nota;
				quantidadeDeNotas++;			
			} else if(nota != -1) {
				System.out.println("Nota inválida.");
			}
		}
		
		double media = total / quantidadeDeNotas;
		System.out.println("A média é: " + media);
		
		System.out.println("Quantidade de notas: " + quantidadeDeNotas);
		
		entrada.close();
	}
}
