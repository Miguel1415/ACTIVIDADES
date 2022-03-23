package calculadora;

public class Calculadora {

public static void main(String[] args) {
// si args no tiene 3 elementos
if( args.length != 3 ) {
// mostrar ayuda al usuario
System.out.println("Por favor entregue 3 argumentos. Ejemplo Calculadora 1 suma 2");
return;
}

String operacion = args[1];
switch(operacion) {
case "suma":
break;
case "resta":
break;
}
}



}