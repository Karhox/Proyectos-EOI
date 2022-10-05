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
			System.out.printf("%02d:%02d:%3d\n", h1, m1, s1);
		}
		sc.close();	
	}
		
	public static void ejercicio8() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime un numero entero");
		int n1 = sc.nextInt();
		System.out.println((n1%2==0)?"Es par":"Es impar");
		sc.close();
	}
	
	public static void ejercicio9() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Dime el número de un mes: ");
		int mes = sc.nextInt();
		
		switch (mes) {
		case 1:
			System.out.println("Enero tiene 31 días");
			break;
		case 2:
			System.out.println("Febrero tiene 28 días");
			break;
		case 3:
			System.out.println("Marzo tiene 31 días");
			break;
		case 4:
			System.out.println("Abril tiene 30 días");
			break;
		case 5:
			System.out.println("Mayo tiene 31 días");
			break;
		case 6:
			System.out.println("Junio tiene 30 días");
			break;
		case 7:
			System.out.println("Julio tiene 31 días");
			break;
		case 8:
			System.out.println("Agosto tiene 31 días");
			break;
		case 9:
			System.out.println("Septiembre tiene 30 días");
			break;
		case 10:
			System.out.println("Octubre tiene 31 días");
			break;
		case 11:
			System.out.println("Noviembre tiene 30 días");
			break;
		case 12:
			System.out.println("Diciembre tiene 31 días");
			break;
		default:
			System.out.println("Ese número no corresponde a ningún mes");
			break;
		}
		sc.close();	
	}
	
	public static void ejercicio10() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Pulsa una tecla e intro");
		String c1 = sc.next();
		
		switch (c1) {
		case ",":
			System.out.println("Es un signo de puntuación");
			break;
		case ";":
			System.out.println("Es un signo de puntuación");	
			break;
		case "." :
			System.out.println("Es un signo de puntuación");
			break;
		case ":" :
			System.out.println("Es un signo de puntuación");
			break;
		case "1":
			System.out.println("Es un número");
			break;
		case "2":
			System.out.println("Es un número");
			break;
		case "3":
			System.out.println("Es un número");
			break;
		case "4":
			System.out.println("Es un número")
			;break;
		case "5":
			System.out.println("Es un número")
			;break;
		case "6":
			System.out.println("Es un número")
			;break;
		case "7":
			System.out.println("Es un número")
			;break;
		case "8":
			System.out.println("Es un número")
			;break;
		case "9":
			System.out.println("Es un número")
			;break;
		case "0":
			System.out.println("Es un número")
			;break;
		default:
			System.out.println("Es una letra")
			;break;
		}
		sc.close();
	}
	
	public static void ejercicio11() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe un número entero");
		int n1 = sc.nextInt();
		System.out.println("Escribe un segundo número entero");
		int n2 = sc.nextInt();
		System.out.println("Elige una de las siguientes opciones");
		System.out.printf("%-12s%12s\n", "1.Sumar","2.Restar");
		System.out.printf("%-12s%12s\n", "3.Multiplicar","4.Dividir");
		int n3 = sc.nextInt();
		if (n3==1) {
			System.out.println(n1 + " + "+ n2 + " = " + (n1+n2));
		}else if (n3==2) {
			System.out.println(n1 + " - "+ n2 + " = " + (n1-n2) );
		}else if (n3==3) {
			System.out.println(n1 + " x "+ n2 + " = " + (n1*n2) );
		}else if(n3==4) {
			System.out.println((n2==0)?"El divisor no puede ser 0":n1 + " / "+ n2 + " = " + (n1/n2) + " y resto " + (n1%n2));
		}else { 
			System.out.println("Tienes que elegir una de las 4 opciones");
		}
		sc.close();
	}
	
	public static void ejercicio12() {
		
		Scanner sc = new Scanner(System.in);
		double entrada = 50;
		System.out.printf("La entrada cuesta: %.0f€\n", entrada);
		System.out.println("¿Qué edad tienes?");
		int edad = sc.nextInt();
		if (edad<18) {
			entrada = entrada - (entrada*25/100);
			System.out.println("Tienes un descuento del 25%");
			System.out.printf("La entrada te cuesta: %.2f€", entrada);
		}else if (edad>=65) {
			System.out.println("¿Eres socio? si o no");
			String n1 = sc.next();
			if (n1.equals("si")) {
				entrada = entrada - (entrada*40/100);
				System.out.println("Tienes un descuento del 40%");
				System.out.printf("La entrada te cuesta: %.0f€", entrada);
			}else if (n1.equals("no")) {
				System.out.printf("No tienes nigún descuento disponible, son  %.0f€", entrada);
			}else {
				System.out.println("Por favor, debe escribir si o no");
			}	
		}else System.out.printf("No tienes nigún descuento disponible, son  %.0f€", entrada);	
		sc.close();
	}

	public static void ejercicio13() {
		
		for (int i = 20; i>0; i--) {
			System.out.println(i);
		}
	
		int i= 20;
		while(i > 0) { 
			System.out.println(i); 
			i--;
			}
		}
	public static void ejercicio14() {
		
			
		
	}

	public static void ejercicio15() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe un número");
		int n1 = sc.nextInt();
		int cifras = 0;
		while (n1!= 0) {
			n1 = n1 /10;
			cifras++;
			}			
		System.out.print("Tiene " + cifras + " cifra" );
		System.out.println((cifras==1)? "":"s");
		sc.close();
	}

	public static void ejercicio16() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe un número entero");
		for (int n1 = sc.nextInt();n1>0; n1--) {
			System.out.print("*");
		}
		sc.close();
	}

	public static void ejercicio17() {
		for (int i = 30; i>0; i--) {
			System.out.println((i%3!=0)?i:"");
		}
	}

	public static void ejercicio18() {
		for (int i = 0; i <=100; ) {  
			System.out.println(i);
			i++;
			i++;
			i++;
			i++;
			i++;
		}
	}

	public static void ejercicio19() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime un numero");
		int n1 = sc.nextInt();
		for (int n2 = 1; n2 <= n1 ;n2++) {
			System.out.print((n2!=n1)?n2 + ", ":n2);
		}
		sc.close();
	}

	public static void ejercicio20() {
		
		
	
		
	}

	public static void ejercicio21() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe un número para saber sus divisores");
		int n1 = sc.nextInt();
		for (int n2 = n1; n2>=1; n2--) {
		System.out.print((n1%n2==0)?n2 + " ": "");
		}
		sc.close();
	}


	public static void main(String[] args) {
		//ejercicio2();
		//ejercicio3();
		//ejercicio4();
		//ejercicio5();
		//ejercicio6();
		//ejercicio7();
		//ejercicio8();
		//ejercicio9();
		//ejercicio10();
		//ejercicio11();
		//ejercicio12();
		//ejercicio13();
						//ejercicio14();
		//ejercicio15();
		//ejercicio16();
		//ejercicio17();
		//ejercicio18();
		//ejercicio19();
						//ejercicio20();
		ejercicio21();
		//ejercicio22();
		//ejercicio23();
		//ejercicio24();
		//ejercicio25();
		//ejercicio26();
		//ejercicio27();
		//ejercicio28();
		//ejercicio29();
		//ejercicio30();
		
		
		
		
	}
}
