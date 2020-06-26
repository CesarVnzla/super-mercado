package Productos;

public class ProductoBebida extends Producto {

	private double unidadDeVenta;

	public ProductoBebida() {
	
	}

	public ProductoBebida(String nombre, int precio, double unidadDeVenta) {
		super(nombre, precio);
		this.unidadDeVenta = unidadDeVenta;
	}

	public double getUnidadDeVenta() {
		return unidadDeVenta;
	}

	public void setUnidadDeVenta(double unidadDeVenta) {
		this.unidadDeVenta = unidadDeVenta;
	}

	@Override
	public String toString() {
		
		return super.toString() +  " /// " + "Listros: " + unidadDeVenta + " /// " + " Precio: $" + precio;
	}
}
