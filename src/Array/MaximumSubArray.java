package Array;

public class MaximumSubArray {
	 public static void main(String[] args) {
		 int[] nums= {5,4,-1,7,8};
			int curSum=0;
			int maxSum = Integer.MIN_VALUE;
			for(int i=0;i<nums.length;i++) {
				int temp = curSum + nums[i];
				if(nums[i]>temp)
						curSum=nums[i];
				else
					curSum=temp;
			}
			if(curSum>maxSum)
				maxSum=curSum;
			
		System.out.println(maxSum);
	 }

}
