package Productos;

public class ProductoFruta extends Producto {

	private String unidadDeVenta;

	public ProductoFruta() {

	}

	public ProductoFruta(String nombre, int precio, String unidadDeVenta) {
		super(nombre, precio);
		this.unidadDeVenta = unidadDeVenta;

	}

	public String getUnidadDeVenta() {
		return unidadDeVenta;
	}

	public void setUnidadDeVenta(String unidadDeVenta) {
		this.unidadDeVenta = unidadDeVenta;
	}
	
	@Override
	public String toString() {
		
		return super.toString() + " /// " + " Precio: $" + precio + " /// " + " Unidad de venta: "
				+ unidadDeVenta;
	}
}
