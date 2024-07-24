package coding_javatest;

public class AsciiOfChar {

	//To find ASCII values of character
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ASCII of small 'a' is 97; ASCII of capital 'A' is 65
		// ASCII of  digit 0 is 48
		// ASCII of special character can be found
		//ASCII of multiple characters like 'aabsc' can't be found
		
		char ch = 'R';
		
		//method 1
		int asciinumber = ch;
		System.out.println(asciinumber);
		
		//method 2
		int asciinum = (int)ch;
		System.out.println(asciinum);
		
			
	}

}
