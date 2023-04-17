package entidades;

public class TvLcd extends Electronico implements IElectronico {
	
	private int pulgadas;

	public int getPulgadas() {
		return pulgadas;
	}

	@Override
	public double getPrecioVenta() {
		// TODO Auto-generated method stub
		return 0;
	}

	public TvLcd(int precio, String fabricante, int pulgadas) {
		super(precio, fabricante);
		this.pulgadas = pulgadas;
	}
}