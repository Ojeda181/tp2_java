package test;
import java.util.Scanner;
public class Ej1 {
public static void main(String [] ar) {
	Scanner teclado=new Scanner(System.in);
	int cantidad;
	float precio;
	System.out.print("Ingrese la cantidad: " );
	cantidad=teclado.nextInt();
	System.out.print("Ingrese el precio: ");
	precio=teclado.nextFloat();
	float total= cantidad*precio;
	System.out.print(total);
}
}
