package act1;

import java.util.Scanner;

public class Act1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int control = 0;
		do { // pide que se introduzca una figura

			System.out.println("Que quieres calcular, circulo, triangulo o cuadrado?");
			String figura = sc.nextLine();
			sc.close();
			switch (figura.toUpperCase()) {
				case "CIRCULO":
					control = 1;
					break;
				case "TRIANGULO":
					control = 2;
					break;
				case "CUADRADO":
					control = 3;
					break;
			}			
		} while (control == 0);
		System.out.println("La area es: "+(String.format("%.2f", calcularArea(control))));
		
	}
	
	public static double calcularArea(int format){ // entra el tipo con el que queremos trabajar
		Scanner sc = new Scanner(System.in);
		double value1 = 0, value2 = 0,finalValue = 0;
		
		switch(format) {
			case 1:
				System.out.println("Introduce el valor del radio");
				value1 = sc.nextDouble();
				value2 = Math.PI;
				finalValue = Math.pow(value1, value2);
				break;
			case 2:
				System.out.println("Introduce el valor de la base: ");
				value1 = sc.nextDouble();
				System.out.println("Introduce el valor de la altura: ");
				value2 = sc.nextDouble();
				finalValue = ((value1 * value2) / 2);
				break;
			case 3: 
				System.out.println("Introduce el valor del lado: ");
				value1 = sc.nextDouble();
				System.out.println("Introduce el valor del lado: ");
				value2 = sc.nextDouble();
				finalValue = (value1 * value2);
				break;
		}
		sc.close();
		return finalValue;
			
	}
}
