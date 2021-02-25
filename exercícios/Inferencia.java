package fundamentos;

public class Inferencia {
	
	public static void main(String[] args) {
		
		/*
		 * a vari�vel precisa ser inicializada logo ap�s sua declara��o.
		 * 
		 */
		
		double a = 4.5; // declara��o e inicializa��o
		System.out.println(a);
		
		//Infere o tipo do valor da vari�vel informado.
		a = 12;
		System.out.println(a);
		
		var b = 4.5;
		System.out.println(b);
		
		var c = "Texto";
		System.out.println(c);
		
		//Infere o tipo do valor da vari�vel informado.
		c = "Outro texto";
		System.out.println(c);
		
		double d; // vari�vel foi declarada
		d = 123.65; // vari�vel foi inicializada
		System.out.println(d); // foi usada
		
		var e = 123.45;
		System.out.println(e);		
	}

}
