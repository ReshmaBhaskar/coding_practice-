package coding_javatest;

import java.util.Scanner;

public class String_Longestword {

		  
	  public static String LongestWord(String sen) { 
	    
		  //Find the longest word in the sentence
	    int maxlen = 0;
		 String longestword = "";		 
		 String str = "my name is reshma";
		 //o/p - reshma
		 
		 String[] words = sen.replaceAll("[^A-Za-z0-9\s]", " ").trim().split("\\s+");
		 
		 for(String word:words) {
			 int len = word.length();
			 if(len>maxlen) {
				 maxlen = len;
				 longestword = word;
			 }
		 }
		 
		 System.out.println(longestword+" : "+maxlen);
	    return longestword;
	  } 
	  
	  
	  
	  public static void main (String[] args) {  
	    // keep this function call here     
	    Scanner s = new Scanner(System.in);
	    System.out.print(LongestWord(s.nextLine())); 
	  }   
	  
}
