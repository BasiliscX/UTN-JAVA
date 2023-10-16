package carritoTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import carrito.*;
import descuento.*;

public class carritoTest {
	float resultadoEsperado;
	Producto producto;
	ItemCarrito itemCarrito;
	Carrito carrito;
	DescuentoFijo descuentoF;
	DescuentoPorcentaje descuentoP;
	DescuentoPorcentajeConTope descuentoT;

	@Before
	public void inicializar() {
		resultadoEsperado=0;
		producto=new Producto("producto");
		itemCarrito=new ItemCarrito();
		carrito=new Carrito();
		descuentoF=new DescuentoFijo();
		descuentoP=new DescuentoPorcentaje();
		descuentoT=new DescuentoPorcentajeConTope();
		
	}
	@After
	public void finalizar() {
		resultadoEsperado=0;
	}
	@Test
	public void dadoUnPrecioDeProducto_VerificarLaSumaDeDosUnidades() {
		producto.setPrecio(200);
		itemCarrito.setProducto(producto);
		itemCarrito.setCantidad(2);
		carrito.setItems(itemCarrito);
		resultadoEsperado=400;
		assertEquals(resultadoEsperado,carrito.precio());
	}
	@Test
	public void dadoUnValorDescuentoFijo_verificarValorFinal() {
		producto.setPrecio(200);
		itemCarrito.setProducto(producto);
		itemCarrito.setCantidad(1);
		carrito.setItems(itemCarrito);
		descuentoF.setValor(100);
		resultadoEsperado=100;
		assertEquals(resultadoEsperado,carrito.precio(descuentoF));
	}
	@Test
	public void dadoUnValorDescuentoPorcentaje_verificarValorFinal() {
		producto.setPrecio(200);
		itemCarrito.setProducto(producto);
		itemCarrito.setCantidad(1);
		carrito.setItems(itemCarrito);
		descuentoP.setValor((float) 0.1);
		resultadoEsperado=180;
		assertEquals(resultadoEsperado,carrito.precio(descuentoP));
	}
	@Test
	public void dadoUnValorDescuentoPorcentajeTope_verificarValorFinal() {
		producto.setPrecio(100);
		itemCarrito.setProducto(producto);
		itemCarrito.setCantidad(1);
		carrito.setItems(itemCarrito);
		descuentoT.setValor(0.5f);
		resultadoEsperado=60;
		assertEquals(resultadoEsperado,carrito.precio(descuentoT));
	}
}
