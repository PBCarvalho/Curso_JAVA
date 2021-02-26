package fundamentos.operadores;

public class Unarios {
	
	public static void main(String[] args) {
		
		int a = 1;
		int b = 2;
		
		a++; // a = a + 1;
		a--; // a = a - 1;
		
		++b; // b = b + 1;
		--b; // b = b - 1;
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("Mini desafio...");
		System.out.println(++a == b--); // neste caso haver� preced�ncia do operador (++a) que ir� incrementar antes do operador
										// j� o (b--) ser� decrement�do somente ap�s a compara��o
										// por conta desta preced�ncia o resultado ser� true (verdadeiro)
		System.out.println(a == b); // resultado false
		System.out.println(a);
		System.out.println(b);		
	}

}
