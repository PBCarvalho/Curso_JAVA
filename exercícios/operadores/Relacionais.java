package fundamentos.operadores;

public class Relacionais {
	
	public static void main(String[] args) {
		
		int a = 97;
		int b = 'a';
		
		System.out.println(a == b); // == (operador) simbolo de comparação
		System.out.println(30 != 7); // diferente que
		System.out.println(3 > 4); // maior que
		System.out.println(3 >= 3); // maior ou igual
		System.out.println(3 < 7); // menor que
		System.out.println(30 <= 7); // nemor ou igual
		
		double nota = 7.3;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota > 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
				
		System.out.println("Tem desconto: " + temDesconto);		
	}

}
