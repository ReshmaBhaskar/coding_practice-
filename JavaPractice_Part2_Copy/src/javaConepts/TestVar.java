package javaConepts;

public class TestVar {


	    static int staticVar = 10;
	    int instanceVar = 20;

	    static void staticMethod() {
	    	 System.out.println("---start of static method--");
	    	 
	        System.out.println("Static method accessing static variable: " + staticVar);
	        
	        // Static method cannot access instanceVar/instance method directly.
	        // System.out.println(instanceVar); // Error
	        //nonStaticMethod();//error
	        
	        // Static method can call another static method directly.
	        anotherStaticMethod();
	        	        
	        System.out.println("---end of static method--");
	    }

	    void nonStaticMethod() {
	    	 System.out.println("---start of Non-static method--");
	    	 
	        System.out.println("Non-static method accessing static variable: " + staticVar);
	        System.out.println("Non-static method accessing instance variable: " + instanceVar);

	        // Non-static method can call another non-static method directly.
	        anotherNonStaticMethod();
	        
	        System.out.println("---Calling static Method in Non-static method--");
	        staticMethod();
	        
	        System.out.println("---end of Non-static method--");
	    }

	    static void anotherStaticMethod() {
	        System.out.println("Another static method");
	    }

	    void anotherNonStaticMethod() {
	        System.out.println("Another non-static method");
	    }
	    
	    
	}
	


//1.Accessing Static Variables/Methods:

//Accessing Static Variables:
//From Static Method: Static methods can directly access static variables.
//From Non-Static (Instance) Method: Non-static methods can access static variables directly.

//Accessing Static Methods:
//From Static Method: Static methods can directly call other static methods.
//From Non-Static Method: Non-static methods can call static methods directly.


//2. Accessing Non-Static Variables/Methods:

//Accessing Non-Static Variables:
//From Static Method: Static methods cannot access non-static (instance) variables directly. You need an instance of the class to access them.
//From Non-Static Method: Non-static methods can access non-static variables directly.

//Accessing Non-Static Methods:
//From Static Method: Static methods cannot access non-static methods directly. You need an instance of the class to access them.
//From Non-Static Method: Non-static methods can call other non-static methods directly.








