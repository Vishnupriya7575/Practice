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
