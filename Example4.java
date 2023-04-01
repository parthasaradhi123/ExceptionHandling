//unchecked exception:- Compiler will never know about these compiler or not compiled by the compiler
//checked exception :- while we are writing the code the compiler will do the automatic compilation and if it
                       // find any exception then you should handle then only the compiler will allow you to code 
                       // or run the programme.



public class Example4 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.out.println("Before Sleep ");
		Thread.sleep(4000);
		System.out.println("After Nap ");

	}

}
