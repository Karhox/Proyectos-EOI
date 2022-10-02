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
	
	public static void ejercicio5() {
			
		Scanner sc = new Scanner(System.in);
		System.out.println("Dividendo: ");
		int n1 = sc.nextInt();
		System.out.println("Divisor: ");
		int n2 = sc.nextInt();
		
		if (n2==0) {
			System.out.println("El divisor no puede ser 0");
		} else {
			System.out.println(n1 + " : " + n2 + " = " + (n1/n2) + " con resto " + (n1%n2) );
		}
		sc.close();
	}

	public static void ejercicio6() {
			
		Scanner sc = new Scanner(System.in);
		System.out.println("Dame un número entero");
		int n1 = sc.nextInt();
		System.out.println("Dame otro número entero");
		int n2 = sc.nextInt();
		System.out.println("Dame otro número entero");
		int n3 = sc.nextInt();
		
		if (n1 > n2 ) {
			if (n1 > n3) {
				System.out.println(n1 + " Es el mayor número");}
		}else if( n2 > n3 ) {
			System.out.println(n2 + " Es el mayor número");
		}else {
			System.out.println(n3 + " Es el mayor número");
		}
		sc.close();
	}
	
	public static void ejercicio7() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime una hora");
		int h1 = sc.nextInt();
		System.out.println("Dime los minutos");
		int m1 = sc.nextInt();
		System.out.println("Dime los segundos");
		int s1 = sc.nextInt();
		
		if (h1<0) {
			System.out.println("Error, las horas van de 0 a 23");
		}else if(h1>23) {
			System.out.println("Error, las horas van de 0 a 23");
		}else if  (m1<0) {
			System.out.println("Error, los minutos van de 0 a 59");
		}
		else if(m1>59) {
				System.out.println("Error, los minutos van de 0 a 59");
		}else if  (s1<0) {
			System.out.println("Error, los segundos van de 0 a 59");
		}else if(s1>59) {
				System.out.println("Error, los segundos van de 0 a 59");
		}else {
			System.out.printf("%02d:%02d:%02d\n", h1, m1, s1);
		}
			
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
		//ejercicio5();
		//ejercicio6();
		ejercicio7();
		//ejercicio13();
		
	}
}
