package fundamentos;

public class ConversaoTipoPrimitivo {
	
	public static void main(String[] args) {
		
		//Lembrar que o JAVA n�o analisa o valor, mas sim o tipo
		
		double a = 1; // Impl�cita
		System.out.println(a);
		
		float b = (float) 1.1234567899999; // Expl�cita (CAST)
		System.out.println(b);
		
		int c = 340; /*
					 * M�ximo valor recebido pelo byte 227
					 * Caso este valor for maior do que o (byte) suporte,
					 * automaticamente o Java realiza convers�o
					 */
		byte d = (byte) c; // Expl�cita (CAST)
		System.out.println(d);
		
		double e = 1.9999999999;
		int f = (int) e; // Expl�cita (CAST)
		System.out.println(f);
		
				
	}

}
