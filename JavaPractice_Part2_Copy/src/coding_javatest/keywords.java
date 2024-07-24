package coding_javatest;



	
	class Data {
		////declaring constant   -  usage of static & final makes the variable constant;
		//if the constant is decalred as public, the value can be changed. otherwise not possible
		public static final int integerConstant = 20;
		private static final int integerConstant2 = 40; 
	}
	
		public class keywords extends Data {
	
			public static final int integerConstant = 21;
			private static final int integerConstant2 = 22;
			
			
		   public static void main(String args[]) {
		      Data obj1 = new Data();
		      System.out.println("value of integerConstant: "+obj1.integerConstant);
		      Data obj2 = new Data();
		      System.out.println("value of integerConstant: "+obj2.integerConstant);
		      
		      System.out.println("public altered value of constant :"+ integerConstant ); 
		      System.out.println("public altered value of constant :"+ integerConstant2 ); 
		     
		      
		      //below is the right way of displaying static variable is to call by class.variable & not object.variable 
		      int num = (int) Data.integerConstant+(int)1;
		      int num2 = (int) integerConstant2+(int)1;
		      System.out.println("value of altered public constant :"+ num);
		      System.out.println("value of altered private constant :"+ num2);
		      
		   }
		}

