package Productos;

import java.util.Comparator;

//public class Producto  implements Comparator<Producto>{
	
public class Producto  implements Comparable<Producto>{

	protected String nombre;
	protected Integer precio;

	public Producto() {

	}

	public Producto(String nombre, Integer precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getPrecio() {
		return precio;
	}

	public void setPrecio(Integer precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		
		return "Nombre: " + nombre;
	}

	@Override
	public int compareTo(Producto o) {
		
		return this.getPrecio().compareTo(o.getPrecio());
	}

	/*@Override
	public int compare(Producto o1, Producto o2) {
		
		return o1.getPrecio().compareTo(o2.getPrecio());
	}*/

}
