package curraoFedericoP1PB2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestBiblioteca {

	@Test
	public void queSiLibroEstaPrestadoNoEsteDisponible() {
		Libros patagonia = new Libros (010, "Patagonia", "National geographic", TipoDeLibro.GEOGRAFIA);
		Estudiantes federico = new Estudiantes();
		
		
		assertEquals(1,1);
		
	}
}
