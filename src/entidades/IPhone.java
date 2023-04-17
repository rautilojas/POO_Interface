package entidades;

public class IPhone extends Electronico{
	
	private String modelo;
	private String color;
	
	@Override
	public double getPrecioVenta() {
		// TODO Auto-generated method stub
		return 0;
	}

	public String getModelo() {
		return modelo;
	}

	public String getColor() {
		return color;
	}

	public IPhone(int precio, String fabricante, String modelo, String color) {
		super(precio, fabricante);
		this.modelo = modelo;
		this.color = color;
	}
}