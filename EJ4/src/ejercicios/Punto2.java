package ejercicios;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class Punto2 {
	public static int Calculadora(String ruta,char operacion) {
		int resultado = 0;
		Path archivo=Paths.get(ruta);
		try {
			Files.writeString(archivo, "3,12,7");
			String numeros=Files.readString(archivo);
			String[]columna=numeros.split(",");
			int cont=0;
			int tam=columna.length;
			int[]vector=new int[tam];
			for(String numero:columna) {
				vector[cont++]=Integer.parseInt(numero);
			}
			switch(operacion) {
			case '+' :
				for(int n:vector) {
					resultado+=n;
				}
				return resultado;
			case '-' :
				//vector=Punto1A.OrdenarVector(vector[0], vector[1], vector[2], 'd');
				for(int i=1;i<tam;i++) {
					resultado=vector[i]-vector[i-1];
				}
				return resultado;
			case '*' :
				for(int i=1;i<tam;i++) {
					resultado=vector[i]*vector[i-1];
				}
				return resultado;
				default: break;
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		return resultado;
	}
}
