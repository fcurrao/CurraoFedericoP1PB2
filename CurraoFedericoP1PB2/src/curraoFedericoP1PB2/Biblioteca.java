package curraoFedericoP1PB2;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

	private List<Libros> prestados;

	public Biblioteca() {
		this.prestados = new ArrayList<>();

	}

	/*
	 * public boolean siEstaDisponible(Libros libroAVerificar) { boolean disponible=
	 * false; for (Libros libro: this.prestados) {
	 * if(libro.getCodigo().equals(libroAVerificar.getCodigo())) { disponible =
	 * Boolean.FALSE; } else disponible = Boolean.TRUE;
	 * 
	 * 
	 * } return disponible; }
	 */

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

	
	public Estudiantes prestarunlibroAalumno(Libros libroAprestar, Estudiantes estudiante) {
		for (Libros libro: this.prestados)	{
			if(libro.estaDisponible(libroAprestar) == true) {
				
				prestados.add(libroAprestar);
			
			} 
			
			
		}	return estudiante;
	}
	
	
	
		
	public void devolverUnLibro(Libros libroADevolver) {
		prestados.remove(libroADevolver);
		
	}
		
	public void registroDePrestamos() {
		prestados.size();
	}
	
		
		
	
	public List<Libros> getPrestados() {
		return prestados;
	}

	public void setPrestados(List<Libros> prestados) {
		this.prestados = prestados;
	}

}
