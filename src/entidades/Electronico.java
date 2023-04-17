package entidades;

public abstract class Electronico extends Producto implements IElectronico {
	
	private String fabricante;

	public String getFabricante() {
		return fabricante;
	}

	public Electronico(int precio, String fabricante) {
		super(precio);
		this.fabricante = fabricante;
	}
}