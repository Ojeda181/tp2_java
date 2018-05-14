package test;
import java.util.Scanner;

public class Ej2 {
	 public static void main (String[] ar) {
		 Scanner teclado = new Scanner(System.in);
		 int numero; 
		 do{
			System.out.print("Ingrese un numero positivo ");
			numero = teclado.nextInt();
		 }
		 while(numero <= 0);
		 if(numero < 10){
				System.out.print("El numero tiene un solo dígito");
			}else{
				System.out.print("El numero tiene dos dígitos");
			}
}
}