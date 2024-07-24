package coding_javatest;


interface CentralTraffic
{
	public void GreenGo();
	public void RedStop();
	public void YellowFlash();
}

public class SimpleInterface implements CentralTraffic {
	
	public static void main (String[] args)
	
	{
		//SimpleInterface t =new SimpleInterface(); //this also gives same result bcoz in interface you will define all methods in main class
		CentralTraffic t =new SimpleInterface();
		t.GreenGo();
		t.RedStop();
		t.YellowFlash();
	}

	
	public void GreenGo()
	{
		System.out.println("Signal is Green");
	}
	
	public void RedStop()
	{
		System.out.println("Signal is red");
	}
	
	public void YellowFlash()
	{
		System.out.println("Signal is yellow");
	}
}
