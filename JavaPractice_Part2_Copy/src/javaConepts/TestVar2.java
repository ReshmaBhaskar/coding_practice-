package javaConepts;

public class TestVar2 {

	int instanceVar = 10;
	

	
	static void staticMethod() {
		// Create an instance of the class inside static method in order to access the 
		//instance variables/ methods inside the static method
		TestVar obj = new TestVar(); 
	    System.out.println("Accessing instance variable from static method: " + obj.instanceVar); //this instance variable value is from the TestVar class and not current class
	    obj.anotherNonStaticMethod(); // Call instance method in static method using the object
	    
	    obj.staticMethod(); //calling static method
	    obj.nonStaticMethod(); //calling another non-static method
	}
	
	public static void main(String[] args) {
		
		staticMethod();
		
		// Create an instance of the class in static method in order to access the 
		//instance variables/ methods inside the static method
		//TestVar testvar = new TestVar();
//		testvar.staticMethod();
//		testvar.nonStaticMethod();
	
		
	}

}







