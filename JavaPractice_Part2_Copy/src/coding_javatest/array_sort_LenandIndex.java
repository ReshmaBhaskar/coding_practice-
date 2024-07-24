package coding_javatest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class array_sort_LenandIndex {

	public static void main(String[] args) {
		
		
		//array input  = {"Alice","bob","Dave","charlie"} -> Arrange it in ascending order by length & first array index
		
		
		//sort the array list of strings by length
		List<String> inpstr = new ArrayList<String>(Arrays.asList("Alice","bob","dave","charlie"));
		List<String> newstr = new ArrayList<String>();
		String temp,a, b;
		
		//sort the array list of strings by length - reverse
		inpstr.sort(Comparator.comparingInt(String::length).reversed());
		System.out.println(inpstr);
		
		//sort the array list of strings by length 
		Collections.sort(inpstr,Comparator.comparingInt(String::length));
		System.out.println(inpstr);
		
		//sort the array list of strings by length  - using collections for list - reversed
		Collections.sort(inpstr,Comparator.comparingInt(String::length).reversed());
		System.out.println(inpstr);
		
		
		
		//sort by first index - alphabetically
		Collections.sort(inpstr);
		System.out.println(inpstr);
				
	
		// Sort the list alphabetically in descending order
        Collections.sort(inpstr, Comparator.reverseOrder());
    	System.out.println(inpstr);
	
    
	
	}
	
	
	
}
		
	//---------Array sort--------

//Arrays.sort(str, Comparator.comparingInt(String::length));
//
//for(String s: str) {
//	System.out.println(s);
//}
//

