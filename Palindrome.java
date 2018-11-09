public class Palindrome{
	public static boolean palindrome(int num){
		int rev = 0;
		int temp = num;
		if(num < 0){
			return false;
		}else{
			while(num > 0){
				rev = (rev * 10) + (num % 10);
				num /= 10;
			}
			System.out.println(rev);
			System.out.println(num);
			System.out.println(temp);
			if(rev == temp){
				return true;
			}else{
				return false;
			}
		}
	}
	public static void main(String[] args){
		boolean result = palindrome(10);
		System.out.println(result);

	}
}