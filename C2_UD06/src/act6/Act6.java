package act6;

import java.util.Scanner;

public class Act6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero");
		int num = sc.nextInt();
		sc.close();
		System.out.println(num+" tiene un total de "+ countTotalNumbers(num) +" digitos");
	}
	public static int countTotalNumbers(int numToCount) {//divide un int entr 10 para ir quitando decenas a decenas ej: 800 --> 80  --> 8
		int countTotalNumbers = 0;
		while(numToCount > 0) {
			numToCount= numToCount / 10;
			countTotalNumbers++;
		}
		return countTotalNumbers;
	}
	
}
