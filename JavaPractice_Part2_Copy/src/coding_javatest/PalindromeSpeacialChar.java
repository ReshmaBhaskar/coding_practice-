package coding_javatest;

public class PalindromeSpeacialChar {

	//To remove all the special characters in the sentence, 
	//convert it to lower case & then check if its a palindrome or not
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "a man, a plan, a canal, panama";
		System.out.println("input string is - " +str);
		PalindromeSpeacialChar.palistr(str);
		
	}

	public static boolean palistr(String s)
	{
		String firststring = s.toLowerCase().replaceAll("[^a-z0-9]", "");
		System.out.println("initial string is - " +firststring);
		//using string builder for reverse
		StringBuilder s2 = new StringBuilder(firststring);
		String finalstr = s2.reverse().toString();
		System.out.println("output string is - " +finalstr);
		
		if(firststring.equalsIgnoreCase(finalstr) )
		{
			return true;
		}
		
		return false;
		
	}
	
}
