package core.procedural.permute;

import java.util.Arrays;

public class PermuteArr {
	public static void permute(int[] arr, int size) {
		if(size < 2) {
			System.out.println(Arrays.toString(arr));
			
		} else {
			for(int k = 0; k < size; k++) {
				swap(arr, k, size - 1);
				permute(arr, size - 1);
				swap(arr, k, size - 1);				
			}
			
		}
	}

	private static void swap(int[] arr, int k, int i) {
		int temp = arr[k];
		arr[k] = arr[i];
		arr[i] = temp;		
	}
}
