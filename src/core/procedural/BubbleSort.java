package core.procedural;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {9, 5, 4, 0, 7, 6, 2, 1, 3, 8};
        System.out.print(Arrays.toString(arr));
        System.out.println();
        System.out.print(Arrays.binarySearch(arr, 5));
		for(int barrier = 1; barrier < arr.length; barrier++) {
			int newElement = arr[barrier];
			int location = barrier - 1;
			while(location >= 0 && arr[location] > newElement) {
				arr[location + 1] = arr[location];
				location--;
				}
			arr[location + 1] = newElement;
		}

//        for (int barrier = 0; barrier < arr.length; barrier++) {
//            for (int index = arr.length - 1; index > barrier; index--) {
//                if (arr[index - 1] > arr[index]) {
//                    int temp = arr[index - 1];
//                    arr[index - 1] = arr[index];
//                    arr[index] = temp;
//                }
//            }
//        }


//        for (int barrier = arr.length - 1; barrier >= 0; barrier--) {
//            for (int index = 0; index < barrier; index++) {
//                if (arr[index] > arr[index + 1]) {
//                    int temp = arr[index];
//                    arr[index] = arr[index + 1];
//                    arr[index + 1] = temp;
//                }
//            }
//        }

//        for (int barrier = arr.length - 1; barrier >= 0; barrier--) {
//            for (int index = 0; index < barrier; index++) {
//                if (arr[barrier] < arr[index]) {
//                    int temp = arr[index];
//                    arr[index] = arr[barrier];
//                    arr[barrier] = temp;
//                }
//            }
//        }

        System.out.println();
        System.out.println(Arrays.toString(arr));


        System.out.print(Arrays.binarySearch(arr, 5));
    }

}
