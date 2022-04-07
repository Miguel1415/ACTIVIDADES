package app;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class MainColaPrioritaria 
{
	
	
	public static void main(String[] args) 
	{

		
		Producto leche1 = new Producto("leche 1 litro", LocalDate.of(2023, 11, 1));
		Producto leche2 = new Producto("leche 1 litro", LocalDate.of(2022, 3, 30));
		Producto leche3 = new Producto("leche 1 litro", LocalDate.of(2022, 7, 7));
		Producto leche4 = new Producto("leche 1 litro", LocalDate.of(2022, 10, 11));
		//revisa por que no la ordena bien

		Queue<Producto> inventario = new PriorityQueue<>(Comparator.comparing(Producto::getVencimiento));
		inventario.addAll(Arrays.asList(leche1,leche2,leche3,leche4));
		
		inventario.forEach (leche -> System.out.printf(
				"%sVenc  %tY-%tm-%td %n"
				, leche.getNombre()
				,leche.getVencimiento()
				,leche.getVencimiento()
				,leche.getVencimiento()
			)
		);
		
		//esto regresa la leche mas proxima a vencer.
		Producto leche = inventario.remove();
		
		//el uso de los metodos de la cola. 
		//son los mismos que los otros ejemplos.
	}
		private static void mostrarLecheaEnInventario(Queue<Producto> inventario) 
		{
			System.out.println();
			inventario.forEach(leche -> System.out.printf(
						"%s Vence: %s %n"
					,leche.getNombre()
					,leche.getVencimiento()
				)
			);
		}
}
class Producto
	{
	protected String nombre;
	protected LocalDate vencimiento;
	public Producto(String nombre, LocalDate vencimiento) 
	{
		this.nombre = nombre;
		this.vencimiento = vencimiento;
	}
	public String getNombre() {return nombre;}
	public LocalDate getVencimiento() {return vencimiento;}
	
	}
