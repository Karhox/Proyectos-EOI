package proyecto2;

import java.util.Scanner;

public class Iterativas {
	
	public static void for1() {
		
	String oracion = "Hola mundo";
	for (int i = 0; i < 10; i++) { //si pones <= contaría 11 veces en vez de 10 y daría error
		System.out.println(oracion.charAt(i));
		}
	}
	
	public static void for2() {
		
	String oracion = "Hola mundo";
	for (int i=0; i < oracion.length(); i++) {
		System.out.println(oracion.charAt(i));
		}	
	}
	
	public static void for3() { //tablas normales
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Escriba la tabla que desea: ");
		int tabla = sc.nextInt();
		for (int i = 1; i <= 10; i++) {
			System.out.println(tabla + " * " + i + " = " + (tabla*i));
		}
		sc.close();		
	}
	
	public static void for4() { //tablas al revés
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Escriba la tabla que desea: ");
		int tabla = sc.nextInt();
		for (int i = 10; i > 0; i--) {
			System.out.println(tabla + " * " + i + " = " + (tabla*i));
		}	
		
		/* for (int i = 10; i >= 0; i--) { // saldrá el x * 0 = 0
				System.out.println(tabla + " * " + i + " = " + (tabla*i));
		} */
		
		sc.close();		
	}
	
	public static void for5() { //For complejo no habitual
	
		for (int i = 0, j = 10; i <= 10 && j>5 ; i++, j--) { // 0+10, 1+9, 2+8, 3+7, 4+6... i incrementa, j decrementa ( && j>5, en 6 para)
			System.out.println(i + " + " + j + " = " + (i + j));	
		}
	}
	
	public static void infinito1() { 
		
		//for (int i = 0; i >= 0; i++) { casi infinito
		for (int i = 0; i >= 0;) { //infinito de verdad
			System.out.println(i);	
		}
	}
	public static void infinito2() { 
		
		for (;;) { 
		System.out.println("Hey");	
		}
	}
	public static void while1() { 
		 	
		Scanner sc = new Scanner(System.in);
		int total = 0;
		while (total < 100) {
			System.out.println("Escribe un número (acumulado: " + total + "): ");
			int num = sc.nextInt();
			total += num; // total = total + num
		}
				
		System.out.println("El total acumulado ha sido:" + total);
		sc.close();
	}
	
	public static void whileComoFor() { 
		
		for (int i = 0; i < 10; i++) {  // x numero de veces de 1 en 1
			System.out.println(i);
		}
		
		int i= 0;
		while(i < 10) { //Contenido no lineal 
			System.out.println(i); 
			i++;
		}
	}
	public static void whileComoFor2() { 
		
		String oracion = "Hola mundo ";
		
		for (int i = 0; i < oracion.length(); i++) {
			System.out.println(oracion.charAt(i));
			}
		
		int i= 0;
		while(i < oracion.length()) {
			System.out.println(oracion.charAt(i)); 
			i++;
		}
	}

	public static void offTopicEnteros() { 
		
		//int numero = 2147483647;
		long numero = Integer.MAX_VALUE;
		System.out.println(numero);
		numero++;
		System.out.println(numero);
		
	}
		
	public static void main(String[] args) {
		//for1();
		//for2();
		//for3();
		//for4();
		//for5();
		//infinito1();
		//infinito2();
		//while1();
		//whileComoFor();
		//whileComoFor2();
		//offTopicEnteros();
	}
}
