package com.calculadora;

import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.ejercicios.calculadora.models.Calculadora;

public class CalculadoraTest {
	//atributos
	double resultadoEsperado;
	//constructor @before (no necesita tener el nombre de la clase).
	@Before
	public void inicializar() {
		resultadoEsperado=0;
	}
	//@after para final de cada prueba
	@After
	public void finalizar() {
		resultadoEsperado=0;
	}
	// pruebas
	//1. El resultado de multiplicar 80 por 3 da 240
	@Test
	public void dadosDosNumeros_probarMultiplicacion() {
		resultadoEsperado=Calculadora.multiplicar(80,3);
		assertEquals(240,resultadoEsperado);
	}
	//2. El resultado de sumar 150 y 180, dividido por 3, da 110
	@Test
	public void dadosDosNumeros_verificarLaSumaConDivision() {
		resultadoEsperado=Calculadora.dividir(Calculadora.sumar(150,180),3);
		assertEquals(resultadoEsperado,110);
	}
	
	//3. El resultado de restar 90 y 50, multiplicado por 15, no da 605.
	@Test
	public void dadosDosNumeros_verificarRestaConDivision() {
		resultadoEsperado=Calculadora.multiplicar(Calculadora.restar(90,50),15);
		assertNotEquals(605,resultadoEsperado);
	}
	//4. El resultado de sumar 70 y 40, multiplicado por 25, no da 2700
	@Test
public void dadosDosNumeros_verificarSumaconMultiplicacion() {
	resultadoEsperado=Calculadora.multiplicar(Calculadora.sumar(70,40),25);
	assertNotEquals(resultadoEsperado,2700);
	}
}
