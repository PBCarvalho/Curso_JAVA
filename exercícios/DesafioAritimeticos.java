package fundamentos;

public class DesafioAritimeticos {
	
	public static void main(String[] args) {
		
		double numA = Math.pow(6 * (3 + 2), 2);
		double denA = 3 * 2;
		double divA = numA / denA;
						
		double numB = (1 - 5) * (2 - 7);
		double denB = 2;
		double divB = Math.pow(numB / denB, 2);
				
		double subA = Math.pow(divA - divB, 3);
				
		double subB = Math.pow(10, 3);
				
		double resultado = subA / subB;
		
		System.out.println("O resultado é " + resultado + ".");
				
	}

}
