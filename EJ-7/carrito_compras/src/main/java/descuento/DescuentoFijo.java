package descuento;

public class DescuentoFijo extends Descuento {

	public DescuentoFijo(float descuento){
		valor=descuento;
	}
	public DescuentoFijo() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public float valorFinal(float valorIncial) {		// TODO Auto-generated method stub
		return valorIncial-getValor();
	}
}
