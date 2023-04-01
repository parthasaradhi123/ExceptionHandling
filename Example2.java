import java.util.Scanner;

public class Example2 {

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
			
			System.out.println("The result is :: "+res);
				
		}
		catch(ArithmeticException aA)
		{
			System.out.println("You are trying to divide a number by zero fool, dont do that ");
			 
		}
		
		int[] a = null;
		int ele = 0;
		try
		{
			System.out.println("Enter the size of array :- ");
			int size = sc.nextInt();
			
			 a= new int[size];
			 
			
		}
		catch(NegativeArraySizeException nAE)
		{
			System.out.println("You are trying to give a array size and that value is negative, not allowed.");
		}
					
			
		
		
		try
		{
			System.out.println("Enter the element you wanna store in the array :: ");
			ele = sc.nextInt();
			 
			System.out.println("Enter the position position at which the element has to intered.");
			int pos = sc.nextInt();
			
			a[pos] = ele;

			System.out.println("Element "+ele+"Inserted at "+pos+"Successfully ");
		}
		catch(ArrayIndexOutOfBoundsException aIOBE )
		{
			System.out.println(" You are giving the array size which not within array size");
		}
		
		catch(Exception e)
		{
			System.out.println("Wrong input");
		}	

		System.out.println("The connection is terminated ");
			
		}

		
	}
		
	


