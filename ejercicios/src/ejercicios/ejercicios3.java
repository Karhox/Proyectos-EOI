package ejercicios;


import java.util.Scanner;

public class ejercicios3 {

	public static void ejercicio1() {

		String[] meses = {"Enero","Febrero","Marzo","abril","Mayo", "Junio", "Julio", "Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número de mes (1 al 12):");
		int numero = sc.nextInt();
		System.out.println(meses[numero-1]);
		sc.close();
	}
	
	
	public static void main(String[] args) {
	ejercicio1();
	
	}
}
