package coding_javatest;

import java.util.Arrays;

public class RemoveDuplicatesinSortedArr {


	
	public static int removeDups(int[] nums) {
	 int insertIndex = 1;
     for(int i = 1; i < nums.length; i++)
     {
         // We skip to next index if we see a duplicate element
         if(nums[i - 1] != nums[i]) 
         {
             /* Storing the unique element at insertIndex index and incrementing
                the insertIndex by 1 */
             nums[insertIndex] = nums[i];     
             insertIndex++;
         }
     }
 	System.out.println("The return index is "+ insertIndex);
     return insertIndex;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] innums = {1,1,2,3,3,4,5};
		System.out.println("The input array is "+ Arrays.toString(innums) );
		RemoveDuplicatesinSortedArr.removeDups(innums);
		System.out.println("The output array is "+ Arrays.toString(innums) );
	}

	

}

