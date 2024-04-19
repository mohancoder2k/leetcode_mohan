package Array;

public class MaximumProductinSubArray {
	 public static void main(String[] args) {
		 int[] nums = {2,3,-2,4};
		 int maxProduct = 0;
		 for(int i=0;i<nums.length-2;i=i+2) {
			 for(int j=i+1;j<nums.length;j=j+2) {
				 int product = nums[i] * nums[j];
				 if(product>maxProduct)
					 	maxProduct=product;
			 }
		 }
		 System.out.println(maxProduct);
	 }
}
