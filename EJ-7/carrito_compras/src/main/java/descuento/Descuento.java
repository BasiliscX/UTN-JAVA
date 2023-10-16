package descuento;

public abstract class Descuento {
	protected float valor;
	
	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public abstract float valorFinal(float valorIncial);
}
