package core.procedural.recursia;

public class ArrayInverterRec {
	public static void invert(int[] arr, int k) {
		if(k < arr.length / 2) {
			int temp = arr[k];
			arr[k] = arr[arr.length - 1 - k];
			arr[arr.length - 1 - k] = temp;
			invert(arr, k + 1);
		}
	}
}
