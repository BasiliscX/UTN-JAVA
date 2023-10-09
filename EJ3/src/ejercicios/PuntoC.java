package ejercicios;

public class PuntoC {
	public static int SumaMayorX(int[]vector,int x) {
		int r=0;
		for(int i=0;i<vector.length;i++) {
			if(vector[i]>x) {
				r+=vector[i];
			}
		}
		return r;
	}
}
