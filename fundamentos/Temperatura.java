package fundamentos;

public class Temperatura {
	
	public static void main(String[] args) {
		
		// (�F - 32) * 5 / 9 = �C
		
		int F = 86;
		final double AJUSTE = 32;
		final double FATOR = 5 / 9.0;
		
		double C = (F - AJUSTE) * FATOR;
		
		System.out.println(F + "�F" + " = " + C + "�C");
				
	}

}
