package ejercicios;

public class Punto2 {
	public static char[] DesplazarString(String palabra,int desplazamiento,boolean delante) {
		char[]palabraDes=palabra.toCharArray();
		for(int i=0;i<palabraDes.length;i++) {
			int ASCII=(int)palabraDes[i];
			if(delante) {
				ASCII+=desplazamiento;				
			}else {
				ASCII-=desplazamiento;
			}
			palabraDes[i]=(char)ASCII;
		}
		return palabraDes;
	}
}
