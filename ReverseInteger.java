public class ReverseInteger{
	public static int Reverse(int x ){
		
		int reverse = 0;
		if(x < 0){
			x = Math.abs(x);
			while (x > 0){
			reverse = (reverse*10) + (x % 10);
			x /= 10;
			}
			return reverse;
			
		}else{		
			while (x > 0){
				reverse = (reverse*10) + (x % 10);
				x /= 10;
				
			}
			return reverse;
		}

	}
	public static void main(String[] args){
		int result1 = Reverse(-123);
		int result2 = Reverse(123);
		int result3 = Reverse(120);

		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);

	}

}