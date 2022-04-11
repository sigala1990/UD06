package act11;

import java.util.Scanner;

public class Act11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce tamaño de la array");
		int scValue = sc.nextInt();
		sc.close();
		int[]array1 = new int[scValue];
		int[]array2 = new int[scValue];
		
		pintarArray(array1); //array1 lleno de numeros aleatorios
		array2 = array1; //apunta al array1
		pintarArray(array2); //array2 reasignado a numeros aaleatorios
		int[]array3 = crearArray3(array1, array2); //crea array3 a partir de la multiplicion 
		showArray(array1, array2, array3); //muestra todo
	}
	
	public static int numRandom() { // metodo devuelve num random
		return (int) (Math.random() * (100 - 1) + 1);
	}
	
	public static void pintarArray(int[] array1) { // rellena la array
		for (int i = 0; i < array1.length; i++) {			
			array1[i] = numRandom();
		}
	}
	
	public static int[] crearArray3(int[] aray1,int[] aray2) { // crea un nuevo array a partir de los 2 anteriores que contiene su producto
		int[] array3 = new int[aray1.length];
		for (int i = 0; i < aray1.length; i++) {
			array3[i] = aray1[i] * aray2[i];
		}
		return array3;
	}
	
	public static void showArray(int[] aray1,int[] aray2, int[] array3) { // muestra todo
		System.out.println("Array1\t\tArray2\t\tArray3");
		for (int i = 0; i < array3.length; i++) {
			System.out.println(aray1[i]+"\t\t"+aray2[i]+"\t\t"+array3[i]);
		}
	}
	
	
}
