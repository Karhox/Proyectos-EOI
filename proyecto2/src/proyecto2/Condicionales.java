package proyecto2;
import java.util.Scanner;

public class Condicionales {
	
	public static void ejemplosIf() {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime tu nombre: ");
		
		String nombre = sc.nextLine();
		
		if (nombre.equals(" ")) {
			System.out.println("¡El nombre no puede estar vacío!");
		}
		
		System.out.println("Hola " + nombre);
		sc.close();
	}
	
	public static void main(String[] args) {
		ejemplosIf();
		
	}
}
