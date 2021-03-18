package controle;

import java.util.Scanner;

public class While2 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String algo = "";
		
		while(!algo.equalsIgnoreCase("sair")) {
			System.out.println("Escreva (sair), caso queira.");
			System.out.print("Você falou: ");
			algo = entrada.nextLine();
		}		
	
		entrada.close();		
	}
}
