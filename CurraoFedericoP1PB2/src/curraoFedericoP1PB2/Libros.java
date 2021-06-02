package curraoFedericoP1PB2;

import java.util.ArrayList;
import java.util.List;

public class Libros extends Biblioteca{

	private Integer codigo;
	private String nombre;
	private String autor;
	private TipoDeLibro TipoDeLibro;
	
	

	public Libros (Integer codigo, String nombre, String autor, TipoDeLibro TipoDeLibro) {
		this.codigo=codigo;
		this.nombre=nombre;
		this.autor=autor;
		this.TipoDeLibro=TipoDeLibro;
		
		
		
	}

	
	
	
	
	
	
	
	
	
		
	
		

	
	
	
	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public TipoDeLibro getTipoDeLibro() {
		return TipoDeLibro;
	}

	public void setTipoDeLibro(TipoDeLibro tipoDeLibro) {
		TipoDeLibro = tipoDeLibro;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
