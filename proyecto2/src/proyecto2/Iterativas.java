package proyecto2;

import java.util.Random;
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
	
	public static void doWhile1() {
		
		Scanner sc = new Scanner(System.in);
		int adivina = new Random().nextInt(10) +1; //Genera un numero entre 1 y 10; (10)genera del 0 y 9 por eso +1 o poner directmente (11)
		int intentos = 0;
		int num;
		do {
			System.out.println("Adivina el número del 1 al 10 (te queda" + (((3-intentos)==1)?" ":"n ") + (3-intentos) + " intento" + (((3-intentos)==1)?")":"s)"));
			num = sc.nextInt();
			intentos++;
		} while (adivina !=num && intentos<3);
		if (adivina == num) {
			System.out.println("Has acertado");	
		}else {
			System.out.println("Has fallado, el numero era "+ adivina);
		}
		sc.close();
	}
	
	public static void whileIgualQueDoWhile1() {
		
		Scanner sc = new Scanner(System.in);
		int adivina = new Random().nextInt(10) +1;
		int intentos = 0;
		int num = -1; //declarar un valor fuera del rango de variables/ distinto de adivina(numero random) 
		
		while (adivina !=num && intentos<3) {
			System.out.println("Adivina el número del 1 al 10 (te queda" + (((3-intentos)==1)?" ":"n ") + (3-intentos) + " intento" + (((3-intentos)==1)?")":"s)"));
			num = sc.nextInt();
			intentos++;
		}
		if (adivina == num) {
			System.out.println("Has acertado");	
		}else {
			System.out.println("Has fallado, el numero era "+ adivina);
		}
		sc.close();
	}
	
	public static void forIgualQueDoWhile1() {
		
		Scanner sc = new Scanner(System.in);
		int adivina = new Random().nextInt(10) +1;
		
		int num = -1;
		
		for (int intentos = 0; adivina !=num && intentos<3;intentos++) {
			System.out.println("Adivina el número del 1 al 10 (te queda" + (((3-intentos)==1)?" ":"n ") + (3-intentos) + " intento" + (((3-intentos)==1)?")":"s)"));
			num = sc.nextInt();
		}
		if (adivina == num) {
			System.out.println("Has acertado");	
		}else {
			System.out.println("Has fallado, el numero era "+ adivina);
		}
		sc.close();
	}
	
	public static void forIgualQueDoWhile1BreakContinue() {
		
		Scanner sc = new Scanner(System.in);
		int adivina = new Random().nextInt(10) +1;
		
		int num = -1;
		
		for (int intentos = 0; intentos<3;intentos++) { //solo una condición
			System.out.println("Adivina el número del 1 al 10 (te queda" + (((3-intentos)==1)?" ":"n ") + (3-intentos) + " intento" + (((3-intentos)==1)?")":"s)"));
			num = sc.nextInt();
			if (adivina==num) {
				break;
			}else {
				continue;
			}
		}
		if (adivina == num) {
			System.out.println("Has acertado");	
		}else {
			System.out.println("Has fallado, el numero era "+ adivina);
		}
		sc.close();
		
		
	}
	public static void ejemploMenuWhile() { 
		
		Scanner sc = new Scanner(System.in);
		int opcion=-1;
		while (opcion!=0) {
			System.out.println("1.jugar");
			System.out.println("2.guardar");
			System.out.println("3.Opciones");
			System.out.println("0.Salir");
			System.out.println("Introduzca opción");
			opcion= sc.nextInt();	
		}sc.close();
	}
	
	public static void ejemploMenuSwitch() { 
		
		Scanner sc = new Scanner(System.in);
		int opcion = -1;
		while (opcion!=0) {
			System.out.println("1.jugar");
			System.out.println("2.guardar");
			System.out.println("3.Opciones");
			System.out.println("0.Salir");
			System.out.println("Introduzca opción");
			opcion= sc.nextInt(); //cpger opcion
			switch (opcion) { //tratar opcion
			case 1:
				System.out.println("Has elegido jugar");
				break;
			case 2:
				System.out.println("Has elegido guardar");
				break;
			case 3:
				System.out.println("Has elegido Opciones");
				break;
			case 0:
				System.out.println("Gracias por jugar");
				break;
			default:
				System.out.println("Esa no es una opción");
				break;
			}	
		}sc.close();
	}
	public static void foranidado() { //for anidado
		for (int tabla = 1; tabla <=10; tabla++) {
			System.out.println("Tabla del " + tabla);
			for(int numero = 1; numero<=10; numero++) {
				System.out.println(tabla + "*" + numero + "= " + (tabla*numero));
			}
			System.out.println("Fin de la tabla de "+tabla +"\n");
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
		//doWhile1();
		//whileIgualQueDoWhile1();
		//forIgualQueDoWhile1();
		//ejemploMenuWhile();
		//ejemploMenuSwitch();
		//forIgualQueDoWhile1BreakContinue();
		foranidado();
		//offTopicEnteros();
	}
}
