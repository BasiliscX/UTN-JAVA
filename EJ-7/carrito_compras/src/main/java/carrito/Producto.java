package carrito;

public class Producto {
	private float precio;
	private String nombre;
	
	public float getPrecio() {
		return precio;
	}
	public Producto(String string){
		nombre=string;
	}
	public Producto(String nombre, int precio){
		setNombre(nombre);
		setPrecio(precio);
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setPrecio(float precio) {
		if(precio>0) {
			this.precio = precio;			
		}
		else {
			this.precio = 1;
		}
	}
}
