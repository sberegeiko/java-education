package core.procedural.recursia;

import java.util.Arrays;

public class ArrayInverterTest {

	public static void main(String[] args) {
		int[] arr = {9, 5, 4, 0, 7, 6, 2, 1, 3, 8};
		System.out.println(Arrays.toString(arr));
		
		ArrayInvert.invert(arr);
		System.out.println(Arrays.toString(arr));
		
		ArrayInverterRec.invert(arr, 0);
		System.out.println(Arrays.toString(arr));
	}

}
