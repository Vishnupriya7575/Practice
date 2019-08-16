package Programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationOfTwoSum {
public static List<List<Integer>> combinationOfTwoSum(int[] candidates, int target){
	List<List<Integer>> result = new ArrayList<>();
	Arrays.sort(candidates);
	findCombinations(candidates, 0, target, new ArrayList<Integer>(), result);
	return result;
}
	public static void findCombinations(int[] candidates, int index, int target, List<Integer> current, List<List<Integer>> result) {
		if(target == 0) {
			result.add(new ArrayList<>());
			return;
		}
		if(target < 0) {
			return;
		}
		for(int i = index ; i < candidates.length ; i++) {
			if(i == index || candidates[i] != candidates[i-1]) {
				current.add(candidates[i]);
				findCombinations(candidates, i+1, target-candidates[i], current, result);
				current.remove(current.size()-1);
			}
		}
	}
public static void main(String[] args) {
	int[] candidates = {1,2,4};
	int target = 3;
	System.out.println(combinationOfTwoSum(candidates, target));
}
}
