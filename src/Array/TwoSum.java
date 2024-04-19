package Array;

import java.util.HashMap;

public class TwoSum {
	public static void main(String[] args) {
		int[] nums = {2,9,10,12,15};
		int target = 9;
		
		TwoSum twoSumInstance = new TwoSum();
		int[] result = twoSumInstance.twoSum(nums, target);
		if(result!=null)
			 System.out.println("Indices: " + result[0] + ", " + result[1]);
		else
			System.out.println("Not found");
		
	}
	public int[] twoSum(int[] nums, int target) {
		
		HashMap<Integer, Integer> map = new HashMap();
		
		for(int i=0;i<nums.length;i++)
		{
			int compliment = target + nums[i];
			
			if(map.containsKey(compliment)) {
				return new int[]{i,map.get(compliment)};
			}
			map.put(i, nums[i]);
		}
		return null;
	
	}
	
}
