package coding_javatest;

public class FactorialNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//factorial of 5 is !5 = 5*4*3*2*1
		//factorial of !0 is ALWAYS 1!
		
		int num = 4;
		int fact = 1;
		
		for(int i=1; i<=num; i++)
		{
			fact = fact*i; 
		}
		System.out.println(fact +" is factioral");
	}

}
