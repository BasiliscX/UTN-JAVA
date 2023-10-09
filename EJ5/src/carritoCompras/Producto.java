package carritoCompras;

public class Producto {
	private int precio;
	private String nombre;
	
	public int getPrecio() {
		return precio;
	}
	Producto(){
	}
	Producto(String nombre, int precio){
		setNombre(nombre);
		setPrecio(precio);
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setPrecio(int precio) {
		if(precio>0) {
			this.precio = precio;			
		}
		else {
			this.precio = 1;
		}
	}
}
