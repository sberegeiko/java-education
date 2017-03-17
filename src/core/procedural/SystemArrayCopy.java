package core.procedural;

import java.util.Arrays;

public class SystemArrayCopy {

	public static void main(String[] args) {
		int[] arr = {9, 5, 4, 0, 7, 6, 2, 1, 3, 8};
		int[] arr1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		System.out.println("arr:  " + Arrays.toString(arr));
		System.out.println("arr1: " + Arrays.toString(arr1));
		System.arraycopy(arr, 6, arr1, 4, 4);
		System.out.println("arr1: " + Arrays.toString(arr1));
		
		System.arraycopy(arr, 1, arr, 3, 4);
		System.out.println("arr:  " + Arrays.toString(arr));

	}

}
