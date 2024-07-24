package coding_javatest;

public class Largestof3Num {
	
	public static void main(String args[])
	{
		int x = 450;
		int y = 100;
		int z = 126;
		
		if (x>y && x>z) {
			System.out.println("x is greatest num" +x);
		}
		else if (x==y && y>z) {
			System.out.println("x & y are greatest num" +x +","+y);
		}  
		else if (x==z && z>y) {
			System.out.println("x & z are greatest num" +x +","+z);
		}
		else if (y>z) {
			System.out.println("y is greatest num" +y);
		}
		else if (y==z)
		{
			System.out.println("z & y are greatest nums:" +z +"," +y);
		}
		else
		{
			System.out.println("z is greatest num" +z);
		}
			
	}

}
