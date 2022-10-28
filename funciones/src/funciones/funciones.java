package funciones;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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
	/**
	 * hacer javadoc, puedes hacer una descripción de que hace la función
	 * @param numero
	 * @return
	 */
	public static int devolverCuadrado(int numero) {
		int cuadrado = numero*numero;
		return cuadrado;
	}
	
	public static boolean esPositivo(int numero) {
		if(numero>=0)
			return true;
		else
			return false;
	}
	
	public static String concatenarCadenas(String ...cadenas) { //... numero indeterminado de tipo cadena
		String resultado = "";
		System.out.println("He recibido " + cadenas.length + " cadenas");
		for ( int i = 0; i < cadenas.length; i++) {
			resultado = resultado + cadenas [i];
		}
		return resultado;	
	}
	
	public static int cambiarValor(int numero) {
		numero = numero + 1;
		return numero;
	}
	//Hacer lo mismo que el anterior pero metiendo dos int y devolverlos -> pasar por arrays o listas
	public static void cambiarValorArray(int[] numeros) {
		numeros[0] = numeros[0] + 1;
		numeros[1] = numeros[1] +1;
	}
	
	public static String cambiarString (String cadena) {
		cadena = cadena + " hola";
		return cadena;
	}
	
	public static void ejemplosMath() {
		double n1 = -23.40;
		double n2 = 2.39757;
		double n3 = 2.99;
		double n4 = -2.99;
		
		System.out.println(Math.abs(n1)); // Devuelve el valor absoluto
		System.out.println(Math.round(n2)); //Redondea 0.50
		System.out.println(Math.floor(n3)); //Número sin decimales por debajo, si es negativo en n4 da -3
		System.out.println(Math.ceil(n3)); //Devuelve el siguiente número 
		System.out.println(Math.max(23, 43)); //Numero más grande
		System.out.println(Math.min(4, 5)); //Numero más pequeño
		System.out.println(Math.sqrt(25)); //Raíz cuadrada
		System.out.println(Math.pow(5, 2)); //eleva el primer numero al segundo
		System.out.println(Math.sin(90)); //seno
		System.out.println(Math.random()); //Devuelve un double entre >=0 y <1
	}
	
	public static void ejemplosCadenas() {
		String cadena = "Hola";
		
		System.out.println(cadena.charAt(0));  // H -> Devuelve la letra en la posición asignada
		System.out.println(cadena.concat(" cruel")); //Hola mundo cruel, une una cadena a la otra
		
		String [] nombres = {"Paco", "Pepa", "Dani"};
		System.out.println(String.join(":", nombres)); // Paco:Pepa:Dani une los elementos de un array por un string
		//compara dos cadenas (primera letra) y devuelve un numero negativo si una es menor que la otra, positivo si es mayor, 0 si son iguales lexicograficamente
		String s1 = "ahora";
		String s2 = "despues";
		System.out.println(s1.compareTo(s2));
		
		String s = "Mi perro se llama comeniños";
		System.out.println(s.indexOf("perro")); //busca posicion
		s = s.replace("perro","koala");//Reemplaza
		System.out.println(s);
		String animal = s.substring(3,8);
		System.out.println(animal);
		
		s = "pato-gato-perro-koala";
		String[] animales = s.split("-"); //quita los - y separa 
		System.out.println("Hay " + animales.length + " animales");
		for(String animalString : animales) {
			System.out.println(animalString);
		}
	}
		
	public static void ejemplosFechas() {
		String fechaTexto = "01/12/2022";
		LocalDate fechaAhora = LocalDate.now();
		System.out.println(fechaAhora);
		LocalDate fechaAhoraMas30 = fechaAhora.plusDays(30); //suma numero de días
		System.out.println(fechaAhoraMas30);
		System.out.println(fechaAhora.plusWeeks(40)); //40 semanas
		System.out.println(fechaAhora.minusMonths(3));
		System.out.println(fechaAhora.getDayOfYear());
		System.out.println(fechaAhora.toEpochDay());//el día de la época, después de 1 enero de 1970
		System.out.println(fechaAhora.ofEpochDay(19284)); //te da la fecha
		
		String fechaTextoLarga = "2019-01-01 00:00:00 +0000 UTC";
		LocalDate fechaTextoConvertida = LocalDate.parse("2010-12-30");
		System.out.println(fechaTextoConvertida);
		System.out.println(LocalDate.parse("2010-12-30")); //formato AAAA-MM-DD
		System.out.println(LocalDate.parse("27/07/2000", DateTimeFormatter.ofPattern("d/M/yyyy")));//lo mas frecuente
		System.out.println(LocalDate.parse("2010-12-30+05:00", DateTimeFormatter.ISO_DATE));
	}
		
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//funcion1();
		//funcion2();
		//ejemplosMath();
		//ejemplosCadenas();
		ejemplosFechas();
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
		
		/*System.out.println("Introduce un número");
		int numero = Integer.parseInt(sc.nextLine());
		int numeroCuadrado = devolverCuadrado(numero); //método hecho por nosotros
		double numeroPow = Math.pow(numero, 2); //método de biblioteca matemática
		numeroCuadrado +=10;
		numeroPow += 10;
		System.out.println(numeroCuadrado);
		System.out.println(numeroPow);*/
		
		//Parámetros variables
		/*String resultado = concatenarCadenas("Hola");
		System.out.println(resultado);
		System.out.println(concatenarCadenas("Hola", "mundo"));
		System.out.println(concatenarCadenas("Hola", "mundo", "cruel"));*/
		 
		//paso de parametros por valor
		/*int numero=5;
		int cambio = cambiarValor(numero);
		System.out.println("Número: " + numero + " cambio: " + cambio);*/
	
		//los arrays y listas se pasan por referencia
		/*int[] numeros = new int[2];
		numeros[0] = 5;
		numeros [1] = 6;
		cambiarValorArray(numeros); 
		System.out.println("número 0: " + numeros[0] + " número 1: " + numeros[1]);
		
		String cad = "Hey";
		cambiarString(cad); //la cadena no cambia porque la inmutabilidad de las String
		System.out.println(cad);
		cad = cambiarString(cad); //tratarlo como un número; cadena = metodo que cambia la cadena
		System.out.println(cad);
		
		String otra = "otra";
		otra.concat(" cadena"); //no cambia
		System.out.println(otra);
		otra = otra.concat(" cadena");
		System.out.println(otra);*/
		
		//No cambia: int, float, double, char, String -> Se hace una copia y se trabaja con ella, las modificaciones no cambian directamente/ por valor
		//Si cambia: Arrays, Listas, Objetos -> las modificaciones afectan directamente al trabajar con el original / por referencia
	}
}


