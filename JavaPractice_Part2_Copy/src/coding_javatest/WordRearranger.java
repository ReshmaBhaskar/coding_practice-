package coding_javatest;

import java.util.Arrays;
import java.util.Comparator;

public class WordRearranger {
	
	//input - "My1 is3 name2 Reshma4"
	//expected output - "My name is reshma"

    public static void main(String[] args) {
    	
    	//method 1 - using LAMBDA expression along with the method within the arrays.sort expression
		
		   String inpstr = "my1 is3 name2 Reshma4";
	       //o/p = my name is reshma
		  // int digit = 0;
		   
		   //get the split of input as Array of type string
		   String[] words = inpstr.split("\\s+");
		   
		   //extract the digit from each string & pass it to array comparator along with sorting
		   Arrays.sort(words,Comparator.comparingInt(s -> {
				   for(char c: s.toCharArray()) 
				   {
					   if(Character.isDigit(c))
					   {
						   return Character.getNumericValue(c);
					   }
				   }
				   return 0;
		   }));
		   
		   //replace the digit of each word with empty string & append each word to a new string
		   StringBuilder sb = new StringBuilder();
		   for(String word: words) {
			   word = word.replaceAll("\\d+", "");
			   sb.append(word).append(" ");
		   }
		   
		   //display new string
		   System.out.println(sb.toString().trim());
    	
 	
    	

    }
}






//method 2 - using lambda expression and writing the method seperately in the class
/*

        String sentence = "My1 is3 name2 Reshma4";
        String rearrangedSentence = rearrangeWords(sentence);
        System.out.println(rearrangedSentence);
    }

    public static String rearrangeWords(String sentence) {
        // Split the sentence into words
        String[] words = sentence.split(" ");

        
        // Sort the words based on the digits present
        Arrays.sort(words, Comparator.comparingInt(WordRearranger::extractDigit));
        //output of arrays.sort with comparator above will be - ["My1", "name2", "is3", "Reshma4"]
        
        
        // Create the rearranged sentence
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            // Remove the digits from each word
            String cleanedWord = word.replaceAll("\\d", "");
            sb.append(cleanedWord).append(" ");
        }

        // Remove the extra space at the end and return the rearranged sentence
        return sb.toString().trim();
    }

    private static int extractDigit(String word) {
        // Find the first digit in the word and extract its value
        int digit = 0;
        for (char c : word.toCharArray()) {
        	 //System.out.println(c);
            if (Character.isDigit(c)) {
                digit = Character.getNumericValue(c);
                break;
            }
        }
        return digit;



*/