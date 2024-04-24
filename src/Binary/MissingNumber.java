package Binary;

public class MissingNumber {
	public static void main(String[] args) {
		int[] array = {9,6,4,2,3,5,7,0,1};
		System.out.println(missing(array));
	}
	public static int missing(int[] nums) {
		int xor = 0;
		for(int i=0;i<=nums.length;i++) {
			xor = xor^i;
		}
		for(int i : nums) {
			xor=xor^i;
		}
		return xor;
	}
}
