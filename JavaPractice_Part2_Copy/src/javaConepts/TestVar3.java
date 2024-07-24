package javaConepts;

//Default access specifier which is accessible only within this package
 class TestVar3 {

	//Local, static(Class) & Instance(Global) variable example in java
	
	public static String name="Raj"; //static variable
	public static int age;//static variable
	public int salary; //Instance Variable
	protected int height=5; //Instance variable initialised and protected access specifier enables to be accessed only in its class & its subclass
	private int weight = 55; //Instance variable initialised and private access specifier enables to be accessed only in its class
	
	public TestVar3()
	{
		String empId = "123"; //Local variable as its local to this code block (constructor)
		this.salary = 100; ////Instance Variable initialisation
		System.out.println("emp id who needs salary info -"+ empId); //printing local variable value
		nonstaticmethod(); //can be accessed via constructor otherwise only static method
	}
	
//	public static void staticmethod()
//	{
//		nonstaticmethod();
//	}
	
	public void nonstaticmethod()
	{
		System.out.println("accessing static variable in non-static method -"+ TestVar3.name);

	}
	
	public static void main(String[] args) {
		
		//create an object or instance of the class
		TestVar3 var = new TestVar3();
		System.out.println("emp salary is -"+ var.salary); //accessing instance variable via object reference
		System.out.println("emp height is -"+ var.height); //accessing instance variable via object reference
		System.out.println("emp weight is -"+ var.weight); //
		System.out.println("emp age is -"+ TestVar3.age); //accessing static variable via  class name
		System.out.println("emp name is -"+ TestVar3.name); //accessing static variable via  class name
		
	}

	
	
	
}
