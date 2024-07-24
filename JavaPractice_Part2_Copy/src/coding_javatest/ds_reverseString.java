package coding_javatest;

import java.util.ArrayList;
import java.util.List;

public class ds_reverseString {
	//reverse a string using only any one of the data structures like - arraylist, hashmap, linkedlist etc
	
	public static void main(String[] args)
	{
		String str = "World";
		
			List<Character> charList = new ArrayList<>();
		 
	     for (char c : str.toCharArray()) {
	         charList.add(0, c); // Insert at the beginning
	     }

	     StringBuilder builder = new StringBuilder();
	     for (char c : charList) {
	         builder.append(c);
	     }

	     System.out.println( builder.toString());
	}
	

}
