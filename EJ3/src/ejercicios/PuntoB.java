package ejercicios;
/* Dados 3 números y un orden (ascendente o decreciente) que ordene los
mismos y los retorne en un vector de 3
*/
public class PuntoB {
	public static int[]OrdenarVector(int a,int b,int c, char orden){
		int vector[]= {a,b,c};
		int aux;
		switch(orden) {
		case 'd':
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
			case 'a':
			for(int i=0;i<3;i++) {
				for(int j=0;j<3;j++) {
					if(vector[i]<vector[j]) {
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