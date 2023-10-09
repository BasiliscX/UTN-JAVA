package ejercicios;
/*Dado un String y una letra, que cuente la cantidad de apariciones de la letra en
el String
*/
public class PuntoA {
	public static int CantidadApariciones(String palabra,char letra) {
		int cont=0;
		for(int i=0;i<palabra.length();i++) {
			if(palabra.charAt(i)==letra) {
				cont++;
			}
		}
		return cont;
	}
}
