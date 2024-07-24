package coding_javatest;

public class AlphabetCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		char c ='1';
		
		if ((c>='a' && c<='z') || (c>='A' && c<='Z')){
			System.out.println(c+ " is a character");
			
		}
		else
		{
			System.out.println(c+ " is not a character");
		}
	}
	

}
