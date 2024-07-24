package coding_javatest;

import java.util.Arrays;
import java.util.List;

public class array_findArrPairswhoseSumisN {

	public static void main(String[] args) {
		// find array pairs whose sum is equal to digit 'n' 
		Integer[] arr = {2,5,3,3,4};
		int sum = 6;
		
		List numList = Arrays.asList(arr);
		
	//	List<Integer> numList = new ArrayList<Integer>(Arrays.asList(arr));
	    for (int i = 0; i < arr.length; i++) {
	        int num = sum - arr[i];
	       //System.out.println(num);
	        
	        if (numList.contains(num)) {
	            System.out.println("" + arr[i] + " " + num + " = "+sum);
	}

	    }
	}}
