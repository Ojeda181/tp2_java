package test;
import java.util.Scanner;

public class Ej5 {
	public static void main (String[] ar) {
		Scanner teclado = new Scanner(System.in);
		int acumulador = 0;
		int numero = 0; 
		while(numero != 9999){
			System.out.print("Ingrese un numero ");
			numero = teclado.nextInt();
			if(numero != 9999){
				acumulador = acumulador + numero;
			}
		}
		if(acumulador == 0){
			System.out.print("El acumulador es " + acumulador);
		}else{
			if(acumulador > 0){
				System.out.print("El acumulador es " + acumulador + " (Mayor a cero)");
			}else{
				System.out.print("El acumulador es " + acumulador + " (Menor a cero)");
			}
		}
	}
}
