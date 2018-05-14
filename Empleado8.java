package test;
import test.Persona8;

public class Empleado8 extends Persona8{
	   float sueldo;
		
	   public void cargarSueldo(){
			System.out.print("Sueldo: $");
			sueldo = teclado.nextFloat();
	   }
	   public void imprimirSueldo(){
			System.out.println("Sueldo: " + "$" + sueldo);
	   }
public static void main (String[] ar) {
	   Empleado8 empleado1;
	   empleado1 = new Empleado8();
	   empleado1.inicializar();
	   empleado1.cargarSueldo();
	   empleado1.imprimir();
	   empleado1.imprimirSueldo();
	   
}
}