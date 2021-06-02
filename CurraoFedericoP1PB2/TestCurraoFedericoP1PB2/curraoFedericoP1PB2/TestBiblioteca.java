package curraoFedericoP1PB2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


import org.junit.Test;

public class TestBiblioteca {

	@Test
	public void queSiLibroEstaPrestadoNoEsteDisponible() {
		Biblioteca unlam = new Biblioteca();
		Libros patagonia = new Libros (010, "Patagonia", "National geographic", TipoDeLibro.GEOGRAFIA);
		Estudiantes federico = new Estudiantes("35.347.676", "Currao", "Federico");
		

		patagonia.prestarunlibroAalumno(federico);
		
		
		assertEquals(false, patagonia.estaDisponible(patagonia));
		
	}
	
	
	@Test
	public void cuandoDevuelvoLibroQueQuedeDisponible() {
		Biblioteca unlam = new Biblioteca();
		Libros patagonia = new Libros (010, "Patagonia", "National geographic", TipoDeLibro.GEOGRAFIA);
		Estudiantes federico = new Estudiantes("35.347.676", "Currao", "Federico");
		
		patagonia.prestarunlibroAalumno(federico);
		patagonia.devolverUnLibro(patagonia);
		
		assertTrue(patagonia.estaDisponible(patagonia));
	
	}
	
	@Test
	public void queComoMaximoSePrestenDos() {
		Biblioteca unlam = new Biblioteca();
		Libros patagonia = new Libros (010, "Patagonia", "National geographic", TipoDeLibro.GEOGRAFIA);
		Libros historiasargentinas = new Libros (010, "historiasargentinas", "pigna", TipoDeLibro.HISTORIA);
		Libros dosmasdos = new Libros (010, "dosmasdos", "einstein", TipoDeLibro.MATEMATICA);
		Estudiantes federico = new Estudiantes("35.347.676", "Currao", "Federico");
		
		patagonia.prestarunlibroAalumno(federico);
		historiasargentinas.prestarunlibroAalumno(federico);
		dosmasdos.prestarunlibroAalumno(federico);
		
		assertEquals((Integer)2, federico.getCantidadPrestados());
		
		
	}
	
	@Test
	public void registroDeLosPrestamos() {
		Biblioteca unlam = new Biblioteca();
		Libros patagonia = new Libros (010, "Patagonia", "National geographic", TipoDeLibro.GEOGRAFIA);
		Libros historiasargentinas = new Libros (010, "historiasargentinas", "pigna", TipoDeLibro.HISTORIA);
		Libros dosmasdos = new Libros (010, "dosmasdos", "einstein", TipoDeLibro.MATEMATICA);
		Estudiantes federico = new Estudiantes("35.347.676", "Currao", "Federico");
		Estudiantes lucas = new Estudiantes("32.322.633", "Campos", "Lucas");
		
		dosmasdos.prestarunlibroAalumno(federico);
		patagonia.prestarunlibroAalumno(lucas);
		historiasargentinas.prestarunlibroAalumno(federico);
		
		assertEquals(3, unlam.registroDePrestamos());
		
	}
	
	
	
	@Test 
	public void quesepuedaCrearUnEstudiante() {
		Estudiantes federico = new Estudiantes("35.347.676", "Currao", "Federico");
		
		assertEquals("35.347.676",federico.getDni());
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
