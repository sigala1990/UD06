package act7;

import java.util.Scanner;

public class Act7 {

	final static double libra= 0.86;
	final static double dolar = 1.28611;
	final static double yenes = 129.852; 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String quantity;
		String type;
		int typeInt = 0;
		int quantityInt = 0;
		
		do {
			System.out.println("Introduce una cantidad: ");
			quantity = sc.nextLine();	
			
			System.out.println("Ahora introduce el tipo de moneda\nL para libras \nD para dolares\nY para Yenes");
			type = sc.nextLine();
			sc.close();
			
			if(controlInteger(quantity)) {quantityInt = Integer.valueOf(quantity);}
			if(controlString(type)) {typeInt = asignFormat(type);}
			if(!controlInteger(quantity) && !controlString(type)) { System.out.println("¡Has introducido mal el valor, vuelve a intenarlo!");}
			
		} while (!controlInteger(quantity) && !controlString(type));
		
		cambioMoneda(quantityInt,typeInt);
	}

	public static boolean controlInteger(String num) { // verifica que el contenido es un numero
		String control = String.valueOf(num);
		for (int i = 0; i < control.length(); i++) {
			char letter = control.charAt(i);
			if (!Character.isDigit(letter)) {
				return false;
			}
		}
		return true;
	}

	public static boolean controlString(String text) { //verifica que el contenido es una de los tipo de moneda
		switch (text.toUpperCase()) {
			case "L":
			case "D":
			case "Y":
				return true;
			default:
				return false;
		}
	}
	
	public static int asignFormat(String text) { // nos indifca que letra a escogido
		switch (text.toUpperCase()) {
		case "L":
			return 1;
		case "D":
			return 2;
		case "Y":
			return 3;
		default:
			return 0;
		}
	}
	public static void cambioMoneda(int quantity, int format) {//imprime en los casos
		
		switch (format) {
		case 1://L
			System.out.println(quantity+"€"+" son "+ quantity*libra+"Libras");
			break;
		case 2://D
			System.out.println(quantity+"€"+" son "+ quantity*dolar+"Dolares");
			break;
		case 3://Y
			System.out.println(quantity+"€"+" son "+ quantity*yenes+"Yenes");
			break;
		}		
	}
	
}
