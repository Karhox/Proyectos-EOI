package ejercicios;

public class ejercicios4Funciones {
	
	public static void ejercicio1(String cadena) {
		for(int i=0; i<20; i++) {
			System.out.println(cadena);
		}
	}
	
	public static void ejercicio2(String cadena, int a, int b) {
		int letras = cadena.length();
		if(letras>=a && letras<=b)
			System.out.println("Está en el rango");
		else 
			System.out.println("No está en el rango");
	}
	public static void ejercicio2b(String cadena, int a, int b) {
		System.out.println((cadena.length()>=Math.min(a, b) && cadena.length()<=Math.max(a, b))?"Está en el rango":"No está en el rango");
	//la librería math hace que escoja el menor de los dos y el mayor
	}
	
	public static void ejercicio3(char caracter, int numero) {
		
		for (int fila = 0; fila < numero; fila++) {    
			for (int col = 0; col < numero; col++) {        
				System.out.print(caracter);    }    
			System.out.println(); // Generamos salto de línea }
		}	
	}
	public static void ejercicio3b(char caracter, int numero) {
		for(int i=0; i<numero;i++) {
			if(i==0 || i==numero-1) { //primera y ultima fila
				System.out.println(("" + caracter).repeat(numero)); //""+ caracter convierte el caracter en string para .repeat
			}
			else { //resto de filas
				System.out.println(caracter + (" ").repeat(numero-2) + caracter);
			}
		}	
	}
	
	public static void ejercicio4(String nombre, String...trabajos) {
		
		if(trabajos.length==0)
			System.out.println(nombre + " no ha trabajado nunca");
		else {
			System.out.println(nombre + " ha trabajo de:");
			for(int i=0;i<trabajos.length;i++) {
				System.out.println(trabajos[i]);
			}
		}
			
	}
	
	public static void main(String[] args) {
		/*ejercicio1("*");
		ejercicio1("*");
		ejercicio1("*");*/
		
		/*ejercicio2("Hola",2,4);
		ejercicio2("Adios",1,2);
		ejercicio2b("Hola",4,2);
		ejercicio2b("Adios",1,2);*/
		
		/*ejercicio3('-', 6);
		ejercicio3b('*', 6);*/
		
		ejercicio4("Pedro");
		ejercicio4("Roberto", "camarero", "cocinero", "taxista", "albañil", "actor");
	}
}
