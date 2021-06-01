package curraoFedericoP1PB2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestBiblioteca {

	@Test
	public void queSiLibroEstaPrestadoNoEsteDisponible() {
		Biblioteca unlam = new Biblioteca();
		Libros patagonia = new Libros (010, "Patagonia", "National geographic", TipoDeLibro.GEOGRAFIA);
		Estudiantes federico = new Estudiantes("35.347.676", "Currao", "Federico");
		
		patagonia.estaDisponible(patagonia);
		unlam.prestarunlibro(patagonia,federico);
		
		
		
		assertEquals(1,1);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
