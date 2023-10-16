package descuento;

public class DescuentoPorcentaje extends Descuento {

	public DescuentoPorcentaje(float d){
		valor= d;
	}
	public DescuentoPorcentaje() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public float valorFinal(float valorIncial) {
		return valorIncial-(valorIncial*getValor());
	}
}
