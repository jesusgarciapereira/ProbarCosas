package pruebas;

public class Bloque {

	public static void main(String[] args) {
//		var objetillo = new Bloque();
//
//		Bloque objeto1 = new Bloque();
//
//		{
//			System.out.println("Hola");
//		}
//		Bloque objeto2 = new Bloque();
//
//		int a = 11 % 3; // 2
//		int a2 = -11 % 3; // -2
//		int a3 = -11 % -3; // -2
//		int a4 = 11 % -3; // 2
//		float a5 = 11 % 3.5f; // 2.0
//		float a6 = 11 % 3f; // 2.0
//		// int a7 = 11f % 3f; // Error
//
//		System.out.println(a);
//		System.out.println(a2);
//		System.out.println(a5);
//
//		int rabbit = 6;
//		boolean bunny = (rabbit >= 6) || (++rabbit <= 7);
//		System.out.println(rabbit);

		int[][] myComplexArray = {{5,2,1,3},{3,9,8,9},{5,7,12,7}};

		// Muestra myComplexArray
		for (int f = 0; f < myComplexArray.length; f++) {
			for (int c = 0; c < myComplexArray[f].length; c++) {
				System.out.print(myComplexArray[f][c] + "\t");
			}
			System.out.println();
		}
		
		System.out.println();
		
		// Crea y asigna invertArray
		int[][] invertArray = new int[myComplexArray[0].length][myComplexArray.length];
		
		for (int f = 0; f < myComplexArray.length; f++) {
			for (int c = 0; c < myComplexArray[f].length; c++) {
				invertArray[c][f] = myComplexArray[f][c];
			}
		}

		// Muestra invertArray
		for (int f = 0; f < invertArray.length; f++) {
			for (int c = 0; c < invertArray[f].length; c++) {
				System.out.print(invertArray[f][c] + "\t");
			}
			System.out.println();
		}
		
		System.out.println();
		
		// Creo y muestro perfectArray
		int[][] perfectArray = {{1,2,3},{4,5,6},{7,8,9}};
		
		for (int f = 0; f < perfectArray.length; f++) {
			for (int c = 0; c < perfectArray[f].length; c++) {
				System.out.print(perfectArray[f][c] + "\t");
			}
			System.out.println();
		}
		
		System.out.println();
		
		// La invierto
		for (int f = 0; f < perfectArray.length; f++) {
			for (int c = f; c < perfectArray[f].length; c++) {
				
				int aux = perfectArray[f][c];
				perfectArray[f][c] = perfectArray[c][f];
				perfectArray[c][f] = aux;
			}
		}
		
		
		// La muestro de nuevo
		for (int[] fila : perfectArray) {
			for (int numero : fila) {
				System.out.print(numero + "\t");
			}
			System.out.println();
		}
		
		
		

		
//
//		for (int columna = 0; columna < myComplexArray[0].length; columna++) {
//			for (int fila = 0; fila < myComplexArray.length; fila++) {
//				System.out.print(myComplexArray[fila][columna] + "\t");
//			}
//			System.out.println();
//		}
		
	}

	{
		System.out.println("Adios");
	}

}
