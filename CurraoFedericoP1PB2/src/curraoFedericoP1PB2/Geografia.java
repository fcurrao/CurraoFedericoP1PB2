package curraoFedericoP1PB2;

public class Geografia extends Libros   implements Fotocopiables {

	public Geografia(Integer codigo, String nombre, String autor) {
		super(codigo, nombre, autor);
		// TODO Auto-generated constructor stub
	}
	@Override
	public boolean fotocopiables() {
		return true;
				
	}

}
