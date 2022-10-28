package poo1;

import java.time.Duration;
import java.time.LocalDate;
//1. crear los atributos de la clase
//2. Crear constructores (vacio, todos los parámetros /opcional: crear más constructores y el de copia
//3. Crear Getters and Setters
//4. Crear toString
//5. Crear hashCode and Equals
//6. Opcional: métodos adicionales
import java.time.Period;

public class Persona {
	//Atributos de la clase (propiedades)
	String nombre;
	String apellido;
	String dni;
	String telefono;
	LocalDate fechaNaciemiento;
	
	//Constructores -> para crear personas
	public Persona () {
		
	}

	//source->generate constructor using fields
	public Persona(String nombre, String apellido, String dni, String telefono, LocalDate fechaNaciemiento) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.telefono = telefono;
		this.fechaNaciemiento = fechaNaciemiento;
	}

	//source->generate Getters and Setters -> consultar y modificar la información
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public LocalDate getFechaNaciemiento() {
		return fechaNaciemiento;
	}

	public void setFechaNaciemiento(LocalDate fechaNaciemiento) {
		this.fechaNaciemiento = fechaNaciemiento;
	}
	
	
	//source-> generate toString() imprimir una persona
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", telefono=" + telefono
				+ ", fechaNaciemiento=" + fechaNaciemiento + "]";
	}

	//comparar dni
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dni == null) ? 0 : dni.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		if (dni == null) {
			if (other.dni != null)
				return false;
		} else if (!dni.equals(other.dni))
			return false;
		return true;
	}

	/**
	 * Método que devuelve true si es mayor de edad, false en caso contrario
	 * considero mayor de edad restando la fecha actual a sus años y es >=18
	 * @return True si está rodado, false si no lo está
	 */
	public boolean adulto() {
		//Duration edad = Duration.between(fechaNaciemiento, LocalDate.now()); //equivalente a restar una fecha a otra pero da resultado en segundos
		Period edad = Period.between(this.fechaNaciemiento, LocalDate.now());
		int anyos = Math.abs(edad.getYears());

		if (anyos>=18) {
			return true;	
		}else {
			return false;
		}
	}
	
	
	
	
	
	
}

