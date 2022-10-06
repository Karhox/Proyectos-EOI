package colecciones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

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
		
		// conversión lista a array
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
		
	public static void main(String[] args) {
	//ejemplo1();
	buscarlista();
	}
}


