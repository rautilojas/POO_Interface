package entidades;

public abstract class Producto implements IProducto {
	
	private int precio;

	public int getPrecio() {
		return precio;
	}

	public Producto(int precio) {
		super();
		this.precio = precio;
	}
}