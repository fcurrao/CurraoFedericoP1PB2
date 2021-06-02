package curraoFedericoP1PB2;

public class Estudiantes {

	private String dni;
	private String apellido;
	private String nombre;
	Integer cantidadPrestados = 0;

	public Estudiantes(String dni, String apellido, String nombre){
		this.dni=dni;
		this.apellido=apellido;
		this.nombre=nombre;
		this.cantidadPrestados=cantidadPrestados;
		
		
		
		
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getCantidadPrestados() {
		return cantidadPrestados;
	}

	public void setCantidadPrestados(Integer cantidadPrestados) {
		this.cantidadPrestados = cantidadPrestados;
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
}
