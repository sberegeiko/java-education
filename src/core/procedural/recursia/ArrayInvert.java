package core.procedural.recursia;

public class ArrayInvert {

	public static void invert(int[] arr) {
		for(int k = 0; k < arr.length / 2; k++) {
			int temp = arr[k];
			arr[k] = arr[arr.length - 1 - k];
			arr[arr.length - 1 - k] = temp;
		}
	}
}
