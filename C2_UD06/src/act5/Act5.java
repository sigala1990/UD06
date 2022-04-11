package act5;

public class Act5 {

	public static void main(String[] args) {
		int num = 50;
		
		System.out.println(ParseBinary(num));
	/*	StringBuilder strb = new StringBuilder(ParseBinary(num));
		System.out.println( "reverse "+strb.reverse()); */
	}
	
	public static String ParseBinary(int num) { // divide siempre que puede para buscar el resto
		String binaryCode = "";
		while(num > 0 ) {
			binaryCode =(num % 2) + binaryCode ;
			num = num /2;
		}
		return binaryCode;
	}
}
