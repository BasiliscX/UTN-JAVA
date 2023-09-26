package EJ1;

public class Punto1 {

	public static void main(String[] args) {
		
		//Utilizando la sentencia while, imprima todos los números entre 2 variables “a” y “b”.
		int a=2, b=20;
		if(a>b) {
			int aux=b;
			b=a;
			a=aux;
		}
		System.out.print("Numeros entre 2 y 20: { ");
		while(a<=b) {
			System.out.print(a+++" ");
		}
		System.out.print("}");
		
		// b. A lo anterior, solo muestre los números pares.
		a=2;
		System.out.print("\nNumeros pares: { ");
		while(a<=b) {
			if(a%2==0) {
				System.out.print(a+" ");
			}
			a++;
		}
		System.out.print("}");
		
		// c. A lo anterior, con una variable extra, elija si se deben mostrar los números pares o impares
		boolean esPar=false;
		a=2;
		if(esPar) {
			System.out.print("\nPares con boolean: { ");
		}else {
			System.out.print("\nImpares con boolean: { ");	
		}
		while(a<=b) {
			if(esPar) {
				if(a%2==0) {
					System.out.print(a+" ");
				}
			} else {
				if(a%2!=0) {
					System.out.print(a+" ");
				}
			}
			a++;
		}
		System.out.print("}");
		
		// d. Utilizando la sentencia for, hacer lo mismo que en (b) pero invirtiendo el orden
		System.out.print("\nPares con FOR: { ");
		for(a=2;a<=b;a++) {
			if(a%2==0) {
				System.out.print(a+" ");
			}			
		}
		System.out.print("}");
	}
}