package colecciones;

import java.util.Arrays;

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
		numeros[3] = 4;
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
		String mesBuscado = "Enero";
		for (int i = 0; i < meses.length && !encontrado; i++) {
			if (meses[i].equals(mesBuscado)) {
				encontrado = true;
			}
		}
		if (encontrado) {
			System.out.println("El nombre " + mesBuscado + " está en el array");
		} else {
			System.out.println(mesBuscado + " no encontrado");
		}
		
		// Alternativa más óptima
		
		if (Arrays.stream(meses).anyMatch(n -> n.equals(mesBuscado))) {
			System.out.println("El nombre "+ mesBuscado + " está en el array");
		} else {
			System.out.println(mesBuscado + " no encontrado");
		}
	}
			
	public static void main(String[] args) {
		ejemplo1();
	}
}


