package carritoCompras;

public class ItemCarrito {
	private int cantidad;
	private Producto producto;
	
	public int precio() {
		return producto.getPrecio()*getCantidad();
	}
	ItemCarrito(Producto producto, int cantidad){
		this.producto=producto;
		this.cantidad=cantidad;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		if(cantidad>0) {
			this.cantidad = cantidad;			
		}
		else {
			this.cantidad = 1;
		}
	}
	public Producto getProducto() {
		return producto;
	}
	public void setProducto(Producto producto) {
		this.producto = producto;
	}
}
