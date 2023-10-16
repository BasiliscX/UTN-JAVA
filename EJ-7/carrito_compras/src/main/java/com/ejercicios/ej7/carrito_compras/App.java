package com.ejercicios.ej7.carrito_compras;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

import carrito.*;
import descuento.*;

public class App 
{
    public static void main( String[] args )
    {
		String rutaRegistro="resources/registros.txt";
		Path archivo=Paths.get(rutaRegistro);
		boolean escribir=false;
		// escribir en el archivo:
		if(escribir) {
			try {
				Files.writeString(archivo,"1,40,jabón en polvo\n",StandardOpenOption.APPEND);
				Files.writeString(archivo,"3,10,esponjas\n",StandardOpenOption.APPEND);
				Files.writeString(archivo,"2,100,chocolates\n",StandardOpenOption.APPEND);
			} catch (IOException e) {
				e.printStackTrace();
			}			
		}

		// Leer del archivo:

		Carrito carrito=new Carrito();
		String[]columna=new String[3];
		try {
			for(String linea:Files.readAllLines(archivo)) {
				columna=linea.split(",");
				int cantidad=Integer.parseInt(columna[0]);
				int precio=Integer.parseInt(columna[1]);
				String nombre=columna[2];
				
				Producto producto=new Producto(nombre,precio);
				ItemCarrito item=new ItemCarrito(producto,cantidad);
				carrito.setItems(item);
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		Descuento descuento=new DescuentoFijo(70);
		Descuento descuentoP=new DescuentoPorcentaje(0.2f);
		Descuento descuentoT=new DescuentoPorcentajeConTope(1f);
		System.out.println("Precio sin descuento: "+carrito.precio());
		System.out.println("Precio con descuento fijo (70): "+carrito.precio(descuento));
		System.out.println("Precio con descuento %20: "+carrito.precio(descuentoP));
		System.out.println("Precio con descuento % con tope maximo del %40: "+carrito.precio(descuentoT));
	}
}
