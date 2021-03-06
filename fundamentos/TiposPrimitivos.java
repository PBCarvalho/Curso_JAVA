package fundamentos;

public class TiposPrimitivos {
	
	public static void main(String[] args) {
		// Informa��es do funcion�rio
		
		// Tipos num�ricos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_134_845_223L;
		
		// Tipos num�ricos reais
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		// Tipo booleano
		boolean estaDeFerias = false; // true ou false
		
		//Tipo caractere
		char status = 'A'; // ativo
		
		//Dias de empresa
		System.out.println("Dias de empresa: " + anosDeEmpresa * 365);
		
		// N�mero de viagens
		System.out.println("Quantidade de viagens: " + numeroDeVoos / 2);
		
		// Pontos por real
		System.out.println("Pontos do Funcion�rio: " + pontosAcumulados / vendasAcumuladas);
		
		System.out.println("Funcion�rio ID: " + id + " ganha -> " + salario);
		System.out.println("F�rias: " + estaDeFerias);
		System.out.println("Status: " + status);		
	}

}
