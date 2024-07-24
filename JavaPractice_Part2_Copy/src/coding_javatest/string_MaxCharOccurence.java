package coding_javatest;

public class string_MaxCharOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		//code to return maximum occurence character
	char[] charArray = {'a', 'b', '1', '1', '1', 'b', 'a'};
		
		
        char maxRepeatingChar = getMaxRepeatingChar(charArray);
        System.out.println("Max repeating character: " + maxRepeatingChar);
		
	}
		 public static char getMaxRepeatingChar(char[] charArray) {
		        int[] charCount = new int[256]; // Assuming ASCII characters

		        char maxChar = 0;
		        int maxCount = 0;

		        // Iterate through the charArray and update charCount and maxChar
		        for (char c : charArray) {
		            charCount[c]++;
		            if (charCount[c] > maxCount) {
		                maxChar = c;
		                maxCount = charCount[c];
		            }
		        }

		        return maxChar;
		    
		 }
	}
       
	





/*

//code to return all characters with maximum occurence
 *output - Characters with the maximum occurrence: 
 1
 a
 b
 Count of the maximum occurrence: 2

 * 		 
	  String[] inparr = {"ab", "b", "a", "c", "1", "1", "2"};
      int[] charCount = new int[256]; // Assuming ASCII characters
      int maxCount = 0;

      for (String str : inparr) {
          for (char c : str.toCharArray()) {
             // int index = (int) c;
              charCount[c]++;
            //  maxCount = Math.max(maxCount, charCount[c]);
              if(charCount[c]>maxCount) {
            	  maxCount=charCount[c];
              }
             
          }
      }

      System.out.println("Characters with the maximum occurrence: ");
      for (int i = 0; i < charCount.length; i++) {
          if (charCount[i] == maxCount) {
              char c = (char) i;
              System.out.println(c);
          }
      }
      System.out.println("Count of the maximum occurrence: " + maxCount);
  }
}       




//code to return multiple values from the method to main program -> using Object[] class as return type
 * 
 *  public static Object[] getMaxRepeatingChar(char[] charArray) {
        int[] charCount = new int[256]; // Assuming ASCII characters

        char maxChar = 0;
        int maxCount = 0;

        for (char c : charArray) {
            charCount[c]++;
            if (charCount[c] > maxCount) {
                maxChar = c;
                maxCount = charCount[c];
            }
        }

        Object[] result = new Object[]{maxChar, maxCount};
        return result;
    }

    public static void main(String[] args) {
        char[] charArray = {'a', 'b', 'a', 'c', 'c', 'b', 'a'};
        Object[] result = getMaxRepeatingChar(charArray);
        char maxRepeatingChar = (char) result[0];
        int maxCount = (int) result[1];
        System.out.println("Max repeating character: " + maxRepeatingChar);
        System.out.println("Max count: " + maxCount);
    }
 * 
 */



