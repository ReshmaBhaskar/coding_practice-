package coding_javatest;

public class ReverseNum {

	public static void main(String[] args) {
		//reverse a number

		int num = 12218;
		int rev = 0;
		int act_num =   num;
		
		while(num!=0) {
			int rem=num%10; //get remainder
			rev=rev*10+rem; //reverse num
			num=num/10; //get remaining quotient
		}
		System.out.println(rev);
		
		if (act_num == rev)
		{
			System.out.println("it is palindrome");
		}
			else
			{
				System.out.println("it is not palindrome");
			}
	
	}

}
