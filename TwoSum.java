public class TwoSum{
	public static void main(String[] args){
		int target = 9;
		int [] arr = {2,7,11,5};
		for(int i = 0; i < arr.length; ++i){
			int sum = arr[i] + arr[i + 1];
			System.out.println(sum);
		}

	}
}