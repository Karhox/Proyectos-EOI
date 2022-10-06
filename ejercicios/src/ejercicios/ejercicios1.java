package ejercicios;

import java.util.Scanner;

public class ejercicios1 {

	@SuppressWarnings("unused")
	private static void ejercicio1() {

		System.out.println("El resultado de 36 + 27 es: " + (36 + 27));
	}
	@SuppressWarnings("unused")
	private static void ejercicio2() {

		int n1 = 15;
		int n2 = 4;
		System.out.println("15+4= " + (n1 + n2));
		System.out.println("15-4= " + (n1 - n2));
		System.out.println("15*4= " + (n1 * n2));
		System.out.println("15/4= " + (n1 / n2));
		System.out.println("El resto es " + (n1 % n2));
	}
	@SuppressWarnings("unused")
	private static void ejercicio3() {

		int a = 1;
		int b = 2;
		System.out.println(a + " Es menor que " + b + ": " + (a < b));
		System.out.println(a + " Es igual a " + b + ": " + (a == b));
		System.out.println(a + " Es mayor que " + b + ": " + (a > b));
	}
	@SuppressWarnings("unused")
	private static void ejercicio4() {

		double n1 = 1;
		double n2 = 3;
		double n3 = 7;
		double n4 = 13.0;
		System.out.print((int) n1 + " ");
		System.out.print((int) n2 + " ");
		System.out.print((int) n3 + " ");
		System.out.println((int) n4);
		System.out.println((n1 + n2) * n3 / n4);
	}
	@SuppressWarnings("unused")
	private static void ejercicio5() {

		int n1 = 5;
		System.out.println("El valor de N es = " + n1);
		n1 += 77;
		System.out.println("n + 77 = " + n1);
		n1 -= 3;
		System.out.println("n - 3 = " + n1);
		n1 *= 2;
		System.out.println("n * 2 = " + n1);
	}
	@SuppressWarnings("unused")
	private static void ejercicio6() {

		int a = 1;
		int b = 2;
		int c = 3;
		int d = 4;
		int auxa = a;
		int auxb = b;
		int auxc = c;
		int auxd = d;
		System.out.println("Valores iniciales: A = " + a + " B = " + b + " C = " + c + " D = " + d);
		b = auxc;
		System.out.println("B toma el valor de C -> B = " + b);
		c = auxa;
		System.out.println("C toma el valor de A -> C = " + c);
		a = auxd;
		System.out.println("A toma el valor de D -> A = " + a);
		d = auxb;
		System.out.println("D toma el valor de B -> D = " + d);
	}
	@SuppressWarnings("unused")
	private static void ejercicio7() {

		char c1 = 'F';
		char c2 = 'X';
		System.out.println("'" + c1 + "' tiene la posición " + (int) c1);
		System.out.println("'" + c2 + "' tiene la posición " + (int) c2);
		System.out.println("Diferencia entre " + c1 + " y " + c2 + " es de " + (c2 - c1));
	}
	@SuppressWarnings("unused")
	private static void ejercicio8() {

		int a = 5;
		int b = ++a;
		int c = a++;

		System.out.println(b * 5);
		System.out.println(a * 2);

	}
	@SuppressWarnings("unused")
	private static void ejercicio9() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce tu nombre de usuario: ");
		String usuario = sc.nextLine();
		System.out.println("Hola " + usuario + "! Me alegro que estes de vuelta :D");
		sc.close();
	}
	@SuppressWarnings("unused")
	private static void ejercicio10() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número entero para duplicar y triplicar: ");
		String n1 = sc.nextLine();
		System.out
				.println("El doble es " + (Integer.parseInt(n1) * 2) + " y el triple es " + (Integer.parseInt(n1) * 3));
		sc.close();
	}

	@SuppressWarnings("unused")
	private static void ejercicio11() {
		System.out.println("Bienvenido al conversor de ºC a ºFahrenheit");
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce los grados centígrados: ");
		String c1 = sc.nextLine();
		System.out.println(32 + Integer.parseInt(c1) * 9 / 5 + "ºF");
		sc.close();
	}
	@SuppressWarnings("unused")
	private static void ejercicio12() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe un número de tres cifras: ");
		int n1 = sc.nextInt();
		int unidades = n1 % 10;
		int n2 = n1 / 10;
		int decenas = n2 % 10;
		int centenas = n2 / 10;
		System.out.println("Centenas: " + centenas + " decenas: " + decenas + " unidades: " + unidades);
		sc.close();
	}
	@SuppressWarnings("unused")
	private static void ejercicio13() {

		Scanner sc = new Scanner(System.in);
		System.out.print("Escribe tu día de nacimiento: ");
		int d1 = sc.nextInt();
		System.out.print("Escribe tu mes de nacimiento: ");
		int m1 = sc.nextInt();
		System.out.print("Escribe tu año de nacimiento: ");
		int a1 = sc.nextInt();

		int suma = d1 + m1 + a1;
		int n1 = suma % 10;
		int n2 = (suma / 10) % 10;
		int n3 = (suma / 100) % 10;
		int n4 = suma / 1000;
		int nSuerte = n1 + n2 + n3 + n4;
		System.out.println("Tu número de la suerte es " + nSuerte);
		sc.close();
	}
	@SuppressWarnings("unused")
	private static void ejercicio14() {

		Scanner sc = new Scanner(System.in);
		System.out.println("¿Cuántos años tienes?");
		int n1 = sc.nextInt();
		System.out.println("Dentro de 15 años tendrás " + (n1 + 15) + " años.");
		sc.close();
	}
	@SuppressWarnings("unused")
	private static void ejercicio15() {

		Scanner sc1 = new Scanner(System.in);
		System.out.println("Nombre del primer producto: ");
		String n1 = sc1.nextLine();
		System.out.println("Precio del producto: ");
		String p1 = sc1.nextLine();
		p1 = p1.replace(',', '.');

		Scanner sc2 = new Scanner(System.in);
		System.out.println("Nombre del segundo producto: ");
		String n2 = sc2.nextLine();
		System.out.println("Precio del producto: ");
		String p2 = sc2.nextLine();
		p2 = p2.replace(',', '.');

		Scanner sc3 = new Scanner(System.in);
		System.out.println("Nombre del primer producto: ");
		String n3 = sc3.nextLine();
		System.out.println("Precio del producto: ");
		String p3 = sc3.nextLine();
		p3 = p3.replace(',', '.');

		System.out.printf("%-15s%12s%12s\n", "NOMBRE", "PRECIO", "CON IVA");
		System.out.printf("%-15s%11.2s€%11.2f€\n", n1, p1, (Double.parseDouble(p1) * 1.21));
		System.out.printf("%-15s%11.2s€%11.2f€\n", n2, p2, (Double.parseDouble(p2) * 1.21));
		System.out.printf("%-15s%11.2s€%11.2f€\n", n3, p3, (Double.parseDouble(p3) * 1.21));
		
		sc1.close();
		sc2.close();
		sc3.close();
	}
	@SuppressWarnings("unused")
	private static void ejercicio20() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe 3 numeros: ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		System.out.println("Has escrito " + n1 + " + " + n2 + " + " + n3 + " = " + (int) (n1 + n2 + n3));
		sc.close();
	}
	@SuppressWarnings("unused")
	private static void ejercicio21() {
		Scanner sc = new Scanner(System.in);

		System.out.println("¿Cuál es tu nombre?");
		String n1 = sc.nextLine();
		System.out.println("¿Qué edad tienes?");
		int e1 = sc.nextInt();

		System.out.println("Estos son tus datos \n\tNombre: " + n1 + "\n\tEdad: " + e1);
		sc.close();

		// usar \n\t para salto de linea y tab
	}
	
	public static void main(String[] args) {
		

		// ejercicio1();
		// ejercicio2();
		// ejercicio3();
		// ejercicio4();
		// ejercicio5();
		// ejercicio6();
		// ejercicio7();
		// ejercicio8();
		// ejercicio9();
		// ejercicio10();
		// ejercicio11();
		// ejercicio12();
		// ejercicio13();
		// ejercicio14();
		// ejercicio15();
		// ejercicio20();
		// ejercicio21();

	}

}
