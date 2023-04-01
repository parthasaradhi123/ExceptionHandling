import java.util.Scanner;

class InvalidCustomerException extends Exception
{
	public InvalidCustomerException (String s)
	{
		super(s);
	}
}

class Atm
{
	int userId = 1221;
	int passWord = 1111;
	int pw;
	int uid;
	Scanner sc = new Scanner(System.in);
	
	public void input()
	{
		System.out.println("Enter user id :: ");
		uid = sc.nextInt();
		
		System.out.println();
		
		System.out.println("Ente the passpword :: ");
		pw =sc.nextInt();
			
	}
	
	public void verify() throws InvalidCustomerException
	{
		if(userId == uid && passWord == pw) 
		{
			System.out.println("Take your cash ");
		}
		else
		{
			System.out.println();
			
			InvalidCustomerException ine = new InvalidCustomerException("Are you sure? wrong input ");
			
			System.out.println(ine.getMessage());

			System.out.println();

			throw ine;
		}
	}
}


class Bank
{
	public void ini()
	{
		Atm a = new Atm();
	  
	    try 
	    {
	    	a.input();
			a.verify();
		} 
	    catch (InvalidCustomerException e1)
	    {
	    	 try 
	 	    {
	    		a.input();
	 			a.verify();
	 		} 
	 	    catch (InvalidCustomerException e2)
	 	    {
	 	    	 
	 		    try 
	 		    {
	 		    	a.input();
	 				a.verify();
	 			}
	 		    catch(InvalidCustomerException e3) 
	 		    {
	 		    	System.out.println(":: Hey choor uncle/aunty we caught you ::");
	 		    	System.exit(0);
	 		    }
	 		}
			 
		}
		  
	}
}


public class Example11 {

	public static void main(String[] args) 
	{
		 
		 Bank b = new Bank();
		 b.ini();

	}

}
