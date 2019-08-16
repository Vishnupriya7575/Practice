package Programs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TwoSumHashMap {

	public static void main(String[] args) {

		int[] nums = { 2, 7, 11, 14, 8, 1 };
		int target = 9;
		findSum1(nums, target);

	}

	public static int[] findSum(int[] nums, int target) {
		int[] result = new int[2];
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length - 1; i++) {
			int difference = target - nums[i];
			if (map.containsKey(difference)) {
				result[0] = i;
				result[1] = map.get(difference);
				return result;
			}
			map.put(nums[i], i);
		}

		return result;
	}

	public static void findSum1(int[] nums, int target) {

		HashMap<Integer, Integer> sums = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					sums.put(nums[i], nums[j]);
				}
			}
		}

		Iterator itr = sums.entrySet().iterator();

		while (itr.hasNext()) {
			Map.Entry<Integer, Integer> entry = (Entry<Integer, Integer>) itr.next();
			System.out.println(" Key  " + entry.getKey());
			System.out.println(" Value " + entry.getValue());

		}

		Set<Integer> keys = sums.keySet();

		for (Integer key : keys) {
			System.out.println(key + " + " + sums.get(key) + " = " + target);
		}
	}
}