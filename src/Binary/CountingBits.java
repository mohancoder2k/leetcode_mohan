package Binary;

import java.util.ArrayList;

public class CountingBits {
	public static void main(String[] args) {
		int n=5;
		
		// System.out.println(Binary);
		int[] array= ArrayResult(n); 
		
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
		
	}
	
	// My  to convert decimal into BINARY
	public static String decimal(int n) {
		if(n==0) {
			return "0";
		}
		StringBuilder binary = new StringBuilder();
		while(n>0) {
			int rem = n%2;
			binary.insert(0, rem);
			n/=2;
		}
		return binary.toString();
	}
	// Method to count the number of 1's digit in Number
	public static int Onecount(String Binary) {
		int flag=0;
		for(int i=0;i<Binary.length();i++) {
			if(Binary.charAt(i)=='1') {
				flag++;
			}
		}
		return flag;
	}
	// Method to return the required array
	public static int[] ArrayResult(int n) {
		ArrayList<Integer> keyList = new ArrayList();
		for(int i=0;i<=n;i++) {
			String Binary = decimal(i);
			int count = Onecount(Binary);
			keyList.add(count);
		}
		int[] key = new int[keyList.size()];
		for(int i=0;i<keyList.size();i++) {
			key[i]=keyList.get(i);
		}
		return key;
		
	}
	
}
