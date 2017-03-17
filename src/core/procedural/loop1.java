package core.procedural;

public class loop1 {
	public static void main(String[] args) {
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.print((i + j < 4) ? "-" : "+");
			}
			System.out.println();
		}
		
		int[] arr = {0, 10, 20, 30, 40};
		for(int i = arr.length - 1; i >=0; i--) {
			for(int j = 0; j <= i; j++) {
				System.out.print(arr[j] + " ");
			}
			System.out.println();
		}
	}
}
