package pruebas;

public class Generico {
	public static void main(String[] args) {
		short n = 'b'; // ok
		//short n2 = 65535; // demasiado grande

		char c = (short)83; // ok
		//char c2 = (short) -1; // negativo
		
		System.out.println(c);
	}
}
