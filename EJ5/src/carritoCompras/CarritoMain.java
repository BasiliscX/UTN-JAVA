package carritoCompras;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/*
 En un programa main, lea de un archivo, por ejemplo separado por Tabs o comas, una
lista de items, arme los objetos correspondientes y con el método de carrito “precio”,
retorne el resultado. Por ejemplo: 
 */
public class CarritoMain {

	public static void main(String[] args) {
		String rutaRegistro="recursos/registros.txt";
		Path archivo=Paths.get(rutaRegistro);
		
		
		/*
		// escribir en el archivo:
		try {
			Files.writeString(archivo,"1,40,jabón en polvo\n",StandardOpenOption.APPEND);
			Files.writeString(archivo,"3,10,esponjas\n",StandardOpenOption.APPEND);
			Files.writeString(archivo,"2,100,chocolates\n",StandardOpenOption.APPEND);
		} catch (IOException e) {
			e.printStackTrace();
		}
		 */
		// Leer del archivo:

		Carrito carrito=new Carrito();
		String[]columna=new String[3];
		try {
			for(String linea:Files.readAllLines(archivo)) {
				columna=linea.split(",");
				int cantidad=Integer.parseInt(columna[0]);
				int precio=Integer.parseInt(columna[1]);
				String nombre=columna[2];
				
				Producto producto=new Producto(nombre,precio);
				ItemCarrito item=new ItemCarrito(producto,cantidad);
				carrito.setItems(item);
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println(carrito.precio());
	}

}
