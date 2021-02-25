package fundamentos;

public class Inferencia {
	
	public static void main(String[] args) {
		
		/*
		 * a variável precisa ser inicializada logo após sua declaração.
		 * 
		 */
		
		double a = 4.5; // declaração e inicialização
		System.out.println(a);
		
		//Infere o tipo do valor da variável informado.
		a = 12;
		System.out.println(a);
		
		var b = 4.5;
		System.out.println(b);
		
		var c = "Texto";
		System.out.println(c);
		
		//Infere o tipo do valor da variável informado.
		c = "Outro texto";
		System.out.println(c);
		
		double d; // variável foi declarada
		d = 123.65; // variável foi inicializada
		System.out.println(d); // foi usada
		
		var e = 123.45;
		System.out.println(e);		
	}

}
