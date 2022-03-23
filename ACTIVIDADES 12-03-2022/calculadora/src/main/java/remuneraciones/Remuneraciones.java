package remuneraciones;

public class Remuneraciones {
	public static void main(String []args) {
	if(args.length < 6) 
	{
		//si se ejecuta el programa sin argumentos
		mostarAyuda();
	}else 
	{
	calcularRemuneraciones(args);
	}
	}
	private static void calcularRemuneraciones() {
		// TODO Auto-generated method stub
		
	}
	private static void mostarAyuda() {
		// TODO Auto-generated method stub
		System.out.println("Remuneraciones[sueldo-base][colacion][movilizacion][afo][salud][tipo-contrato]");
		
	}
	private static void calcularRemuneraciones(String[] args) {
		int sueldoBase    = Integer.parseInt(args[0]);
		int colacion      = Integer.parseInt(args[1]);
		int movilizacion  = Integer.parseInt(args[2]);
		String afp        = args[3];
		String salud      = args[4];
		char tipoContrato = args[5].charAt(0);
		
		int montoImponible = calcularMontoImponible(sueldoBase);
		int montoAFP = calcularMontoAFP(montoImponible,afp);
		
	System.out.printf("AFP: %s\n", afp);
	System.out.printf("Monto AFP: $%d\n");
	
		// TODO Auto-generated method stub
		
	}
	
	private static int calcularMontoImponible(int sueldoBase) 
	{
	 return sueldoBase;	
	}
	private static int calcularMontoNoImponible(int colacion, int movilizacion) 
	{
		return colacion + movilizacion;
		
	}
	private static int calcularMontoAFP(int montoImponible, String afp) 
	{
		switch(afp) 
		{
		case "capital":
		{
			return (int) (montoImponible * 0.1144);
		}
		case "cuprum":
		{
			return (int) (montoImponible * 0.1144);
		}
		case "habitat":
		{
			return (int) (montoImponible * 0.1127);
		}
		case "planvital":
		{
			return (int) (montoImponible * 0.1116);
		}
		case "provida":
		{
			return (int) (montoImponible * 0.1145);
		}
		case "modelo":
		{
			return (int) (montoImponible * 0.1058);
		}
		case "uno":
		{
			return (int) (montoImponible * 0.1069);
		}
		
	  }
		return 0;
	}
	
	
	

}
