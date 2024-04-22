package Binary;

	public class NumberOfOneBits {
		public static void main(String[] args) {
			int n=5;
			String Binary = decimal(n);
			int count = Onecount(Binary);
			System.out.println(Binary);
			System.out.println(count);
		}
		public static String decimal(int n) {
	
			StringBuilder binary = new StringBuilder();
			while(n>0) {
				int rem = n%2;
				binary.insert(0,rem);
				n/=2;
			}
			
			return binary.toString() ;
		}
	public static int Onecount(String Binary) {
		int count = 0;
		for(int i=0;i<Binary.length();i++) {
			if(Binary.charAt(i)=='1') {
				count++;
			}
		}
		return count;
	}

}
