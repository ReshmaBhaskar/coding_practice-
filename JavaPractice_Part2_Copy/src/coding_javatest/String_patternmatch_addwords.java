package coding_javatest;

public class String_patternmatch_addwords {

	public static void main(String[] args) {
		// add the word ' dog' after every 'lazy' word in the sentence   
		
		String sentence = " I love lazy. You laziest lazy bum. Lazy ever";
		
		//here (?i) matches for case insensitive "lazy" word be it Lazy,LAZy, LAZY etc..
		String updatesen = sentence.replaceAll("(?i)lazy", "lazy dog");
		String updatesen2 = sentence.replaceAll("lazy", "lazy dog");
		System.out.println(updatesen);
		System.out.println(updatesen2);

	}

}
