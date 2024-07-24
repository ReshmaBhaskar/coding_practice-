package coding_javatest;

public class Vowel_Constant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// vowel - a,e,i,o,u ; rest are consonant
		
		char ch = 'z';
		
		if (ch=='a'|| ch=='e' || ch=='i' || ch=='o'|| ch=='u')
		{
			System.out.println(ch+ " is vowel");
		}
		else
		{
			System.out.println(ch+ " is consonant");
		}
	
		
		//method 2 switch statement
		switch(ch) {
		
		case 'a':
		case 'e':
		case 'i':	
		case 'o':		
		case 'u':	
			System.out.println(ch+ "is vowel");
			break;
			
		default:
			System.out.println(ch+ "is consonant");
			break;
		}
	
	
	}
	

}
