package act10;

import java.util.Scanner;

public class Act10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Tamaño de array: ");
		int sizeArray = sc.nextInt();
		sc.close();
		int[] array = new int[sizeArray];
		pintarArray(array);
		showMax(array);
	}

	public static int numRandom() { // metodo devuelve num random
		return (int) (Math.random() * (100 - 1) + 1);
	}

	public static int devolverPrimo() { //devuelve un numero primo
		int control = 0, num = 0;
		while(control != 1) {
			num = numRandom();
			control = 0;
			for (int i = 2; i <num -1 ;i++) {
				if(num % i == 0) {
					control++;
				}
			}control++;	
		}
		return num;		
	}

	public static void pintarArray(int[] array) { // muestra la array
		for (int i = 0; i < array.length; i++) {			
			array[i] = devolverPrimo();
			System.out.println(array[i]);
		}
	}	
	
	public static void showMax(int[] array) {//muestra el mas grande
		int max = 0;
		for (int i = 0; i < array.length; i++) {
			if(array[i] > max) {
				max = array[i];
			}
		}System.out.println("El num max es "+ max);
	}
	

}
