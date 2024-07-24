package javaConepts;

//public access specifier accessible anywhere in the project
public class TestVar4 {
	

	public static void main(String[] args) {
		 
		//cannot make static reference to non-static variables/methods
		// Accessing static variables from Variables class
        System.out.println("Employee age from Variables class: " + TestVar3.age);
        System.out.println("Employee name from Variables class: " + TestVar3.name);

        // Creating an object of Variables class to access instance variable
        TestVar3 var = new TestVar3();
        // Accessing instance variable using the object
        System.out.println("Employee salary from Variables class: " + var.salary);
        System.out.println("Employee Height from Variables class: " + var.height);
       // System.out.println("Employee weight from Variables class: " + var.weight); //weight is private to variables class and hence its not accessible
	}

}
