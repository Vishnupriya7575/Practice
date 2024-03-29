/*Problem Description: Given a non-empty array of integers, every element appears twice except for one. Find that single one.

Note: Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

Example 1:
Input: [2,2,1]
Output: 1

Example 2:
Input: [4,1,2,1,2]
Output: 4*/

package Programs;
import java.util.HashSet;
import java.util.*;

public class SingleNumber {
	public static int singleNumber(int[] nums) {
		HashSet<Integer> set = new HashSet<Integer>();
		for (int n : nums) {
			if (set.contains(n)) {
				set.remove(n);
			} else {
				set.add(n);
			}
		}
		Iterator<Integer> it = set.iterator();
		return it.next();
	}

	public static void main(String[] args) {
		int nums[] = { 1, 2, 3, 3, 1 };
		System.out.println(singleNumber(nums));
	}
}
