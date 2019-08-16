package Programs;

public class Twosum {

	public static int[] twosum(int[] nums, int target) {
		int complement;
		for (int x = 0; x < nums.length; x++) {
			complement = target - nums[x];
			for (int y = 0; y < nums.length; y++) {
				if (x == y) {
					continue;
				}
				if (nums[y] == complement) {
					return new int[] { x, y };
				}
			}
		}
		return new int[] { 0, 0 };
	}

	public static void main(String[] args) {
		int a[] = { 2, 4, 5, 3, 6 };
		int sum = 6;
		int arr[] = twosum(a, sum);
		for (int i : arr) {
			System.out.println(a[i]);
		}
	}
}