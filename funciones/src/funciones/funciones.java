package funciones;

import java.util.Scanner;

public class funciones {
		
	public static void buscarSiguiente(String cadena, String cadenaBuscada) {
		
		Scanner sc = new Scanner(System.in);
		boolean salir = false;
		int posicionEncontrada = -1;
		while (!salir) {
			posicionEncontrada = cadena.toLowerCase().indexOf(cadenaBuscada.toLowerCase(), posicionEncontrada + 1);
			if (posicionEncontrada != -1) {
				System.out.println(cadena.substring(posicionEncontrada));
				System.out.println("Buscar siguiente? y / n");
				String respuesta = sc.nextLine();
				if (respuesta.toLowerCase().equals("n")) {
					salir = true;
				}
			} else {
				System.out.println("No se encuentran más ocurrencias de la cadena");
				salir = true;
			}
		}
	}

	public static void reemplazar(String cadena, String cadenaBuscada, String cadenaReemplazar) {
		Scanner sc = new Scanner(System.in);
		boolean salir = false;
		int posicionEncontrada = -1;

		while (!salir) {
			posicionEncontrada = cadena.toLowerCase().indexOf(cadenaBuscada.toLowerCase(), posicionEncontrada + 1);
			if (posicionEncontrada != -1) {
				System.out.println(cadena.substring(posicionEncontrada));
				System.out.println("Reemplazar y buscar siguiente? y / n");
				String respuesta = sc.nextLine();
				if (respuesta.toLowerCase().equals("n")) {
					salir = true;
				} else {
					cadena = cadena.replaceFirst(cadenaBuscada, cadenaReemplazar);
				}
			} else {
				System.out.println("No se encuentran más ocurrencias de la cadena");
				salir = true;
			}
		}
		System.out.println("La cadena ha quedado: " + cadena);
	}

	public static void funcion1() {
		System.out.println("hola mundo");

	}

	public static void funcion2() {

	System.out.println("adiós mundo");

	}
	public static void cuadrado(int numero) {
		System.out.println(numero*numero);
	}
	
	public static int devolverCuadrado(int numero) {
		int cuadrado = numero*numero;
		return cuadrado;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//funcion1();
		//funcion2();
		
		//Programa para buscar y reemplazar
		
		/*System.out.println("Primera búsqueda: ");
		buscarSiguiente("Esta es la cadena en la que quiero buscar", "a");
		System.out.println("Segunda búsqueda: ");
		buscarSiguiente("Esta es la cadena en la que quiero buscar", "e");
		System.out.println("Reemplazar: ");
		reemplazar("Esto es una cadena donde aparece esto y esto","esto","aquello");*/

		//Bucle para obtener el cuadrado de un numero
		
		/*int numero = -1;
		while (numero!=0) {
			System.out.println("Introduce un número (0 para acabar)");
			numero = Integer.parseInt(sc.nextLine());
			System.out.println("El cuadrado del numero es: ");
			cuadrado(numero);	
		}*/
		
		//Programa que pide un numero y te devuelve su cuadrado y después le suma 10
		
		System.out.println("Introduce un número");
		int numero = Integer.parseInt(sc.nextLine());
		int numeroCuadrado = devolverCuadrado(numero);
		double numeroPow = Math.pow(numero, 2);
		numeroCuadrado +=10;
		numeroPow += 10;
		System.out.println(numeroCuadrado);
		System.out.println(numeroPow);
		
	
	}
}


