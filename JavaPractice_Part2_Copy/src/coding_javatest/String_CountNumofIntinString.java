package coding_javatest;

import java.util.ArrayList;
import java.util.List;

public class String_CountNumofIntinString {

	public static void main(String[] args) {
		//count numbers in the string
		
		 String str = "my12name3 is R4eshma";
		int sum = 0;
		 //int count = 0;
		 
	    String digits= str.replaceAll("\\D+", "");
	    System.out.println(digits);
	    
		//find sum of all digits
	  for(int i=0;i<digits.length();i++) {
		  
		  char c = digits.charAt(i);
		System.out.println(c);
		  sum+=(int)c-'0';
		 
		/*  if(Character.isAlphabetic(c))
		  {
			  count++;
		  }
		 */
		 
	  }
	  System.out.println(sum);
	    
	 
	  if(sum % 9 ==0) {
		  System.out.println(0);
	  }
	  else if(sum % 9 !=0) {
		  System.out.println(sum % 9);
	  }
        

       
	}
	
}
