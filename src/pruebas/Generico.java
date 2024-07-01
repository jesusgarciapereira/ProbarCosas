package pruebas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Generico {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("abcdef");
		sb.deleteCharAt(3);  // throws an exception
		System.out.println(sb);
		
		StringBuilder builder = new StringBuilder("pigeon dirty");
		builder.replace(3, 100, "");
		System.out.println(builder);  // pig
		
		short n = 'b'; // ok
		//short n2 = 65535; // demasiado grande

		char c = (short)83; // ok
		//char c2 = (short) -1; // negativo
		
		System.out.println(c);
		
		System.out.println(Arrays.compare(new String[] {"a"}, // 32
				new String[] {"A"}));
		System.out.println(Arrays.compare(new int[] {1, 2},  // 0
				new int[] {1, 9}));
		int[] numbers = {12,1,2,3,3,2,1};
        int[] numbers1 = {12,1};

        System.out.println(Arrays.compare(numbers,numbers1));
        
        System.out.println();
        
        List<String> birds = new ArrayList<>();
        birds.add("hawk"); // [hawk]
        birds.add("hawk"); // [hawk, hawk]
        System.out.println(birds.remove("cardinal"));  // false
        System.out.println(birds);   // []
        System.out.println(birds.remove("hawk"));  //true
        System.out.println(birds);   // []
        System.out.println(birds.remove(0));  //hawk
        System.out.println(birds);   // []

	}
}
