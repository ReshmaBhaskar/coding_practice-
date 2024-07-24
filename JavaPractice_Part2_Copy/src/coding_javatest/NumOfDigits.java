package coding_javatest;

public class NumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//if numbers is 1234, it should calculate num of digits in 1234 i.e 4 digits
		
		int num = 1234;
		int count = 0;
		
		
		
		
		while(num!=0) {
			num=num/10;
			++count;
			
		}

		System.out.println(count);
	}

}
