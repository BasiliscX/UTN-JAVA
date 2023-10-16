package descuento;

public class DescuentoPorcentajeConTope extends Descuento {
	private static final float TOPE= 0.4f;
	public DescuentoPorcentajeConTope(float d){
		if(d<TOPE) {
			valor=d;			
		}
		else {
			valor=TOPE;
		}
	}
	public DescuentoPorcentajeConTope() {
		valor=TOPE;
	}
	@Override
	public float valorFinal(float valorIncial) {
		return valorIncial-(valorIncial*getValor());
	}
	@Override
	public void setValor(float valor) {
		if(valor<TOPE) {
			this.valor=valor;			
		}
		else {
			this.valor=TOPE;
		}
	}
}
