package proyecto1;

import java.util.Scanner;

public class HolaMundo {
	@SuppressWarnings("unused")
	private static void iniciacion() {
	
		int variable = 10;
		int numero1 = 4;
		int pipo = 14;
		double numeroConDecimales = 3.5;
		char letra = 'a';
		String cadena = "Esto es una cadena";
		String cadenaA= "a";
		String cadenaVacia = " ";
		
		// ej final int IVA= 21; //para mantener una variable CONSTANTE poner final y usar mayus
		// IVA = 25; -> Error
		final double IVA = 0.21; //mete el decimal y aplica la multiplicacion de 21/100
		
		
		System.out.println("Hola Mundo!");
		
		//System.out.println("syso + control + espacio + intro y escribir entre comillas");
		/*System.out.println("Es imporante comenzar el programa con 'main' control espacio intro");
		System.out.println( "luego para que no se vea usar /*");*/
		
		System.out.println(variable);
		System.out.println(numero1+variable+pipo);
		System.out.println(numero1 + numeroConDecimales);
		
		System.out.println(letra);
		System.out.println(cadena);
		System.out.println(letra + variable); //a + 10 = 107 porque "a" en ascii es 97, si es una cadena no la cambia
		System.out.println(cadenaA + variable); //Ese más concatena cadenas con numeros
		System.out.println(cadenaVacia); //Crea un hueco para rellenar ej registrar un usuario
		System.out.println(cadena + " " + cadenaA);// concatenación de cadenas + " " +
		System.out.println(cadena + '\n' + cadenaA); //Bajar un renglon + '\n' +
		System.out.println(cadena + '\t' + cadenaA); //Tabular + '\t' +
		System.out.println("La suma da: " + (variable + numero1)); //Entre parentesis la suma para que no sea una cadena; sin parentesis da 104
		int resto = 10 % 3; 
		System.out.println(10/3);
		System.out.println(resto);
		
		
		//Esto son sumas rápidas; poniendo directamente la variable se puede cambiar su valor
		numero1 += 3;
		System.out.println(numero1); //4+3=7
		numero1 -= 3;
		System.out.println(numero1); //7-3=4
		numero1 *= 3;
		System.out.println(numero1); //4*3=12
		numero1 /=4;
		System.out.println(numero1); //12/4=3
		
		double division = numero1/4; //Si los numeros son enteros el resultado es entero
		System.out.println(division); // 3/4 =0.0
		double division2 = numero1/4.0;//Poner decimales para que salga el resultado con decimal, sino sale entero
		System.out.println(division2); // 3/4=0.75
		
		double decimales1 = 3.4, decimales2 = 2.5; //Dos variables del mismo tipo en una linea
		
		int divisionDecimales = (int) (decimales1 + decimales2); //5 el (int) pasa el numero a entero
		System.out.println(divisionDecimales);
		
		double divisionDecimales1 = (int) (decimales1 + decimales2); // 5.0 (int) numero entero con decimal .0 al usar double
		System.out.println(divisionDecimales1);
		
		double divisionDecimales2 = (decimales1 + decimales2); // 5.9
		System.out.println(divisionDecimales2);
		//Se hace antes la operación entre () y despues se aplica el int,cambio de tipo, orden de precedencia
		
		double resultado = 7+4*2-5.0; //usar double por si salen decimales y poner un numero x.0 para que no trate todos los numeros como enteros
		System.out.println(resultado);
		
		double resultado1 = (7+4)/(2); // 5.0 al tratar todos como enteros
		System.out.println(resultado1); 
		double resultado2 = (7+4)/(2.0); // 5.5 al haber un decimal
		System.out.println(resultado2);
		int resultado3 = (7+4)/(2); //5, si pones aquí 2.0 da error
		System.out.println(resultado3);
		
		System.out.println(12==6);
		
		//en caso de estar usando variables
		int dos=2;
		int tres=3;
		double resultado4 = (double)tres / dos; //1.5, si no se asigna el double daría 1.0
		System.out.println(resultado4);
		
		int precio =100;
		System.out.println("La ropa cuesta: " + precio + "\nIVA:" + precio* IVA + "\nTOTAL: " + (precio + (precio*IVA)));
		
		//Preincremento, postincremento, predecremento, postcremento
		int valor=10;
		valor++; //11 valor = valor +1 postincremento
		valor--; //10 valor -1 postdecremento
		
		System.out.println( valor++); //10 imprime y suma
		System.out.println(valor); //11 imprime
		System.out.println(++valor); //12 suma e imprime preincremento
		System.out.println(valor); //12 imprime
		System.out.println(--valor); // 11 resta e imprime preincremento predecremento
		System.out.println(valor); //11 imprime
		valor =10; //resetear el valor a 10
		System.out.println( valor++ + ++valor + valor-- - --valor); //10+12+10-10 = 24 
		System.out.println(valor); //10
	}
	@SuppressWarnings("unused")	
	private static void conversiones() {
		
		int prefijo = 34;
		int telefono = 666666666;
		System.out.println(prefijo + telefono); //666666670
		
		 //Convesiones
		
		Scanner sc = new Scanner(System.in); //import scanner java util, permite escrprivate static void iniciacion() {
		
		System.out.println("" + prefijo + telefono); // 34666666666 Las "" hacen de cadena/string, conversion implicita
		System.out.println(String.valueOf(prefijo) + telefono); //string.valueOf(lo que se quiera cambiar a cadena) explícita
		System.out.println(Integer.toString(prefijo) + telefono); //integer.toString explícita
		 
		System.out.println("Introduzca el valor 1: "); 
		String valor1= sc.nextLine(); //permite al usuario colocar la cifra; pondremos 5
		valor1 = valor1.replace(',', '.'); //Remplaza las , por . y cambia la variable a la nueva
		valor1 = valor1.trim(); //quita los espacios por delante 
		//Para números enteros:
		/*
		System.out.println("El número que usted introdujo más 5 da: " + (valor1 +5)); //55 ;con letras: abc5
		System.out.println("El número que usted introdujo más 5 da: " + (Integer.parseInt(valor1) +5)); // 10 Integer.parseInt de cadena a numero; con letras falla java
		System.out.println("El número que usted introdujo más 5 da: " + (Integer.valueOf (valor1) +5)); // 10 Integer.valueOf de cadena a numero; */
		
		//Para decimales
		System.out.println("El número que usted introdujo más 5 da: " + (Double.parseDouble (valor1) +5)); // 10 Integer.valueOf de cadena a numero; 

		sc.close(); //Cierra el escaner, el colector de basura hace eso si no lo pones, si se queda abierto consume ram
	}
	@SuppressWarnings("unused")	
	private static void comparaciones() {
		int a= 1;
		int b= 2;
		double c= 1.0;
			
		String cad1="hola";
		String cad2="adiós";
		String cad3="Hola";
		
		System.out.println(a==b);
		System.out.println(a<b);
		System.out.println(a>b);
		System.out.println(a==c); //True porque pasa int a double
		
		//Las cadenas no se pueden comparar con == -> System.out.println(cad1==cad2);
		System.out.println(cad1.equals(cad2));
		System.out.println(cad1.equals(cad3));//Distingue mayúsculas y minúsculas 
		
		Scanner sc = new Scanner(System.in);
		String usu1= "Karhox";
		String con1= "123K";
		
		System.out.println("Introduce nombre de usuario: ");
		String usu2 =sc.nextLine();
		System.out.println(usu1.equals(usu2));
		System.out.println(usu1.equalsIgnoreCase(usu2)); //Ignora mayúsculas y minúsculas
		
	
		System.out.println("Introduce contraseña: ");
		String con2 =sc.nextLine();
		System.out.println(con1.equals(con2));
		System.out.println(con1.equalsIgnoreCase(con2));
		
		//Tabla de verdad
		
		System.out.println(usu1.equalsIgnoreCase(usu2) && con1.equalsIgnoreCase(con2)); //true si acierta los dos I lógico
		System.out.println(usu1.equalsIgnoreCase(usu2) || con1.equalsIgnoreCase(con2)); //true si acierta una O lógico
		System.out.println(usu1.equalsIgnoreCase(usu2)); //Devuelve el resultado de la condición, si acierta es true
		System.out.println(!usu1.equalsIgnoreCase(usu2)); //Devuelve lo contrario; Si acierta es false NO lógico
		sc.close();
	}
	@SuppressWarnings("unused")
	private static void formateo() {
		String nombre1 = "Paco";
		String nombre2 = "Anastasia"; 
		double salario1 = 20300.24; 
		double salario2 = 24439.6;
		//1
		System.out.println("      NOMBRE       SALARIO"); 
		System.out.println("    " + nombre1 + "     " + salario1); 
		System.out.println("    " + nombre2 + "     " + salario2); 
		System.out.println("---------------------------");
		
		
		//2 Numeros negativos alinean a la izquierda
		System.out.printf("%-12s%-14s\n", "NOMBRE", "SALARIO");
		System.out.printf("%-12s%-14f€\n", nombre1, salario1);
		System.out.printf("%-12s%-14f€\n", nombre2, salario2);
		System.out.println("---------------------------");
		
		
		//3 Numeros positivos alinean a la derecha
		System.out.printf("%12s%14s\n", "NOMBRE", "SALARIO");
		System.out.printf("%12s%14f€\n", nombre1, salario1);
		System.out.printf("%12s%14f€\n", nombre2, salario2);
		System.out.println("---------------------------");
		
		
		//4 El punto seguido de numero señala el numero de decimales
		System.out.printf("%12s%14s\n", "NOMBRE", "SALARIO");
		System.out.printf("%12s%14.2f€\n", nombre1, salario1);
		System.out.printf("%12s%14.2f€\n", nombre2, salario2);
		System.out.println("---------------------------");
		
	}
	
	public static void main(String[] args) {

			//iniciacion();
			//conversiones();
			//comparaciones();
			//formateo();	
			
	}
	
}
