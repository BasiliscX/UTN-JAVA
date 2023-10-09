package ejercicios;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class Punto3 {
	public static void CoDecod(Path entrada,Path salida,int desplazamiento,boolean codificacion) {		
		try {
			Files.writeString(salida,"");					
			for(String linea:Files.readAllLines(entrada)) {
				char[]lineaChar=linea.toCharArray();
				for(int i=0;i<lineaChar.length;i++) {
					int ASCII=(int)lineaChar[i];
					if(codificacion) {
						ASCII+=desplazamiento;				
					}else {
						ASCII-=desplazamiento;
					}
					lineaChar[i]=(char)ASCII;
				}
				String lineaSalida=new String(lineaChar);
				lineaSalida+="\n";
				Files.writeString(salida,lineaSalida,StandardOpenOption.APPEND);
			}
			System.out.print("\t\tArchivo copiado.");
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		String palabra = "";
		char[]palabraDes=palabra.toCharArray();
		for(int i=0;i<palabraDes.length;i++) {
			int ASCII=(int)palabraDes[i];
			if(codificacion) {
				ASCII+=desplazamiento;				
			}else {
				ASCII-=desplazamiento;
			}
			palabraDes[i]=(char)ASCII;
		}
	}
}