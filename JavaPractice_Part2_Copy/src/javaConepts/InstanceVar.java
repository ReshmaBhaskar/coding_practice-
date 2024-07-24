package javaConepts;

public class InstanceVar {

	//instance variable can be accessed via an object reference
	int rollno = 73; //instance variable
	int marks = 100; //instance variable
	String name; //instance variable
	
	public InstanceVar(String name)
	{
		this.name = name;
		//System.out.println(rollno);
	}
	
	public static void main(String[] args) {
		
		
		InstanceVar obj1 = new InstanceVar("Resh"); //create an object in order to access the instance variable
		obj1.show();// every object of the class will have one copy of the variable. 
		InstanceVar obj2 = new InstanceVar("Roy");
		obj2.show();
		InstanceVar obj3 = new InstanceVar("Raych");
		obj3.show();
		
		
	}

	public void show()
	{
		System.out.println("Roll number is - "+rollno+" and the marks is -"+marks+"Student name is -"+name);
		
	}
	
	
}
