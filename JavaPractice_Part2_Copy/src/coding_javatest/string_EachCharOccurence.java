package coding_javatest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class string_EachCharOccurence {
	
	   public static void main(String[] args) {
		   
		   //count each character's/ digit occurrence
		   
		   String  inpstr = "  abcd ab121 1a23 5";
	        int count = 0;
	        int digcnt=0;	        
	        int[] occurrenceofalpha = new int[26];
	        int[] occurrenceofdig = new int[10];
	        
	        //loop to increment the count of digit or character in the entire string
	        for(int i=0;i<inpstr.length();i++)
	        {
	             char c = inpstr.charAt(i);
	             
	             if(!Character.isLetterOrDigit(c)){
	            	 //System.out.println(Character.isLetterOrDigit(c));
		                continue;
		            }
	             
	             if(Character.isDigit(c)){	 	          
	            	 int digit = Character.getNumericValue(c);
	 	            occurrenceofdig[digit]++;
	 	            }
	            
	             if(Character.isLetter(c)){
	             Character ch = Character.toLowerCase(c);
	             occurrenceofalpha[ch-'a']++;
	             }	           
	        }
	        
	        //print the letter count array
	        for(int j=0;j<occurrenceofalpha.length;j++)
	        {
	            char inpchar = (char) (j+'a');
	            count = occurrenceofalpha[j];
	            if(count>0){
	            System.out.println();
	              System.out.println(inpchar+":"+count);  
	            }
	            
	        }
	        	       
	        //print the digit count array
	        for(int k=0;k< occurrenceofdig.length;k++)
	        {
	            int inpdig= k;
	            digcnt = occurrenceofdig[k];
	            if(digcnt>0){
	            System.out.println();
	              System.out.println(inpdig+":"+digcnt);  
	            }
	        }
	        
	        
	   }
	}


