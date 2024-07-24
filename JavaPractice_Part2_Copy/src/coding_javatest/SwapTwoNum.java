package coding_javatest;

public class SwapTwoNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//with temp variable
		int a = 9;
		int b = 12;
		int x;
		
		System.out.println("Value of 'a' before swapping:" +a);
		System.out.println("Value of 'b' before swapping:" +b);
		
		x = b;
		b = a;
		a = x;
		
		System.out.println("Value of 'a' after swapping:" +a);
		System.out.println("Value of 'b' after swapping:" +b);
		
		
		//without temp variable
		a=a-b;
		b=a+b;
		a=b-a;
		
		System.out.println("Value of 'a' after swapping:" +a);
		System.out.println("Value of 'b' after swapping:" +b);
		
	
		
	}

}
