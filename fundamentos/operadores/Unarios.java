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
		System.out.println(++a == b--); // neste caso haverá precedência do operador (++a) que irá incrementar antes do operador
										// já o (b--) será decrementádo somente após a comparação
										// por conta desta precedência o resultado será true (verdadeiro)
		System.out.println(a == b); // resultado false
		System.out.println(a);
		System.out.println(b);		
	}

}
