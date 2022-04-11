package act8;

import java.util.Scanner;

public class Act8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[10];
		array = setValue(array);
		showValues(array);
		
	}
	public static int[] setValue(int[] array) { //da valor en cada posicon
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < array.length; i++) {
			System.out.println("Pon valor a la posicion "+ i);
			array[i] =  sc.nextInt();
		}
		sc.close();
		return array;
	}
	public static void showValues(int[] array) { //muestra array
		for (int i = 0; i < array.length; i++) {
			System.out.println("La posicion "+ i +" contiene "+ array[i]);
		}
		
	}

}
