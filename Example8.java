class Demo
{
	public int disp()
	{
		try {
		System.out.println(":: Method Started ::");
		return 10; // Lines below return statement will never get executed
		}
		finally 
		{
			System.out.println(":: Method Ended ::");
		}
	}
}



public class Example8 {

	public static void main(String[] args)
	{
		Demo d = new Demo();
		d.disp();
		}

}
