package fundamentos;

public class ConversaoNumeroString {
	
	public static void main(String[] args) {
		
		Integer num1 = 10000; // Tipo
		System.out.println(num1.toString()); // Conversão de Integer para String
		System.out.println(num1.toString().length()); // Conversão de Integer para String exibindo quantidade de caracter

		int num2 = 100000; //Primitivo
		System.out.println(Integer.toString(num2));
		System.out.println(Integer.toString(num2).length());
	}

}
