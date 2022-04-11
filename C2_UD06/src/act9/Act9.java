package act9;

import java.util.Scanner;

public class Act9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce tamaño de la array");
		int sizeArray = sc.nextInt();
		int[] array = new int[sizeArray];
		sc.close();
		
		array = refill(array);
		showValue(array);
		
	}
	public static int setArrayRandom(int min, int max) { //metodo devuelve num random
		return (int)(Math.random()*(max-min)+min); 
	}
	
	public static int[] refill(int[] list) { //metodo que rellena la array con el metodo setArrayRandom
		for (int i = 0; i < list.length; i++) {
			list[i] = setArrayRandom(0,9);
		}
		return list;
	}
	
	public static void showValue(int[] list) { // metodo mostrar la array y su total
		int count = 0;
		for (int i = 0; i < list.length; i++) {
			count += list[i];
			System.out.println("Posicion "+ i+1 + " tiene el valor "+ list[i] );
		}
		System.out.println("El valor total de la array es "+ count);
 	}
	
	

	
	
	
	
	

}
