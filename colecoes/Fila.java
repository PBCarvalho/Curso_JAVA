package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		// Offer e Add -> adicionam elementos na fila
		// Diferen�a � o comportamento ocorre quando a fila est� cheia
		fila.add("Ana"); // retorna false
		fila.offer("Bia"); // lan�a uma exce��o
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");
		
		// peek e Element -> obter o pr�ximo elemento
		// Quando a fila est� vazia
		System.out.println(fila.peek()); // retorna false
		System.out.println(fila.element()); // lan�a uma exce��o
		
		// fila.size();
		// fila. clear();
		//fila.isEmpty();
		
		System.out.println(fila.poll());
		System.out.println(fila.remove());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.remove());
	}
}
