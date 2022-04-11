package act4;

import java.util.Scanner;

public class Act4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Indica un num: ");
		int numero = sc.nextInt();
		sc.close();
		factorial(numero);
		
	}
	public static void factorial(int num) {//for al reves per multiplicarse
		int total = num;
		for (int i = num-1; i > 1; i--) {
			total = total * i;
		}
		System.out.println("El factorial de "+ num +" es "+ total);
	}
	
}
