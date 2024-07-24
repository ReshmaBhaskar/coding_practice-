package coding_javatest;

public class string_freqofSubstring {

	public static void main(String[] args) {

		// to find the frequency of the substring is a string
		String str = "Iamthemissworld& missarea";
		
		//use regex pattern match of substring
		
		//String str = "helloslkhellodjladfjhello";
		String findStr = "miss";
		//System.out.println(str.split(findStr, -1));
		System.out.println(str.split(findStr, -1).length-1);
	

		String str1 = "helloslkhellodjladfj hello";
		String findStr1 = "hello";
		int lastIndex = 0;
		int count = 0;

		while(lastIndex != -1)
		{

		    lastIndex = str1.indexOf(findStr1,lastIndex); //find the last index in the input string

		    if(lastIndex != -1)
		    {
		        count ++;
		        lastIndex += findStr1.length();// update the last index 
		    }
		}
		
		System.out.println(count);
		
		
	}
	
	

}
