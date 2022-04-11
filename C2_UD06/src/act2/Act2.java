package act2;

import java.util.Scanner;

public class Act2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] array;
		
		System.out.println("Cuantos num aleatorios quieres?");
		int valueSc = sc.nextInt();
		System.out.println("Indica el numero minimo ");
		int valueMinSc = sc.nextInt();
		System.out.println("Indica el numero maximo ");
		int valueMaxSc = sc.nextInt();
		sc.close();
		array = newArrayRandom(valueSc, valueMinSc, valueMaxSc);
		for (int i = 0; i < array.length; i++) {
			System.out.println("En la posicion "+(i+1)+ " esta "+array[i]);	
		}
		
	}
	public static int[]newArrayRandom(int totalRandom, int minim, int max){ // crea una aray con numeros aleatorios
		int[] list = new int[totalRandom];
		for (int i = 0; i < list.length; i++) {
			list[i] = (int) (Math.random()* (max-minim)+ minim);
		}
		return list;
	}

}
