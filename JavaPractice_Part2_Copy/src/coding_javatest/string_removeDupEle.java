package coding_javatest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class string_removeDupEle {

	public static void main(String[] args) {
		
		// remove dup elements in array and append 0 there

		String[] str1 = {"we","we","were","where","we"};
		
		List<String> resultlist = new ArrayList<>();
		
		for(String s: str1)
		{	
			if(resultlist.contains(s))
			{
				resultlist.add("0");								
			}
			else
			{
				resultlist.add(s);	
			}			
		}
		
		for(String s: resultlist) {
			System.out.print(s + " ");
		}
		
		/*
		 * String[] modifiedarray = resultlist.toArray(new String[0]);
		 * 
		 * for (String s : modifiedarray) { System.out.print(s + " "); }
		 */
		
		
		
//---------//Other Method - using for loop//---------------------------------------------
		 String[] input = {"we", "we", "were", "where","were", "we","we"};
	     String[] output = new String[input.length];

	        for (int i = 0; i < input.length; i++) {
	            boolean isDuplicate = false;

	            for (int j = i + 1; j < input.length; j++)  {
	            	 
	                if (input[i].equals(input[j])) {
	                    isDuplicate = true;
	                    break;
	                }
	              
	            }

	            if (isDuplicate) {
	                output[i] = "0";
	            } else {
	                output[i] = input[i];
	            }
	        }

	        // Print the output array
	        for (String s : output) {
	            System.out.print(s + " ");
	        }
			
	
		
			
		
		
	}

}
