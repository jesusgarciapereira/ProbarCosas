package pruebas;

public class TrabajoArray {

	public static void main(String[] args) {

		int[][] myComplexArray = { { 5, 2, 1, 3 }, { 3, 9, 8, 9 }, { 5, 7, 12, 7 } };

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
		int[][] perfectArray = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

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

	}

}
