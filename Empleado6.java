package test;
import java.util.Scanner;

public class Empleado6 {
	Scanner teclado = new Scanner(System.in);
	String nombre;
	float sueldo;
	
	public void cargar(){
		System.out.print("Nombre: ");
		nombre = teclado.nextLine();
		System.out.print("Sueldo: $");
		sueldo = teclado.nextFloat();
	}
	public void imprimir(){
		System.out.println("Nombre: " + nombre);
		System.out.println("Sueldo: " + "$" + sueldo);
	}
	
	public void impuestos(){
		if(sueldo >= 3000){
			System.out.print("Debe pagar impuestos");
		}else{
			System.out.print("No debe pagar impuestos");
		}
	}
	
	public static void main (String[] ar) {
		Empleado6 empleado1;
		empleado1 = new Empleado6();
		empleado1.cargar();
		empleado1.imprimir();
		empleado1.impuestos();
		
	}

}
