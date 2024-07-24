package coding_javatest;

public class primenuminterval {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//to find prime numbers between an interval of number
		
		int low = 20;
		int high = 50;
		
		
		while(low<=high)
			
		{
			boolean flag = false;
			for (int i = 2; i<=low/2; i++)
			{
				//condition for non-prime number
				if (low%i==0)
				{
					flag=true;
					break;
				}
			}
			
			
			//condition for prime num
			 if (!flag && low != 0 && low != 1)
	         System.out.println(low + " ");

			 low++;
		}

		
		
	}

}
