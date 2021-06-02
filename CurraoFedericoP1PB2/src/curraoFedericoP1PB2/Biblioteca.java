package curraoFedericoP1PB2;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
	private List<Libros> prestados;
	private Integer contador = 0;

	public Biblioteca() {
		this.prestados = new ArrayList<>();

	}
	

	
	
	
	
	
	public Estudiantes prestarunlibroAalumno(Estudiantes estudiante) {
		
		for (Libros libro: this.prestados)	{
			if(libro.estaDisponible(libro) == true) {
				if(estudiante.getCantidadPrestados()<2) {
				contador++;	
				estudiante.setCantidadPrestados(contador);	
				
				prestados.add(libro);
				}
			} 
			
			
		}	return estudiante;
	}
	
	
		
	
	

	
	public boolean estaDisponible(Libros libroAVerificar) {
		boolean disponible = false;
		for (Libros libro : this.prestados) {

			if (libro.getCodigo() != libroAVerificar.getCodigo()) {
				disponible = Boolean.TRUE;

			} else
				disponible = Boolean.FALSE;
		}
		return disponible;
	}

	
	
	
	
	public Object registroDePrestamos() {
		return prestados.size();
	}
	
	
	
	public void devolverUnLibro(Libros libroADevolver) {
		prestados.remove(libroADevolver);
		
	}
	
	
	
	
	

	
public List<Libros> getPrestados() {
	return prestados;
}

public void setPrestados(List<Libros> prestados) {
	this.prestados = prestados;
}







public Integer getContador() {
	return contador;
}







public void setContador(Integer contador) {
	this.contador = contador;
}

	
	
	
	
	
	
	
	

	

}
