package test;
import java.util.Scanner;

public class Operaciones7 {
	Scanner teclado = new Scanner(System.in);
	int numero1; 
	int numero2; 
	
	public void ingreso(){
		System.out.print("Primero numero: ");
		numero1 = teclado.nextInt();
		System.out.print("Segundo numero: ");
		numero2 = teclado.nextInt();
	}
	public void suma(){
		System.out.println("Suma: " + (numero1+numero2));
	}
	public void resta(){
		System.out.println("Resta: " + (numero1-numero2));
	}
	public void multiplicacion(){
		System.out.println("Multiplicacion: "+ (numero1*numero2));
	}
	public void division(){
		System.out.println("Division: " + (numero1/numero2));
	}
	
	public static void main (String[] ar) {
	Operaciones7 operacion;
	operacion = new Operaciones7(); 
	operacion.ingreso();
	operacion.suma();
	operacion.resta();
	operacion.multiplicacion();
	operacion.division();
	}
}
