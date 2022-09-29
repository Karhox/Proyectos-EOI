package proyecto2;
import java.util.Scanner;

public class Condicionales {
	
	public static void ejemplosIf() {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime tu nombre: ");
		String nombre = sc.nextLine();
		
		if (nombre.equals("")) {
			System.out.println("¡El nombre no puede estar vacío!");
		}
		
		System.out.println("Hola " + nombre);
		sc.close();
	}
	
	public static void ejemplosIfElse() {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime tu nombre: ");
		String nombre = sc.nextLine();
		
		if (nombre.equals("")) {
			System.out.println("¡El nombre no puede estar vacío!");
		} else {
			System.out.println("Hola " + nombre);
		}
		
		sc.close();
		System.out.println("Esto se imprime siempre al estar fuera del IfElse");
	}
	
	public static void ejemplosIfElseIf() { //Con else if pueden ponerse varias difurcaciones
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime tu nombre: ");
		String nombre = sc.nextLine();
		
		if (nombre.equals("")) {
			System.out.println("El nombre no puede estar vacío!");
		} else if (nombre.length()==1) {
			System.out.println("No es un nombre muy corto?");
		} else if (nombre.length()==2) {
			System.out.println("Me sigue pareciendo un nombre corto");
		} else {
			System.out.println("Hola "+ nombre);
		}
		sc.close();
	}
	public static void ternario1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime tu nombre: ");
		String nombre = sc.nextLine();
		
		System.out.println(nombre.equals("")?"El nombre no puede estar vacío!":"Hola " + nombre); //Sustituto de un if else
		// Poner primero lo del if con ? si se cumple, separar por : , si no se cumple
		/*System.out.println(nombre.equals("")?"El nombre no puede estar vacío!":(nombre.length()==1)?"No es un nombre muy corto?":"Hola " + nombre);
		Esto no se usa por dificultad de lectura*/
		
		System.out.println("Dime un número: ");
		int numero = sc.nextInt();
		System.out.println((numero%2==0)?"El número es par":"El número es impar");
		//%2 si el resto de dividir entre 2 es 0 significa que es par
		sc.close();
		
	}
	public static void ternario2() {
		int edad1= 4;
		int edad2= 7;
		int diferencia = (edad1 > edad2)? edad1 - edad2 : edad2 - edad1;
		System.out.println(diferencia); // 7-4=3
		
	}
	public static void ejemplos() {
	
		
	}
	public static void main(String[] args) {
		//ejemplosIf();
		//ejemplosIfElse();
		//ejemplosIfElseIf();
		ternario1();
		//ternario2();
		//ejemplos();
	}
}
