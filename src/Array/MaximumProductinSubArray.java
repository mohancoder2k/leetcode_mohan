package Array;

public class MaximumProductinSubArray {
    public static void main(String[] args) {
        int[] nums = {2, 3, -2, 4};
        int maxProduct = nums[0]; 

        for (int i = 0; i < nums.length; i++) {
            int product = nums[i];
            maxProduct = Math.max(maxProduct, product); 

            for (int j = i + 1; j < nums.length; j++) {
                product *= nums[j];
                maxProduct = Math.max(maxProduct, product); 
            }
        }
        System.out.println(maxProduct);
    }
}
