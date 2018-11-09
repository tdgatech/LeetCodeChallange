public class ReverseTestKey{
		public static int reverse(int x) {   
		int result = 0;
		long check = 0;
		while(x % 10 !=0 || x/10 != 0) {
			result = result*10 + x%10;
			check = check*10 + x%10;
			x= x/10;
			if( check - result != 0) { 
				return 0;
			}
		}
		return result;
	}
}