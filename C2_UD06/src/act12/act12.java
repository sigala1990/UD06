package act12;

import java.util.Scanner;

public class act12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		
		System.out.println("Introduce tamaño de la array");
		int scValue = sc.nextInt();
		System.out.println("Introduce el numero que quieres buscar: ");
		String valorBuscar = sc2.nextLine();
		
		sc2.close();
		sc.close();
		int[] array1 = new int[scValue];
		array1 = pintarArray(array1);
		int[] list =showNumberEndInput(array1, valorBuscar);
		showArray(list);
	}

	public static int numRandom(int min, int max) { // metodo devuelve num random
		return (int) (Math.random() * (max - min) + min);
	}

	public static int[] pintarArray(int[] array1) { // rellena la array
		for (int i = 0; i < array1.length; i++) {
			array1[i] = numRandom(1, 300);
		}
		return array1;
	}

	public static int[] showNumberEndInput(int[] array, String valorBuscar) {// busca unvalor que coincida en el final 
		String valueDigitOfArray = "";
		
		int count = 0;

		for (int i = 0; i < array.length; i++) {
			valueDigitOfArray = String.valueOf(array[i]);
			if (valueDigitOfArray.endsWith(valorBuscar)) {
				count++; 
			}
		}
		int[] list  = new int[count]; //recogemos el count anterior para establecer el tamaño de larray y aora introducirle los valores
		int contador= 0;
		for (int i = 0; i < array.length; i++) {
			valueDigitOfArray = String.valueOf(array[i]);
			if (valueDigitOfArray.endsWith(valorBuscar)) {
				//int algo =  Integer.parseInt(valorBuscar);
				list[contador] = array[i];
				contador ++;
			}
		}
		return list;
	}
		
		public static void showArray(int[] aray1) { //muestra la array
			System.out.println("El contenido de la nueva array:");
			for (int i = 0; i < aray1.length; i++) {
				System.out.println(aray1[i]);
			}
	}

}
