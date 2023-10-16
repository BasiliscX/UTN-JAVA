package carrito;

import descuento.Descuento;

public class Carrito {
	private int fecha;
	//private ItemCarrito items;
	private ItemCarrito item;
	private float total=0;

	public Carrito() {
		
	}
	public Carrito(ItemCarrito item) {
		this.item=item;
		total+=this.item.precio();
	}
	public float precio() {
		return total;
	}
	public float precio(Descuento descuento) {

		return descuento.valorFinal(total);
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
