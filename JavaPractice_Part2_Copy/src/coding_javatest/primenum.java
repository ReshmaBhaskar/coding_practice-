package coding_javatest;

public class primenum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 14;
		boolean flag = true;
		
		for (int i=2;i<=num/2;i++)
		{
			if (num%i!=0)
			{
				//condition for prime number
				flag = false;
				break;
			}
		}
	
	if(flag)
	{
		System.out.println("it's prime num -" +num);
	}
	else
	{
		System.out.println("it's not a prime num -" +num);
	}
	
	}
	

}
