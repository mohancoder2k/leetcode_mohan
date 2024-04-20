package Array;

public class ProductExceptSelf {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int n = nums.length;
        int[] result = new int[n];
        int pre = 1;
        int post = 1;
        
      
        for(int i = 0; i < n; i++) {
            result[i] = pre;
            pre *= nums[i];
        }
        
        
        for(int i = n - 1; i >= 0; i--) {
            result[i] *= post;
            post *= nums[i];
        }
        
    
        for(int i = 0; i < n; i++) {
            System.out.println(result[i]);
        }
    }
}
