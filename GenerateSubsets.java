package Programs;

import java.util.ArrayList;
import java.util.List;

public class GenerateSubsets {

	public static List<List<Integer>> subsets(int[] nums){
		List<List<Integer>> subsets = new ArrayList<>();
		generateSubset(0, nums, new ArrayList<Integer>() , subsets);
		return subsets;
	}
	
	public static void generateSubset(int index, int[] nums, List<Integer> current, List<List<Integer>> subset) {
		subset.add(new ArrayList<>(current));
		for(int i= index; i<nums.length; i++) {
			current.add(nums[i]);
			generateSubset(i+1, nums, current,subset);
			current.remove(current.size()-1);
			
		}
	}
	public static void main(String[] args) {
		int[] nums= {1,2};
		System.out.println(subsets(nums));
 	}
}
