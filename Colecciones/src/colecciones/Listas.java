package colecciones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


public class Listas {
	
	public static void ejemplo1() {	
		// crear listas
		List<String> nombres = new ArrayList<String>();
		
		// añadir elementos
		nombres.add("Fran");
		nombres.add("Dani");
		nombres.add("Fran");
		nombres.add("Daniela");
		
		
		System.out.println(nombres);//esto tiene sentido si son nombres o numeros
		
		// recorrer una lista e imprime contenido
		for(String nombre : nombres) { //recorre x en la lista de nombres
			System.out.println(nombre); //imprime el nombre y repite hasta que acabe la lista
		}
		nombres.forEach(e -> System.out.println(e)); // Es lo mismo que lo anterior e = elemento en vez del singular en for
		nombres.forEach(e -> System.out.println(e + " García"));
		nombres.forEach(e -> System.out.println(e.length())); //4, 4, 4, 7 : longitud de la palabra
		nombres.forEach(e -> System.out.println(e));
		
		// eliminar
		nombres.remove(1); //borro posicionalmente
		System.out.println(nombres);
		nombres.remove("Fran"); //borra el primer fran que encuentra
		System.out.println(nombres);
		 
		// Añadir elemento en un lugar de la lista
		nombres.add(1, "Víctor");
		System.out.println(nombres);
		
		// tamaño lista
		System.out.println("El tamaño de la lista es: "+ nombres.size());
		
		// conversión lista a array (poco frecuente por limitaciones estáticas)
		String[] nombresArray = new String[nombres.size()];
		nombres.toArray(nombresArray);
		System.out.println("impresion de la lista");
		nombres.forEach(e->System.out.println(e));
		System.out.println("Impresion del array");
		System.out.println(Arrays.toString(nombresArray));
		
		// conversión array a lista
		String[] meses = {"Enero","Febrero","Marzo","abril","Mayo", "Junio", "Julio", "Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
		List<String> mesesLista = new ArrayList<String>(Arrays.asList(meses));
		System.out.println(mesesLista);
		
		// creación de una lista a partir de otra/s
		List<String> alumnosDam= new ArrayList<String>(Arrays.asList("Pablo", "Ismael", "Yessica"));
		List<String> alumnosEoi= new ArrayList<String>(Arrays.asList("Alberto", "Benjamin", "Camila", "Pablo"));
		List<String> alumnos = new ArrayList<String>(alumnosDam);
		List<String> alumnosborrados= new ArrayList<String>(Arrays.asList("Pablo", "Benjamin", "Yessica"));
		
		alumnos.addAll(alumnosEoi);
		// alumnos.forEach(e -> System.out.println(e)); asi se debería de imprimir btw
		System.out.println(alumnos);
		alumnos.removeAll(alumnosborrados); //Borración en masa de todos los nombres que sean iguales da igual cuantas veces esté
		System.out.println(alumnos);
		
		// borrar toda la lista
		alumnos.clear();
		if(alumnos.isEmpty()) {//boolean = true/false
			System.out.println("La lista esta vacía");
		}
		// ordenar lista
		alumnosEoi.sort(null); //Alfabetico
		System.out.println(alumnosEoi);
		alumnosEoi.sort(Collections.reverseOrder()); //Alfabetico
		System.out.println(alumnosEoi);
		alumnosEoi.sort(Comparator.comparingInt(String::length)); //tamaño
		System.out.println(alumnosEoi);
		alumnosEoi.sort(String.CASE_INSENSITIVE_ORDER.reversed()); //Alfabeto inverso sin tener cuenta minus mayus
		System.out.println(alumnosEoi);
	}
	
	public static void buscarlista() {
		List<String> meses = new ArrayList<String>(Arrays.asList("Enero", "febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"));
		if (meses.contains("Enero"))
			System.out.println("Enero existe en la lista");
	
		if(meses.containsAll(new ArrayList<String>(Arrays.asList("Enero","febrero"))))
			System.out.println("Enero y Febrero existen en la lista");
	}
	
	public static void reemplazarLista() {
		List<String> meses = new ArrayList<String>(Arrays.asList("Enero", "febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"));
		meses.replaceAll(e->e+" mes"); //Hace una operación a todos los elementos de una lista
		meses.forEach(e->System.out.println(e));
		
		meses = new ArrayList<String>(Arrays.asList("Enero", "febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"));		
		meses.replaceAll(e->e.substring(0, 1).toUpperCase() + e.substring(1).toLowerCase());
		
		// Buscar los elementos que queremos y cambiar el contenido de su posición
		meses.indexOf("Julio");
		meses.set(meses.indexOf("Julio"), "Verano");
		meses.set(meses.indexOf("Agosto"), "Verano");
		meses.set(11, "December");
		meses.forEach(e->System.out.println(e));
	}
	
	public static void algunasOperacionesCadenas() {
		String cadena = "Hola mundo";
		System.out.println(cadena.length());
		cadena.replace("Hola", "hola"); //No cambia por la inmutabilidad de la cadena
		System.out.println(cadena); 
		cadena = cadena.replace("Hola", "hola"); //ah si si
		System.out.println(cadena);
		System.out.println(cadena.toUpperCase()); //imprime la cadena pero no la cambia
		System.out.println(cadena.substring(0, 1).toUpperCase()); //Pilla la primera letra en mayúscula
		cadena = cadena.substring(0, 1).toUpperCase() + cadena.substring(1).toLowerCase(); //capitalizar una cadena
		System.out.println(cadena);
		
		//Capitalizar
		List<String> meses = new ArrayList<String>(Arrays.asList("enero", "febrero", "MarZo", "abRil", "Mayo", "Junio", "julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"));
		meses.replaceAll(e->e.substring(0, 1).toUpperCase() + e.substring(1).toLowerCase());
		meses.forEach(e->System.out.println(e));
		
		//Filtrar elementos en la cadena
		meses.stream()
			.filter(e->e.equals("Julio") || e.equals("Agosto"))
			.forEach(e -> System.out.println(e));
		
		String cadena2="Ah Esta es una cadena más larga que la anterior";
		//Encontrar todas las 'a' de esta cadena
		for (int i=0; i < cadena2.length(); i++) {
			if (cadena2.toLowerCase().charAt(i)=='a'|| cadena2.toLowerCase().charAt(i)=='á'){ //cambia la cadena a minus para encontrar A
				System.out.println("Encontrada una 'a' en la posición: " + i);
			}
		}
	}
		
	public static void buscarSiguiente() {
// dada una cadena, pregunta al usuario la subcadena a buscar y muéstrale esa subcadena hasta el final
// luego pregunta si quiere buscar la siguiente ocurrencia y mientras diga que sí, sácale el resultado.
		Scanner sc = new Scanner(System.in);
		String cadena="Esta es una cadena más larga que la Anterior";
		boolean salir = false;
		int posicionEncontrada = -1;
		
		System.out.println("Introduzca la cadena a buscar: ");
		String cadenaBuscada = sc.nextLine();
		
		while(!salir) {
			posicionEncontrada = cadena.toLowerCase().indexOf(cadenaBuscada.toLowerCase(), posicionEncontrada+1);
			if(posicionEncontrada!=-1) {
				System.out.println(cadena.substring(posicionEncontrada));
				System.out.println("Buscar siguiente? y / n");
				String respuesta = sc.nextLine();
				if(respuesta.toLowerCase().equals("n")) {
					salir = true;
					}
				} else {
				System.out.println("No se encuentran más ocurrencias de la cadena");
				salir = true;
				}	
		}	sc.close();
	}
		
	public static void reemplazar() {
		// dada una cadena, pregunta al usuario la subcadena a buscar y reemplaza
		// mientras el usuario quiera
				Scanner sc = new Scanner(System.in);
				String cadena="hola, hola, hola, adios";
				boolean salir = false;
				int posicionEncontrada = -1;
				
				System.out.println("Introduzca la cadena a buscar: ");
				String cadenaBuscada = sc.nextLine();
				
				System.out.println("Introduzca la cadena a reemplazar: ");
				String cadenaReemplazar = sc.nextLine();
				
				while(!salir) {
					posicionEncontrada = cadena.toLowerCase().indexOf(cadenaBuscada.toLowerCase(), posicionEncontrada+1);
					if(posicionEncontrada!=-1) {
						System.out.println(cadena.substring(posicionEncontrada));
						System.out.println("Reemplazar y buscar siguiente? y / n");
						String respuesta = sc.nextLine();
						if(respuesta.toLowerCase().equals("n")) {
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
				sc.close();
			}
	
	public static void ejemplosCondicionalesListas() {
			
		List<String> meses = new ArrayList<String>(Arrays.asList("Enero", "febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"));
		
		//borrar elementos con más de 7 letras		
		meses.removeIf(e->e.length()>6);
		System.out.println(meses);
		
		//retain All
		meses = new ArrayList<String>(Arrays.asList("Enero", "febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"));
		List<String> subconjunto = new ArrayList<String>(Arrays.asList("Julio", "Agosto"));
		//Quedarse con los elementos con menos de 7
		meses.retainAll(subconjunto);
		System.out.println(meses);	
	}
	
	public static void ejercicio1() {

		List<Integer> numeros = new ArrayList<Integer>(Arrays.asList(10,20,30,40,20));
		numeros.add(50);
		numeros.add(60);
		//numeros.remove(1); //borra la posición del 20
		//numeros.removeIf(n->n==20); //borra todos los 20
		numeros.remove(numeros.indexOf(20)); //borra la primera ocurrencia donde esté el 20
		numeros.add(1,25);
		numeros.add(2,26);
		numeros.sort(Collections.reverseOrder());
		System.out.println(numeros);
		
		
	
	}
	
	public static void main(String[] args) {
	//ejemplo1();
	//buscarlista();
	//reemplazarLista();
	//algunasOperacionesCadenas();
	//buscarSiguiente();
	//reemplazar();
	//ejemplosCondicionalesListas();
	ejercicio1();
	
	}
}


