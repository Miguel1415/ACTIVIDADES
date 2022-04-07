package app;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class MainColaLifo {

	public static void main(String[] args) {
		
		//ejemplo: LIFO = el ultimo que ingresa es el ultimo en salir

		//Interface deque 
		//double ended Queue
		
		Deque<String> productos = new LinkedList<>();
		productos.addAll( Arrays.asList("maquina1", "maquina2", "maquina3", "maquina4"));
		
		//maquina 4
		System.out.println(productos);
		String maquina = productos.pollLast();
		System.out.printf("Sacando la %s para el cliente....%n", maquina);
		System.out.println(productos);
		
		System.out.println();

		//maquina 3 pero seguira presente
		System.out.println(productos);
		maquina = productos.peekLast();
		System.out.printf("Sacando la %s para el cliente....%n", maquina);
		System.out.println(productos);
		
		System.out.println();

		//maquina 2
		System.out.println(productos);
		maquina = productos.pollLast();
		System.out.printf("Sacando la %s para el cliente....%n", maquina);
		System.out.println(productos);
	}

}
