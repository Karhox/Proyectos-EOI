package poo1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class pruebas {
	static Scanner sc;
	static List<Coche> coches = new ArrayList<Coche>();
	
	public static void personas() {
		Persona vacia = new Persona(); //Llama al contrsuctor sin parámetros
		Persona fran = new Persona("Fran", "García", "111x", "666666666", LocalDate.parse("1976-07-27"));
		Persona Dani = new Persona("Fran", "García", "222x", "666666676", LocalDate.of(1979,12,3));
		
		System.out.println(fran); //llama al toString
		
		vacia.setNombre("Consuelo");
		vacia.setApellido("López");
		
		
		System.out.println("Nombre de vacia " + vacia.getNombre());
		System.out.println("Apellido de vacia " + vacia.getApellido());
		
		if(fran.adulto()) {
			System.out.println("Es mayor de edad \n");
		} else {
			System.out.println("Es menor de edad \n");
		}
		
	}
	
	public static void coches() {
		
		Coche vacio = new Coche(); //Crear un coche con el constructor vacio
		Coche todosParametros = new Coche("9093CNJ" , "Nissan" , "Micra" , 2011 , 120000 ); //usa el constructor con todos los parámetros
		Coche tresParametros = new Coche("15168BBB", "BMW", "Z3"); //usa el constructor de 3 parametros
		Coche todosParametros2 = new Coche("15168BBB", "BMW", "Z3", 1990, 2684888);
		Coche copia = new Coche(todosParametros); //usa el constructor de copia - coge la información de todosParametros
		
		Coche noCoche = todosParametros; //no crea un nuevo coche, sino añade un alias, si se modifica este tambien se modifica el otro
		//Para crear nuevos coches se necesita un new
		
		System.out.println(todosParametros.getMatricula()); //uso del get
		copia.setMatricula("1234ABC"); //uso del set
		System.out.println(copia.getMatricula());
		
		System.out.println(todosParametros);
		System.out.println(tresParametros);
		System.out.println(copia);
		
		//comprueba si son el mismo coche por el criterio seleccionado (matricula, marca, modelo)
		
		if (todosParametros.equals(tresParametros)) { 
		System.out.println("Son el mismo coche");
		}else {
			System.out.println("Son coches distintos");
		}
		
		if (todosParametros2.equals(tresParametros)) { 
			System.out.println("Son el mismo coche");
			}else {
				System.out.println("Son coches distintos");
			}
		
		//Uso del nuevo método estado
		System.out.println(todosParametros.estado());
		System.out.println(vacio.estado());
		
		//uso de método rodado
		if(todosParametros.rodado()) {
			System.out.println("El coche está en condiciones de uso");
		} else {
			System.out.println("El coche no ha sido probado suficientemente");
		}
			
	}
	
	public static void menu() {
		int opcion;
		do {
			System.out.println("Menu");
			System.out.println("1. Dar de alta un coche");
			System.out.println("2. Dar de baja un coche");
			System.out.println("3. Modificar un coche");
			System.out.println("4. Números de coches rodados en la empresa");
			System.out.println("5. Mostrar coches de la empresa");
			System.out.println("0. Salir");
			opcion = Integer.parseInt(sc.nextLine());
			switch (opcion) {
			case 1:
				darAlta();
				break;
			case 2:
				darBaja();
				break;
			case 3:

				break;
			case 4:
				System.out.println(coches.stream().filter(c->c.rodado()==true).count());
				break;
			case 5:
				coches.forEach(e->System.out.println(e));
				break;
			case 0:

				break;
			default:
				break;
			}
		} while (opcion!=0);

	}
	
	public static void darAlta() {
		System.out.println("Introduzca la matricula:");
		String matricula = sc.nextLine();
		System.out.println("Introduzca la marca:");
		String marca = sc.nextLine();
		System.out.println("Introduzca el modelo:");
		String modelo = sc.nextLine();
		System.out.println("Introduzca el año:");
		int anyo = Integer.parseInt(sc.nextLine());
		System.out.println("Introduzca kilómetros recorridos:");
		int kms = Integer.parseInt(sc.nextLine());
		Coche alta = new Coche(matricula,marca,modelo,anyo,kms);
		coches.add(alta);
	}
	
	public static void darBaja() {
		System.out.println("Introduzca la matricula del coche que quiera dar de baja:");
		String matricula = sc.nextLine();
		for (Coche c : coches) {
			if(c.getMatricula().equals(matricula)) {
				coches.remove(c);
				break;
			}
		}
		
		System.out.println("Se ha dado de baja correctamente");

	}
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		//personas();
		//coches();
		menu();
		sc.close();
	}
	
}
