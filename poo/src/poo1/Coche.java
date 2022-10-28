package poo1;

//1. crear los atributos de la clase
//2. Crear constructores (vacio, todos los parámetros /opcional: crear más constructores y el de copia
//3. Crear Getters and Setters
//4. Crear toString
//5. Crear hashCode and Equals
//6. Opcional: métodos adicionales

//Atributos de clase
public class Coche{ 

	private String matricula;
	private String marca;
	private String modelo;
	private int anyo;
	private int kms;
	
	//constructor vacio
	public Coche(){
	}
	
	//Constructor con TODOS los parámetros
		//click derecho : //Source -->  GENERATE CONSTRUCTOR USING FIELDS ,  generate 
	public Coche(String matricula, String marca, String modelo, int anyo, int kms) {
		super();
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		
		//Se pueden modificar los datos metiendo otros datos o condicionantes
		if (anyo>50 && anyo<99)
			this.anyo=1900+anyo;
		else if(anyo>=0 && anyo <=50)
			this.anyo=2000+anyo;
		else
			this.anyo = anyo;
		
		this.kms = kms;
	}
	
	//constructor con tres parámetros
	public Coche(String matricula, String marca, String modelo) {
		super();
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
	}
	
	//Constructor de COPIA	
		//copiar y pegar el constructor, quitar los atributos y ponerle un nombre, 
			//añadir en los constructores c. antes de los atributos
	public Coche(Coche c) {
		super();
		this.matricula = c.matricula;
		this.marca = c.marca;
		this.modelo = c.modelo;
		this.anyo = c.anyo;
		this.kms = c.kms;
	}

	//GETTER Y SETTER
		//GET da posibilidad de leer la información de los atributos al ser privados 
		//SET da la posibilidad de modificar la información
			//click derecho : //Source -->  GENERATE GETTER AND SETTER , select all, generate 
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAnyo() {
		return anyo;
	}

	public void setAnyo(int anyo) {
		this.anyo = anyo;
	}

	public int getKms() {
		return kms;
	}

	public void setKms(int kms) {
		
		this.kms = Math.abs(kms); //Modicficación para que haga el valor absoluto 
	}

	
	//toString
		//Permite imprimir la lista, da el formato de salida del mensaje para el string
			//click derecho : //Source -->  GENERATE TOSTRING , select all, generate 
	@Override
	public String toString() {
		return "Coche [matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", año=" + anyo + ", kms="
				+ kms + "]";
		
		/*String resultado = "Matricula: " + matricula + "\n" 
		 + "Marca: " + marca + "\n" 
		 + "Modelo: " + modelo + "\n" 
		 + "Año: " + anyo; 
		 Return resultado;*/
	}
	//HASHCODE AND EQUALS
	//Efectos de comparación de objetos

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((marca == null) ? 0 : marca.hashCode());
		result = prime * result + ((matricula == null) ? 0 : matricula.hashCode());
		result = prime * result + ((modelo == null) ? 0 : modelo.hashCode());
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
		Coche other = (Coche) obj;
		if (marca == null) {
			if (other.marca != null)
				return false;
		} else if (!marca.equals(other.marca))
			return false;
		if (matricula == null) {
			if (other.matricula != null)
				return false;
		} else if (!matricula.equals(other.matricula))
			return false;
		if (modelo == null) {
			if (other.modelo != null)
				return false;
		} else if (!modelo.equals(other.modelo))
			return false;
		return true;
	}
	
	
	//Métodos adicionales
	
	/**
	 * Método que dado un coche te dice si es nuevo o viejo basándose en el año 2000
	 * @return Cadena "Nuevo" si es mayor a 2000 o "Viejo"en caso contrario
	 */
	public String estado() {
		if (this.anyo>=2000) {
			return "Nuevo";	
		}else {
			return "Viejo";
		}
	}
	
	/**
	 * Método que devuelve true si el coche ha hecho el rodado, false en caso contrario
	 * considero rodado si tiene más de 10000kms
	 * @return True si está rodado, false si no lo está
	 */
	public boolean rodado() {
		if (this.kms>=10000) {
			return true;	
		}else {
			return false;
		}
	}
	
	
}