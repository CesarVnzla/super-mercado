package Productos;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
/**
 * 
 * @author CesarVnzla
 *
 */

public class MainProductos {

	public static void main(String[] args) {
		
		List<Producto> listarProductos = new ArrayList<>();
		
		llenarListaDeProductos(listarProductos);
	
		List<Producto> listaMenorMayor = listarProductos.stream()
				.sorted(Comparator.comparing(Producto::getPrecio))
				.map(p -> {
				Producto producto = new Producto();
				producto.setNombre(p.getNombre());
				return producto;
				})
				.collect(Collectors.toList());

		listarProductos.stream()
			      .map(Producto::toString)
			      .forEach(System.out::println);
		
		System.out.println("=============================");
		
	    System.out.println("Producto mas caro: " + listaMenorMayor.get(listaMenorMayor.size()-1));
	    System.out.println("Producto mas barato: " + listaMenorMayor.get(0));
	}

	private static void llenarListaDeProductos(List<Producto> productos) {
		
		Producto coca1 = new ProductoBebida("Coca-Cola Zero", 20, 1.5);
		Producto coca2 = new ProductoBebida("Coca-Cola", 18, 1.5);
		Producto Sedal = new ProductoShampoo("Shampoo Sedal", 19, 500);
		Producto frutilla= new ProductoFruta("Frutillas", 64, "kilo");
		
		productos.add(coca1);
		productos.add(coca2);
		productos.add(Sedal);
		productos.add(frutilla);
		
	}
}
