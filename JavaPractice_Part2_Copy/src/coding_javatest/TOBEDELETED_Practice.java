package coding_javatest;

import java.util.ArrayList;
import java.util.List;

public class TOBEDELETED_Practice {
	
//	static boolean p = printHello();
//	
//	public static boolean printHello() {
//		System.out.print("hello world");
//		return false;
//		}
		
	
	
	public static void main (String args[])
	{
	
		String str[] = {"Flea","Fle","Flu","Flourish"};
		
		
		String strPrefix = str[0];
		
		for(int i=1;i<str.length-1;i++)
		{
			while(!str[i].startsWith(strPrefix))
			{
				strPrefix = strPrefix.substring(0,strPrefix.length()-1);
				
				if(strPrefix.isEmpty())
				{
					System.out.println("No common Prefix");
				}
			}
		}
		
		System.out.println(strPrefix);
		
		
	}			
	
	
	

	
 }

//The array pair is - 2 4
//The array pair is - 3 3
//The array pair is - 3 3
//The array pair is - 3 3
//The array pair is - 3 3




		 
		/* 
		 
		 
		 String str[] = {"Flea","Flea","Flew","Flu","Flourish","Moti","roti"};
		 //o/p  -> fl
		int[] charcnt = new int[26];
		StringBuilder sb = new StringBuilder();
		 int maxcount = 0; 
		 
		 for(String word:str)
		 {
			 for(char c: word.toLowerCase().toCharArray()) {
				 charcnt[c]++;
				 if(charcnt[c]>maxcount) {
					 maxcount = charcnt[c];
				 }
			 }
		 }
		
		 
		for(int i=0;i<charcnt.length;i++) {
			if(charcnt[i]==maxcount) {
				sb.append((char) (i+'a'));
				System.out.println((char) (i+'a'));
			}
		}
		 
		 System.out.println(sb.toString());
		 
		 
		 
		 
	 }
}

	/*	 
		 
	  String[] inparr = {"ab", "b", "ab", "c", "1", "1ab", "2"};
      int[] charCount = new int[256]; // Assuming ASCII characters
      int maxCount = 0;
      int strCount = 0;
      String specificstr = "ab";

      for (String str : inparr) {
         /* str.valueOf(specificstr);
          str.indexOf(specificstr);
          System.out.println( str.valueOf(specificstr));
          System.out.println( );
         
        	  if (str.indexOf(specificstr)>=0)
              {
        		  strCount++;
             //  maxCount = Math.max(maxCount, charCount[c]);
               if(strCount>maxCount) 
               {
             	  maxCount=strCount;
               }
              }
      }
      
      System.out.println("Count of the maximum occurrence: " + maxCount+","+specificstr);
      

      */
      
      
      
      
      
      
     