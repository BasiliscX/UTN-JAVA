package ejercicios;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class EjerciciosMain {
	public static void main(String[] args) {
		System.out.println("Punto 1.A");
		System.out.print("\tNúmeros 6,3,7 ordenados de forma descendente: ");
		int[]vector=Punto1A.OrdenarVector(6,3,7,'d');
		for(int n:vector) {
			System.out.print(n+" ");
		}
		System.out.print("\n\tNúmeros 6,3,7 ordenados de forma ascendente: ");
		int[]vector2=Punto1A.OrdenarVector(6,3,7,'a');
		for(int n:vector2) {
			System.out.print(n+" ");
		}
		/*
		Scanner scanner=new Scanner(System.in);
		System.out.println("\n\nPunto 1.B");
		System.out.println("\tIngrese los valores para cargar el vector[3]");
		for(int i=0;i<3;i++) {
			System.out.print("\t\tNúmero "+(i+1)+": ");
			vector[i]=scanner.nextInt();
		}
		System.out.println("\tIngrese 'a' para el orden ascendente o 'd' para el orden descendente");
		System.out.print("\t\ttipo de orden: ");
		char orden=scanner.next().charAt(0);
		vector2=Punto1A.OrdenarVector(vector[0], vector[1], vector[2], orden);
		for(int n:vector2) {
			System.out.print(n+" ");
		}
		scanner.close();
		 * */
		System.out.println("\n\nPunto 2");
		System.out.print("\t(Lectura desde archivo) Suma de 3,12,7: ");
		System.out.println(Punto2.Calculadora("recursos/numeros.txt", '+'));
		System.out.print("\t(Lectura desde archivo) resta de 3,12,7: ");
		System.out.println(Punto2.Calculadora("recursos/numeros.txt", '-'));
		System.out.print("\t(Lectura desde archivo) multiplicación de 3,12,7: ");
		System.out.println(Punto2.Calculadora("recursos/numeros.txt", '*'));
		System.out.println("\nPunto 3");
		Path archivoEntrada=Paths.get("recursos/entrada.txt");
		Path archivoSalida=Paths.get("recursos/salida.txt");
		Punto3.CoDecod(archivoEntrada, archivoSalida, 1, true);
	}
}
