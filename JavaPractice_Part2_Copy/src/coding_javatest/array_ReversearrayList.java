package coding_javatest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class array_ReversearrayList {

	public static void main(String[] args) {
		//reverse an integer array list

		
		//Collections.reverse(aList)
		Integer[] intarr = {1,2,3,4,5,6,7};
		
		List<Integer> EXPECTED = new ArrayList<>(Arrays.asList(7, 6, 5, 4, 3, 2, 1));

	
	        List<Integer> aList = new ArrayList<>(Arrays.asList(intarr));
	        Collections.reverse(aList);
	        System.out.println(aList);
	     
	        if(  aList.equals(EXPECTED))
	    {
	    	System.out.println("true");
	    }
	        
	        
	        
	        //other option to find reverse order of either integer or string array
	        Collections.sort(aList, Comparator.reverseOrder());
	        System.out.println(aList);
	    
	        
	        
		
	}

}
