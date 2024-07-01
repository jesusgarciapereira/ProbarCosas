package pruebas;

public class CreaArray {

	public static void main(String[] args) {
		int[][] creado = { { 1, 4 }, { 3 }, { 9, 8, 7 } };

		int[][] creado1 = new int[3][];
		creado1[0] = new int[] { 1, 4 };
		creado1[1] = new int[] { 3 };
		creado1[2] = new int[] { 9, 8, 7 };
		
		for (int[] fila : creado1) {
			for (int numero : fila) {
				System.out.print(numero + " ");
			}
			System.out.println();
		}
	}

}
