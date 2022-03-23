/*
public class HolaMundo{
	public static void main(String[]args)
	{
		if(args.length == 0) 
		{
			System.out.println("Hola a todos!!");
			
		}	
		else if(args.length == 1)
		{
			System.out.println("Hola" +args[0]);

		}
		else if(args.length == 2)
		{
			System.out.println("Buenas tardes senor@ "+args[0]+" "+args[1]);

		}
	}
}
/*/
public class HolaMundo
{
	public static void main (String[] args)
	{
		String ingredientePrincipal =args[0];
		
		switch(ingredientePrincipal)
		{
			case "tomate":
			System.out.println("Picar el tomate, sal y aceite");
			break;
			
			case "huevo":
			System.out.println("En el sarten poner un huevo a freir");
			break;
			
			default:
			System.out.println("abrir lata de atun, picar cebolla y limon");
		}
	}
}