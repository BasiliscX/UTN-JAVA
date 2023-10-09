package ejercicios;
import java.util.Arrays;

public class Punto1A {
	public static int[]OrdenarVector(int a,int b,int c, char orden){
		int vector[]= {a,b,c};
		switch(orden) {
		case 'a': Arrays.sort(vector); break;
		case 'd':
			int aux;
			for(int i=0;i<3;i++) {
				for(int j=0;j<3;j++) {
					if(vector[i]>vector[j]) {
						aux=vector[i];
						vector[i]=vector[j];
						vector[j]=aux;
					}
				}
			}
			break;
		default: vector[0]=0; vector[1]=0; vector[2]=0; break;
		}
		return vector;
	}
}
