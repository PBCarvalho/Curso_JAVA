package fundamentos;

public class ConversaoTipoPrimitivo {
	
	public static void main(String[] args) {
		
		//Lembrar que o JAVA não analisa o valor, mas sim o tipo
		
		double a = 1; // Implícita
		System.out.println(a);
		
		float b = (float) 1.1234567899999; // Explícita (CAST)
		System.out.println(b);
		
		int c = 340; /*
					 * Máximo valor recebido pelo byte 227
					 * Caso este valor for maior do que o (byte) suporte,
					 * automaticamente o Java realiza conversão
					 */
		byte d = (byte) c; // Explícita (CAST)
		System.out.println(d);
		
		double e = 1.9999999999;
		int f = (int) e; // Explícita (CAST)
		System.out.println(f);
		
				
	}

}
