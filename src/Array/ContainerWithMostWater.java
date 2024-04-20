// Important Google Qn

package Array;

public class ContainerWithMostWater {
	public static void main(String[] args) {
		int[] height = {1,8,6,2,5,4,8,3,7};
		int max = -1;
		int left = 0;
		int right = height.length -1 ;
		while(left<right) {
			int w = right -left;
			int h = Math.min(height[left], height[right]);
			max = Math.max(max, w*h);
			if(height[left]<height[right])
					left++;
			else
					right--;
		}
		System.out.println(max);
	}
}
