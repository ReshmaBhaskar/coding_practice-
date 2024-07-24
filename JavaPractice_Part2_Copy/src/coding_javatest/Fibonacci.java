package coding_javatest;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 0 1 1 2 3 5 8...
		//print  all fibonacci numbers until the specified num limit
		
		int num = 10;
		int num1 = 0;
		int num2 = 1;
		
		for(int i =1; i<=num;i++) {
			System.out.println(num1);
			int sum = num1+num2;
			num1 = num2;
			num2=sum;
		}
		
		
	}

}
