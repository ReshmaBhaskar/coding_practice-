package coding_javatest;

public class AddNaturalNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 100;
		int sum = 0;
		int sum1 = 0;
		//Calculate sum of all natural numbers. If 'num' variable value is '100', then calculate sum = '1+2+3+$..+100'
		
		for (int i=1; i<=num; i++)
		{
			sum=sum+i;
		}
		System.out.println(sum + "is the sum of natural num");
	
		int k=1;
		while(k<=num) {
			sum1 = sum1+k;
			k++ ;
			
		}
		System.out.println(sum1 + "is the sum of natural num");
	}

}
