package Programs;

public class findPeakElement {
	public static int findPkEle(int[] nums)
	{
		int left = 0;
		int right = nums.length-1;
		while(left<right)
		{
			int mid = left + (right-left)/2;
			if(nums[mid]<nums[mid+1])
			{
				left = mid+1;
			} else
			{
				right = mid;
			}
		}
		return left;
	}
	
	public static void main(String[] args) {
		int nums[] = {1,3,5,6,2};
		System.out.println(findPkEle(nums));
	}

}
