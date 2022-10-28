package ficheros;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class ejemplosFicheros {
	
	
	public static void leer1(String directorio, String nombreFichero) throws IOException {
		
		String rutaAbsoluta = directorio + File.separator + nombreFichero; //contruir cadena
	
		Path rutaOrdenador = Paths.get(rutaAbsoluta);//path pasa una string a una ruta del ordenador
		
		List<String> lineasFichero = Files.readAllLines(rutaOrdenador); //leer el fichero y pasarlo a una lista
		
		lineasFichero.forEach(l->System.out.println(l)); //recorrer las líneas
	}
	public static void leerRutaEntera(String ruta) {
		try {
			Files.readAllLines(Paths.get(ruta)).forEach(l->System.out.println(l));
		} catch (IOException e) {
			e.printStackTrace();
		}System.out.println("No he encontrado el fichero"); 
		//con try catch si falla se sigue ejecutando el programa, se controla el error
		//con throw si falla el programa se para
	}

	
	public static void leerfichero(String directorio, String nombreFichero) throws IOException {
		Files.readAllLines(Paths.get(directorio + File.separator + nombreFichero)).forEach(l->System.out.println(l));
	}
	
	/**
	  Ejemplo de métopdo sobrecargado 
	 * dos metodos para una orden depende de si recibe una ruta completa o el directorio y el fichero
	 * El segundo método llama al primero método
	 * @param directorio
	 */
	public static void leerfichero(String ruta){
		File fichero = new File (ruta);
		try {
			leerfichero(fichero.getParent(), fichero.getName()); //get parent nombre de carpeta, get name nombre de fichero
		} catch (IOException e) {
			
			e.printStackTrace();
		} 
	}

	
	/*public static void suma(int a, int b) {
		return (a+b);
	}
	//ejemplo de parámetros pr defecto
	public static void suma(int a) { //si solo da la variable a se le suma 5
		return suma(a+5);
	}*/
	
	
	/**
	 * Crea un fichero y escribe en el
	 * @param directorio
	 * @param nombreFichero
	 * @param lineas
	 * @throws IOException
	 */
	public static void escribir1(String directorio, String nombreFichero, List<String> linea)  {
		try {
			Files.write(Paths.get(directorio + File.separator + nombreFichero), linea, StandardOpenOption.CREATE_NEW);
		} catch (IOException e) {
			System.out.println("ya esta creado pesao");
		}
	}
	
	public static List<String> devolverLineasFichero(String directorio, String nombreFichero) {
		try {
			return Files.readAllLines(Paths.get(directorio + File.separator + nombreFichero));			
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
	
	public static void ejemploTry() {
		int numero1 = 10;
		int numero2 = 0;
		try {
		int division = numero1/numero2;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void ejemploTry2() {
		int numero1 = 10;
		int numero2 = 3;
		String cadena = null;
		int longitudCadena;
		
		try {
			if(cadena!=null)
				longitudCadena=cadena.length();
			else 
				throw new Exception("Cadena Nula");
				
			int division = numero1/numero2;
			Files.write(Paths.get("D:\\fichero\\eoi.txt"), Arrays.asList(""+division), StandardOpenOption.CREATE_NEW);
			
		} catch (ArithmeticException e) { //errores de mates
			e.printStackTrace(); //esto muetra el error
			System.out.println("Error en la división");
			
		} catch (IOException e) { //errores de ficheros
			e.printStackTrace();
			System.out.println("Error acceso al fichero");
			
		} catch (Exception e) { //errores en general; recordar árbol de errores
			e.printStackTrace();
			System.out.println("Otro tipo de error");
		} finally {
			System.out.println("Esto se ejecuta siempre, da igual si falla o no el programa");
		}
		System.out.println("Y esto al estar fuera del catch también");
	}
	public static void main(String[] args) throws IOException {
		
		
		//leer1("D:\\ficheros", "eoi.txt");
		//leerRutaEntera("D:\\ficheros\\eo.txt");
		
		//Métodos sobrecargados, el metodo con menos variables llama a la segunda
		//leerfichero("D:\\ficheros", "eoi.txt");
		//leerfichero("D:\\ficheros\\eoi.txt");
		
	
		List<String> lineas = devolverLineasFichero("D:\\ficheros", "eoi.txt"); //convierte lo que devuelve el método (devuelve lista de cadenas) en una variable 
		//busca e imprime trabajando con la variable
		//programacion estructurada
		for(String linea : lineas) {
			if(linea.contains("era"))
				System.out.println(linea);
		}
		//programación funcional
		lineas.stream().
		filter(l->l.contains("era")).
		forEach(l->System.out.println(l));
		
		//En un paso trabjando con lo que devuelve el método
		devolverLineasFichero("D:\\ficheros", "eoi.txt").stream().
		filter(l->l.contains("era")).
		forEach(l->System.out.println(l));
		
		//List<String> lineas = Arrays.asList("Linea1" , "Linea2");
		//escribir1("D:\\ficheros", "ejemploeoi.txt", lineas);
		
		//ejemploTry(); System.out.println("Fin del main");
		//ejemploTry2();
	}
}
