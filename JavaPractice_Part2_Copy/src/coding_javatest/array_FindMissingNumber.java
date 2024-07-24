package coding_javatest;

public class array_FindMissingNumber {

	public static void main(String[] args) {
		
		// this is to find only one missing number in between the array
		int[] nums = {1,2,3,5};
		int n=nums.length;
		
		 int sum = ((n + 1) * (n + 2)) / 2;
	        for (int i = 0; i < n; i++)
	            sum -= nums[i];
	        
	     System.out.println("missing number is:" + sum);
	     
	     
	     
	     
	     //find set of all missing numbers in the array
	     int[] arr = {12, 13, 17, 18, 20, 21, 24, 25, 26};

	     System.out.println("Missing numbers:");
	     for (int i = 1; i < arr.length; i++) {
	         for (int j = arr[i - 1] + 1; j < arr[i]; j++) {
	             System.out.println(j);
	         }
	     }
	     
	     
	     
	}

}
