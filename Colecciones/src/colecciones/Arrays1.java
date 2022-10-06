package colecciones;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Arrays1 {

		
	public static void ejemplo1() {
		int a;
		int [] numeros = new int[5]; //de la posición 0 a la 4
		int [] numeros2 = {6,4,3,8,5}; //Poner valores directamente
		String[] dias = new String[7]; 
		String[] meses = {"Enero","Febrero","Marzo","Abril","Mayo", "Junio", "Julio", "Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
		
		//Asignación de valores a los elementos de un array
		numeros[0] = 6;
		numeros[1] = 3;
		numeros[2] = 8;
		numeros[3] = -4;
		numeros[4] = 1;
		//numeros[5] = 3; Error 
		System.out.println("La suma da: "+ (numeros[1]+numeros[2]));
		
		dias[0] = "lunes";
		System.out.println(dias[1]); //Null -> No tiene un valor añadido
		System.out.println(meses[3]);
		
		//for -> tienes que saber la posición de cada valor
		for (int i=0;i<meses.length;i++) { //recorre todos los meses
			System.out.println(meses[i] + " es el mes " + (i+1));
		}
		
		//foreach -> resto de casos
		for(String mes : meses) { //recorre todos los meses -> más cómodo pero no sabes posiciones
			System.out.println(mes); //No recorre el valor de i
		}
		//foreach conociendo posiciones
		int numeroMes = 1;
		for(String mes : meses) {
			System.out.println(mes + " es el mes " + numeroMes);
			numeroMes++;
		}
		// Buscar un elemento dentro del array
		boolean encontrado = false;
		String mesBuscado1 = "Eneroooo";
		
		
		for (int i = 0; i < meses.length && !encontrado; i++) {
			if (meses[i].equals(mesBuscado1)) {
				encontrado = true;
			}
		}
		if (encontrado) {
			System.out.println("El nombre " + mesBuscado1 + " está en el array");
		} else {
			System.out.println(mesBuscado1 + " no encontrado");
		}
		
		// Alternativa más óptima = for anterior
		String mesBuscado2 = "Abril";
		
		if (Arrays.stream(meses).anyMatch(n -> n.equals(mesBuscado2))) {
			System.out.println("El mes "+ mesBuscado2 + " está en el array");
		} else {
			System.out.println(mesBuscado2 + " no encontrado");
		}
		
		//¿Hay alguno menor que 0?
		if (Arrays.stream(numeros).anyMatch(n -> n<0)) {
			System.out.println("Hay algún número negativo");
		} else {
			System.out.println("Todos los numeros son positivos");
		}
		
		//¿Todos los numeros son mayores que 0?
		if (Arrays.stream(numeros).allMatch(n -> n>=0)) {
			System.out.println("Todos son positivos");
		} else {
			System.out.println("Hay un negativo");
		}
	}
	public static void ordenar() {
		
		//Algoritmo de la burbuja
		int[] nums = { 15, 6, 9, 12, 20 }; 
		
		for (int i = 0; i < nums.length; i++)
		{for (int j = i + 1; j < nums.length; j++) 
		{ if (nums[j] < nums[i]) { // Intercambiamos 
			int aux = nums[i]; nums[i] = nums[j]; nums[j] = aux; 
			} 
		} 
		} 
	
		System.out.println(Arrays.toString(nums));

		//Funcional
		int[] nums2 = { 17, 6, 9, 4, 2 };
		
		Arrays.sort(nums2); //ordena el array
		System.out.println(Arrays.toString(nums2)); 
	
		
		String[] meses = {"Enero","Febrero","Marzo","abril","Mayo", "Junio", "Julio", "Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
		
		Arrays.sort(meses); //orden lexicográfico ~ normal por ascii, mayúsculas antes que minúsculas
		System.out.println(Arrays.toString(meses));
		
		Arrays.sort(meses, String.CASE_INSENSITIVE_ORDER); //orden case insensitive ~ No cuenta mayus y minus
		System.out.println(Arrays.toString(meses));
	
		Arrays.sort(meses, Collections.reverseOrder()); // orden inverso lexicográfico
		System.out.println(Arrays.toString(meses));
		
		Arrays.sort(meses, String.CASE_INSENSITIVE_ORDER.reversed()); // orden inverso insensitive
		System.out.println(Arrays.toString(meses));
		
		//Clase comparator
		
		Arrays.sort(meses,Comparator.comparingInt(String::length)); //Ordenar tamaño de palabras de mas corta a más larga
		System.out.println(Arrays.toString(meses));
		
		Arrays.sort(meses,Comparator.comparingInt(String::length).reversed()); //Ordenar tamaño de palabras de más larga a más corta
		System.out.println(Arrays.toString(meses));
		
		//Con nuestro propio comparator
		
		Arrays.sort(meses, (a,b)->Integer.compare(a.length(), b.length())); //Ordenar tamaño de palabras de otra forma c a l
		System.out.println(Arrays.toString(meses));
		
		Arrays.sort(meses, (a,b)->Integer.compare(b.length(), a.length())); //Ordenar tamaño de palabras de larga a corta 
		System.out.println(Arrays.toString(meses));
		
		Arrays.sort(meses, (a,b)->Integer.compare(a.length(), -b.length())); //Ordenar tamaño de palabras de otra forma
		System.out.println(Arrays.toString(meses));

	}	
	
	public static void CrearArrayApartirDeOtro() {
		
		String[] meses = {"Enero","Febrero","Marzo","abril","Mayo", "Junio", "Julio", "Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
		int [] letrasMeses = new int [meses.length]; //mismo tamaño que meses
		
		for (int i=0; i<meses.length; i++) {
			letrasMeses[i] = meses[i].length();
		}
		for (int mes : letrasMeses) { //imprimir el array creado
			System.out.println(mes);
		}
	}
	
	public static void main(String[] args) {
		//ejemplo1();
		//ordenar();
		CrearArrayApartirDeOtro();
	}
}


