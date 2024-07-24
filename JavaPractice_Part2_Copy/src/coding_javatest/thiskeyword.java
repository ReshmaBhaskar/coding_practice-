package coding_javatest;

//This Keyword example to refer to current class instance variable

//In below example, parameters (formal arguments) and instance variables are same. 
//So, we are using this keyword to distinguish local variable (rollno,name,fee) and instance variable (111, ankit,5000f).

/*
class Student{  
	int rollno;  
	String name;  
	float fee;  
	
	
	Student(int rollno,String name,float fee){  
	this.rollno=rollno;  
	this.name=name;  
	this.fee=fee;  
	}  
	void display(){System.out.println(rollno+" "+name+" "+fee);}  
}  


class thiskeyword{  
	public static void main(String args[]){  
	Student s1=new Student(111,"ankit",5000f);  
	Student s2=new Student(112,"sumit",6000f);  
	s1.display();  
	s2.display();  
}}  
*/




//Without this keyword - using different variable name

class Student2{  
	int rollno;  
	String name;  
	float fee;  
	Student2(int r,String n,float f){  
	rollno=r;  
	name=n;  
	fee=f;  
	}  
	void display(){System.out.println(rollno+" "+name+" "+fee);}  
}  
  
class thiskeyword{  
	public static void main(String args[]){  
		Student2 s1=new Student2(111,"ankit",5000f);  
		Student2 s2=new Student2(112,"sumit",6000f);  
	s1.display();  
	s2.display();  
}}  