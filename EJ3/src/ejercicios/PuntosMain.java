package ejercicios;

public class PuntosMain {
	public static void main(String[] args) {
		System.out.println("Punto 1.A");
		System.out.print("\tCantidad de apariciones de la letra 'r' en la palabra \"perro\": ");
		System.out.println(PuntoA.CantidadApariciones("perro",'r'));
		
		System.out.println("\nPunto 1.B");
		System.out.print("\tNúmeros 6,3,7 ordenados de forma descendente: ");
		int[]vector=PuntoB.OrdenarVector(6,3,7,'d');
		for(int n:vector) {
			System.out.print(n+" ");
		}
		System.out.print("\n\tNúmeros 6,3,7 ordenados de forma ascendente: ");
		int[]vector2=PuntoB.OrdenarVector(6,3,7,'a');
		for(int n:vector2) {
			System.out.print(n+" ");
		}
		System.out.println("\n\nPunto 1.C");
		System.out.print("\tSuma de todos los números mayores a 'X': ");
		System.out.println(PuntoC.SumaMayorX(vector, 2));
		System.out.println("Punto 2");
		System.out.print("\t\"abcd\" Con desplazamiento hacia adelante: ");		
		System.out.println(Punto2.DesplazarString("abcd", 1, true));
		System.out.print("\t\"abcd\" Con desplazamiento hacia atras: ");
		System.out.println(Punto2.DesplazarString("abcd", 1, false));
		System.out.print("\t\"abcd\" Con desplazamiento hacia adelante y atras: ");
		System.out.println(Punto2.DesplazarString(String.copyValueOf(Punto2.DesplazarString("abcd", 1, true)), 1, false));
	}
}
