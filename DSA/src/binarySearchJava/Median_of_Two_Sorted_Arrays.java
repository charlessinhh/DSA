package binarySearchJava;

public class Median_of_Two_Sorted_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = { 1, 3 };
		int[] nums2 = { 2, 4 };

		System.out.println(findMedianSortedArrays(nums1, nums2));

	}

	private static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		// TODO Auto-generated method stub
		int n = nums1.length;
		int m = nums2.length;
		if (n > m)
			return findMedianSortedArrays(nums2, nums1); // only on smaller size array

		// do ops on nums1
		int medianPos = (n + m + 1) / 2;
		int low = 0;
		int high = n;

		while (low <= high) {
			int cut1 = (low + high) / 2;
			int cut2 = medianPos - cut1;

			int l1 = (cut1 == 0) ? Integer.MIN_VALUE : nums1[cut1 - 1];
			int l2 = (cut2 == 0) ? Integer.MIN_VALUE : nums2[cut2 - 1];

			int r1 = (cut1 == n) ? Integer.MAX_VALUE : nums1[cut1];
			int r2 = (cut2 == m) ? Integer.MAX_VALUE : nums2[cut2];

			if (l1 <= r2 && l2 <= r1) {
				// odd length sum array
				if ((n + m) % 2 == 1) {
					return Math.max(l1, l2);
				} else {
					return ((Math.max(l1, l2) + Math.min(r1, r2)) / 2.0);
				}
			} else if (l1 > r2)
				high = cut1 - 1;
			else
				low = cut1 + 1;
		}

		return 0.0;
	}

}
