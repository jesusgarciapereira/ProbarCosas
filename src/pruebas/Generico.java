package pruebas;

public class Generico {
	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder("pigeon dirty");
		builder.replace(3, 100, "");
		System.out.println(builder);  // pyg
		
		short n = 'b'; // ok
		//short n2 = 65535; // demasiado grande

		char c = (short)83; // ok
		//char c2 = (short) -1; // negativo
		
		System.out.println(c);
		
		
	}
}
