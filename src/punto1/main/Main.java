package punto1.main;

import java.util.ArrayList;
import java.util.Iterator;

import punto1.model.Producto;
import punto1.util.categoria;
import punto1.util.origenFabricacion;

public class Main {

	public static void main(String[] args) {
		//aqui digitamos los metodos  de arrayz
		ArrayList<Producto>productos=new ArrayList<>();//dentro del Array agregamos el class producto
		// ahora generamos los 5 objetos del arrays
		productos.add(new Producto(1010,"Notebook",560000,origenFabricacion.ARGENTINA,categoria.INFORMATICA));
		productos.add(new Producto(2734,"taladro",120000,origenFabricacion.CHINA,categoria.HERRAMIENTAS));
		productos.add(new Producto(3333,"lavarropas",980000,origenFabricacion.BRASIL,categoria.ELECTROHOGAR));
		productos.add(new Producto(4535,"Poco Phone",450000,origenFabricacion.URUGUAY,categoria.TELEFONIA));
		productos.add(new Producto(2732,"cable RJ45",5000,origenFabricacion.ARGENTINA,categoria.INFORMATICA));
		// ahora mostramos el contenido en la consola
		//   tipo     variable: ArrayList
		for (Producto producto: productos) {
			System.out.println(producto);
		}
		}
	}

