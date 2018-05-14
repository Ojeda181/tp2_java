package test;
import java.util.Scanner;

public class Persona8 {
	Scanner teclado;
	String nombre;
    int edad;
    public void inicializar() {
	   teclado= new Scanner(System.in);
	   System.out.print("Ingrese nombre:");
	   nombre=teclado.next();
	   System.out.print("Ingrese edad:");
	   edad=teclado.nextInt();
   }
   public void imprimir() {
	   System.out.println("nombre: "+nombre);
	   System.out.println("Edad:"+edad);
   }
   }

