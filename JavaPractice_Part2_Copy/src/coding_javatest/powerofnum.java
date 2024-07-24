package coding_javatest;

public class powerofnum {

	public static void main(String[] args) {
		
	
	int base = 2;
	int expo = 3;
	int res = 1; 
	
	while(expo!=0)
	{
		res=res*base;
		--expo;
	}
	System.out.println("exponent is - " +res);
}
}