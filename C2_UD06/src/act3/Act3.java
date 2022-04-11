package act3;

import java.util.Scanner;

public class Act3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Indica un num: ");
		int num = sc.nextInt();
		sc.close();
		if(esPrimo(num)) {
			System.out.println("Si que es primo el "+num );
		}else {
			System.out.println("No es primo el " + num );	
		}
	}

	public static boolean esPrimo(int num) { //mira si es primo o no
		if(num == 1) {//verifica que el num no sea un 1
			return false;
		}
		for (int i = 2; i < num+1; i++) { // mira desde el 2 hasta el num si el resto es 0 para saber si es primo o no
			if(num % i == 0 && i != num && i !=1) {
				return false;
			}
		}return true;
	}
}
