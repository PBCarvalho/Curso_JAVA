package controle;

public class WhileDeterminado {

	public static void main(String[] args) {
		
		int contador = 0;
		
		while(contador <= 20) {
			//System.out.println("Bom dia!"); // Se utilizar este, mudar o valor do contador para 1.
			//contador++;
			System.out.printf("i = %d\n", contador);
			contador += 2;
		}
	}
}
