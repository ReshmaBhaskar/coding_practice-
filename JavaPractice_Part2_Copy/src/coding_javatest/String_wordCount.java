package coding_javatest;

public class String_wordCount {
	
	public static int countWordsUsingSplit(String input)
	{ 
		// count the number of words in a string
		int cnt =0;
		if (input == null || input.isEmpty()) 
		{ return 0; 
		} 
		String[] words = input.split("\\s"); 
		
		for (String s:words)
		{
			cnt++;
		}
		//words.length -> will aslo return word count
		System.out.println(cnt);
		return cnt; 
		
		}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		countWordsUsingSplit("Hello world miss");
		
	}

}
