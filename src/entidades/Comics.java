package entidades;

import java.util.Date;

public class Comics extends Libro implements ILibro {

	private String personaje;

	public String getPersonaje() {
		return personaje;
	}

	@Override
	public double getPrecioVenta() {
		// TODO Auto-generated method stub
		return super.getPrecioVenta();
	}

	public Comics(int precio, Date fechaPublicacion, String autor, String titulo, String editorial, String personaje) {
		super(precio, fechaPublicacion, autor, titulo, editorial);
		this.personaje = personaje;
	}
}