package app;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class MainColas {

	public static void main(String[] args) {
		//cola FIFO first in, first out primero en entrar, primero en salir
		Queue<String> filaSupermercado = new LinkedList<>();
		filaSupermercado.add("Pedro");
		//se puede utilizar offer() p add()
		//la diferencia es que add() lanxa una Excepcion
		//ante cualquier problema
		//y offer() solo retorna false ante un problema
		filaSupermercado.offer("Juan");
		filaSupermercado.add("Carolina");
		filaSupermercado.add("Sergio");

		//mostrar elementos 
		System.out.println(filaSupermercado);
		String persona = filaSupermercado.poll();//se saca alguien de la cola
		System.out.printf("Se está atendiendo a %s........%n", persona);
		System.out.println(filaSupermercado);
		System.out.println(filaSupermercado);
		
		System.out.println(filaSupermercado);
		persona = filaSupermercado.remove();
		System.out.printf("Atendiendo a %s.....%n",persona);
		System.out.println(filaSupermercado);

	
	try 
	{
		persona = filaSupermercado.remove();
		System.out.println(filaSupermercado);
		System.out.printf("Atendiendo a %s.....%n", persona);
		System.out.println("estan pendientes");
		System.out.println(filaSupermercado);
		
	}catch(NoSuchElementException e) 
	{
		System.out.println("ya se atendieron a todos los clientes que estaban en la sala");
	}
	
	if(filaSupermercado.size()>0) 
	{
		System.out.println(filaSupermercado);
		persona = filaSupermercado.poll();
		System.out.printf("Atendiendo a %s......%n", persona);
		System.out.println(filaSupermercado);
	}
	
	//Tambien se puede hacer así
	
	System.out.println(filaSupermercado);
	persona = filaSupermercado.poll();
	if(persona != null) 
	{
		System.out.printf("Atendiendo a %a.....%n", persona);
		System.out.println(filaSupermercado);
	}
		
	}

}
