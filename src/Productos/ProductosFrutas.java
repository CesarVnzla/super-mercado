package Productos;

public class ProductosFrutas extends Producto {

	private String unidadDeVenta;

	public ProductosFrutas() {

	}

	public ProductosFrutas(String nombre, int precio, String unidadDeVenta) {
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
