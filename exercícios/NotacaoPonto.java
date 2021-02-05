package fundamentos;

public class NotacaoPonto {
	
	public static void main(String[] args) {
		
		String s = "Bom dia X";
		s = s.replace("X", "Senhora"); // Troca a String informada na primeira senten�a pela segunda 
		s = s.toUpperCase(); // Converte toda a String para MAI�SCULO
		s = s.concat("!!!"); // Exerce a mesma fun��o do +, realizando a jun��o da senten�a "!!!" ao texto anterior
		
		// O s.toUpperCase() s� realizar� a altera��o para MAI�SCULO caso texto esteja antes da NotacaoPonto
		 
		System.out.println(s);
		
		String x = "Leo".toUpperCase();
		System.out.println(x);
		
		String y = "Bom dia X"
				.replace("X", "Gui")
				.toUpperCase()
				.concat("!!!");
		System.out.println(y);
		
		/*
		 * Tipos primitivos n�o tem o operador "."
		 * Exemplo:
		 */
		int a = 3;
		System.out.println(a);
		
	}

}
