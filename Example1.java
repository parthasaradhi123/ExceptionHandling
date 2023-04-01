import java.util.Scanner;

public class Example1 {

	public static void main(String[] args)
	{
		System.out.println("Connection is established ");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first number to divide");
		int num1 = sc.nextInt();
		
		System.out.println("Enter the second number to divide");
		int num2 = sc.nextInt();
		try
		{
			int res = num1/num2; // if there is an error in these line then the below lines
			                    // will never get executed and control directly goes to Catch() block.
			
			System.out.println("The Result is " +res);
			System.out.println("-----------");
			System.out.println("===============");
		}
		catch(Exception e)
		{
			System.out.println("You are trying to divide a number by zero fool ");
		}
		System.out.println("The connection is terminated ");
	}

}
