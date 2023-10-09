package carritoCompras;

public class Carrito {
	private int fecha;
	//private ItemCarrito items;
	private ItemCarrito item;
	private int total=0;

	public Carrito() {
		
	}
	public Carrito(ItemCarrito item) {
		this.item=item;
		total+=this.item.precio();
	}
	public int precio() {
		return total;
	}
	public int precio(Descuento desc) {
		return 0;
	}
	public int getFecha() {
		return fecha;
	}
	public void setFecha(int fecha) {
		this.fecha = fecha;
	}

	public ItemCarrito getItems() {
		return item;
	}

	public void setItems(ItemCarrito item) {
		this.item = item;
		total+=this.item.precio();
	}
}
