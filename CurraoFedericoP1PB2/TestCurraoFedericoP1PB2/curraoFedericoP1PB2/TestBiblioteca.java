package curraoFedericoP1PB2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestBiblioteca {

	@Test
	public void queSiLibroEstaPrestadoNoEsteDisponible() {
		Biblioteca unlam = new Biblioteca();
		Geografia patagonia = new Geografia (010, "Patagonia", "National geographic");
		Estudiantes federico = new Estudiantes("35.347.676", "Currao", "Federico");
		

		patagonia.prestarunlibroAalumno(federico);
		
		
		assertEquals(false, patagonia.estaDisponible(patagonia));
		
	}
	
	@Test
	public void queSeCreaUnLibro() {
		Biblioteca unlam = new Biblioteca();
		Geografia patagonia = new Geografia (010, "Patagonia", "National geographic");
		
		
		assertEquals((Integer)010, patagonia.getCodigo());
		
	}
	
	
	@Test
	public void cuandoDevuelvoLibroQueQuedeDisponible() {
		Biblioteca unlam = new Biblioteca();
		Geografia patagonia = new Geografia (010, "Patagonia", "National geographic");
		Estudiantes federico = new Estudiantes("35.347.676", "Currao", "Federico");
		
		patagonia.prestarunlibroAalumno(federico);
		patagonia.devolverUnLibro(patagonia);
		
		assertTrue(patagonia.estaDisponible(patagonia));
	
	}
	
	@Test
	public void queComoMaximoSePrestenDos() {
		Biblioteca unlam = new Biblioteca();
		Geografia patagonia = new Geografia (010, "Patagonia", "National geographic");
		Historia historiasargentinas = new Historia (010, "historiasargentinas", "pigna");
		Matematica dosmasdos = new Matematica (020, "dosmasdos", "einstein");
		Estudiantes federico = new Estudiantes("35.347.676", "Currao", "Federico");
		
		patagonia.prestarunlibroAalumno(federico);
		historiasargentinas.prestarunlibroAalumno(federico);
		dosmasdos.prestarunlibroAalumno(federico);
		
		assertEquals((Integer)2, federico.getCantidadPrestados());
		
		
	}
	
	@Test 
	public void librosQueseanFotocopiables() {
		Biblioteca unlam = new Biblioteca();
		Historia historiasargentinas = new Historia (010, "historiasargentinas", "pigna");
		Matematica dosmasdos = new Matematica (020, "dosmasdos", "einstein");
		Estudiantes federico = new Estudiantes("35.347.676", "Currao", "Federico");
		
		assertTrue(historiasargentinas.fotocopiables());
		
		
	}
	
	
	@Test 
	public void quesepuedaCrearUnEstudiante() {
		Estudiantes federico = new Estudiantes("35.347.676", "Currao", "Federico");
		
		assertEquals("35.347.676",federico.getDni());
		
	}
	
	
	@Test
	public void registroDeLosPrestamos() {
		Biblioteca unlam = new Biblioteca();
		Geografia patagonia = new Geografia (010, "Patagonia", "National geographic");
		Historia historiasargentinas = new Historia (020, "historiasargentinas", "pigna");
		Matematica dosmasdos = new Matematica (030, "dosmasdos", "einstein");
		Estudiantes federico = new Estudiantes("35.347.676", "Currao", "Federico");
		Estudiantes lucas = new Estudiantes("32.322.633", "Campos", "Lucas");
		
		dosmasdos.prestarunlibroAalumno(federico);
		patagonia.prestarunlibroAalumno(lucas);
		historiasargentinas.prestarunlibroAalumno(federico);
		
		assertEquals((Integer)3, unlam.registroDePrestamos());
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
