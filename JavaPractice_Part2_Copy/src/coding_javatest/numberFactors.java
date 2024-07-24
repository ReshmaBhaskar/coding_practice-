package coding_javatest;

public class numberFactors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			// all numbers which are divisible 
		//for 10 -> these are number factors 1,2, 5, 10
		
		int num = 10;
		
		for(int i=1; i<=num;i++)
		{
			if(num%i ==0)
			{
				System.out.println("Its number factor -"+ i);
			}
			
		}
		
		
	}

}
