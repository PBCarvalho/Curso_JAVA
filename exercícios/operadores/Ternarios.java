package fundamentos.operadores;

public class Ternarios {
	
	public static void main(String[] args) {
		
		double media = 7.6;
		String resultadoFinal = media >= 7.0 ? "aprovador." : "em recupera��o.";
		System.out.println("O aluno est� " + resultadoFinal);
		
		double nota = 7.9;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 7.0;
		boolean temDesconto = bomComportamento && passouPorMedia;
		String resultado = temDesconto ? "Sim." : "N�o.";
		
		System.out.printf("Tem desconto? %s", resultado);
	}

}
