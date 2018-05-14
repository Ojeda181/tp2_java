package test;
import java.util.Scanner;

public class Ej3 {
		 public static void main (String[] ar) {
			 Scanner teclado = new Scanner(System.in);
			 int [] numero = new int[10];
			 int i = 0;
			 int positivo = 0;
			 int negativo = 0;
			 while(i < 10){
				 System.out.print("Ingrese un numero: ");
				 numero[i] = teclado.nextInt();
				 if(numero[i] % 2 == 0){
					 positivo = positivo + 1;
				 }else{
					 negativo = negativo + 1;
				 }
				 i = i + 1;
			 }
			 System.out.println("Hay " + positivo + " numeros positivos");
			 System.out.print("Hay " + negativo + " numeros negativos");
		 }
}
