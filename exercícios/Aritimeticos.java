package fundamentos;

public class Aritimeticos {
	
	public static void main(String[] args) {
		
		System.out.println(2 + 3);
		
		var x = 34.56;
		double y = 2.2;
		
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);
		
		int a = 8;
		int b = 3;
		
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a / (double) b);
		System.out.println(a / (float) b);
		
		System.out.println(8 % 3);
		System.out.println(a % b);
		
		System.out.println(x + y - a * b);
		
		System.out.println(a + b);
		
		//Utilização da Class Math
		
		int c = 1 + 2 * 3;
		int d = (int) Math.pow(c, 3);
		double e = Math.pow(c, 3);
		
		System.out.println(d);
		System.out.println(e);
	}

}
