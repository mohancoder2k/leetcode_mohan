package Binary;

public class SumOfTwoIntegers {
	public static void main(String[] args) {
		int a=5;
		int b=7;
		while(b!=0) {
			final int carry = a&b;
			a=a^b;
			b=carry << 1;
		}
		System.out.println(a);
	}
}
