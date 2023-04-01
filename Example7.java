import java.util.Scanner;

class Keka 
{
	Scanner sc  = new Scanner(System.in);
	public void disp() throws ArithmeticException
	{
		try
		{
		int a,b, res;
		
		System.out.println("Enter the first value to divide :: ");
		a = sc.nextInt();
		
		System.out.println();
		
		System.out.println("Enter the second value to divide :: ");
		b =sc.nextInt();
		
		res = a/b;
		
		System.out.println("The Final result is res ::====:: "+ res);
		}
		catch(ArithmeticException a)
		{
			System.out.println(":: You are dividing a number zero :: And the Exception is handled in Keka class handler :: ");
			throw a;
		}
		finally 
		{
			System.out.println("Connection Terminated ::");
		}
	}
}



public class Example7
{

	public static void main(String[] args) 
	{
		try {
		Keka k = new Keka();
		k.disp();
		}
		catch(ArithmeticException a)
		{
			 
			System.out.println(a.getMessage());
			System.out.println(a.toString());
			System.out.println(":: You are dividing a number zero :: And the Exception is Handled in Main Method :: ");

		}
	}

}
