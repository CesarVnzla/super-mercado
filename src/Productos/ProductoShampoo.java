package Productos;

public class ProductoShampoo extends Producto{
	
	private int unidadDeVenta;

	public ProductoShampoo() {
	
	}

	public ProductoShampoo(String nombre, int precio, int unidadDeVenta) {
		super(nombre, precio);
		this.unidadDeVenta = unidadDeVenta;
	}

	public int getUnidadDeVenta() {
		return unidadDeVenta;
	}

	public void setUnidadDeVenta(int unidadDeVenta) {
		this.unidadDeVenta = unidadDeVenta;
	}

	@Override
	public String toString() {
		
		return super.toString() +  " /// " + "Contenido: " + unidadDeVenta+"ml" + " /// " + " Precio: $" + precio;
	}
}
