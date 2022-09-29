package proyecto2;

import java.util.Scanner;

public class Ejercicios2 {
	
	public static void ejercicio2() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número entero: ");	
		int n1 = sc.nextInt();
		System.out.println((n1%10==0)?"El número es múltiplo de 10":"El número no es múltiple de 10");	
		sc.close();
	}
	
	public static void ejercicio3() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una letra ");
		String l1 = sc.nextLine();
		
		if (l1.equals("")) {
			System.out.println("Tienes que poner una letra!");
		} else if (l1.length() > 1) {
			System.out.println("Pon solamente UNA letra!");
		} else {
			char c1 = l1.charAt(0); //Permite cambiar una cadena en un carácter "string".charAt(0);
			System.out.println(c1 >= 'A' && c1 <= 'Z'? "Es mayúscula":"Es minúscula");	
		}
		sc.close();
	}

	public static void ejercicio4() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe la contraseña");
		String c1 = sc.nextLine();
		System.out.println("Escribe la contraseña otra vez");
		String c2 = sc.nextLine();
		
		System.out.println((c1.equals(c2))?"La contraseña es correcta":"Contraseña incorrecta");
		sc.close();
	}
	
	public static void ejercicio13() {
		
		for (int i = 20; i>0; i--) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		//ejercicio2();
		//ejercicio3();
		//ejercicio4();
		ejercicio13();
		
	}
}
