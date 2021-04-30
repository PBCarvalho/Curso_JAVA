package arrays;

import java.util.Arrays;

public class ExercicioForEach {

	public static void main(String[] args) {
		
		double[] notasAlunoA = new double[4];
		System.out.println(Arrays.toString(notasAlunoA));
		
		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 6.7;
		notasAlunoA[3] = 9.7;
		
		double totalAlunoA = 0;
		for (double tAa: notasAlunoA) {
			totalAlunoA += tAa;
			System.out.print(tAa + " ");
		}
		
		System.out.print("\n" + totalAlunoA / notasAlunoA.length);
		
		System.out.println();
		
		double[] notasAlunoB = {6.9, 8.9, 5.5, 10}; //Array já inicializado com dados literais
		
		double totalAlunoB = 0;
		for (double tAb: notasAlunoB) {
			totalAlunoB += tAb;
			System.out.print(tAb + " ");
		}
		
		System.out.print("\n" + totalAlunoB / notasAlunoB.length);
	}
}
