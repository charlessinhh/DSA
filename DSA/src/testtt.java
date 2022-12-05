import java.util.Arrays;

public class testtt {

	public static void main(String[] args) {
		int[] arr1 = { 2, 3 };
		int[] arr2 = { 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int[] arr3 = { 1, 1, 1, 1, 1, 1, 1, 1, 1 };

		for (int i = 0; i < arr2.length; i++) {
			if (arr2[i] == arr1[0] || arr2[i] == arr1[1]) {
				continue;
			} else if (arr2[i] % arr1[0] == 0 || arr2[i] % arr1[1] == 0) {
				arr3[i] = 0;
			}
		}

		System.out.println(Arrays.toString(arr3));
		for (int k = 0; k < arr3.length; k++) {
			if (arr3[k] == 1) {
				System.out.println(arr2[k] + " ");
			}
		}

	}

}
