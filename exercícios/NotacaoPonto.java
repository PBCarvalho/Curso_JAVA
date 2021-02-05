package fundamentos;

public class NotacaoPonto {
	
	public static void main(String[] args) {
		
		String s = "Bom dia X";
		s = s.replace("X", "Senhora"); // Troca a String informada na primeira sentença pela segunda 
		s = s.toUpperCase(); // Converte toda a String para MAIÚSCULO
		s = s.concat("!!!"); // Exerce a mesma função do +, realizando a junção da sentença "!!!" ao texto anterior
		
		// O s.toUpperCase() só realizará a alteração para MAIÚSCULO caso texto esteja antes da NotacaoPonto
		 
		System.out.println(s);
		
		String x = "Leo".toUpperCase();
		System.out.println(x);
		
		String y = "Bom dia X"
				.replace("X", "Gui")
				.toUpperCase()
				.concat("!!!");
		System.out.println(y);
		
		/*
		 * Tipos primitivos não tem o operador "."
		 * Exemplo:
		 */
		int a = 3;
		System.out.println(a);
		
	}

}
