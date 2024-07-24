package coding_javatest;

public class GenerateMultipliTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//2*1 = 2
		//2*2 = 4
		//this kind of table should be printed until the number limit is reached
		
		int num = 2;
		int lim = 10;
		
		for(int i=1; i<=lim;i++) {
			System.out.println(num*i );
		}
		
	}

}
