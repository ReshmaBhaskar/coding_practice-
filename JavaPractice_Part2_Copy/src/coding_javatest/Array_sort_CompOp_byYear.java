package coding_javatest;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Array_sort_CompOp_byYear {
	
	public static void main (String[] args) {
		 String[][] sentences = {
		            {"reshma was born in 1992"},
		            {"she got married in 2022"},
		            {"reshma went to school in 2002"},
		            {"She graduated in 2013"}
		        };

		 
		        Arrays.sort(sentences, Comparator.comparingInt(entry ->  
		        {		    
			        
		        	String[] words = entry[0].split("\\s+");
			        String lastWord = words[words.length - 1];
			        return Integer.parseInt(lastWord);
			        
		        }
		        ));
		        
		      
		       
		        
		        for (String[] sentence : sentences) {
		            System.out.println(sentence[0]);
		        }
	}
   



}


//for sorting in reversed order
//Object[] sentences = {
//        new String[] {"reshma was born in 1992"},
//        new String[] {"she got married in 2022"},
//        new String[] {"reshma went to school in 2002"},
//        new String[] {"She graduated in 2013"}
//    };
//
//    Arrays.sort(sentences, Comparator.comparingInt(o -> {
//        String[] words = ((String) ((Object[]) o)[0]).split("\\s+");
//        return Integer.parseInt(words[words.length - 1]);
//    }).reversed());
//
//    for (Object sentence : sentences) {
//        System.out.println(((String) ((Object[]) sentence)[0]));
//    }
