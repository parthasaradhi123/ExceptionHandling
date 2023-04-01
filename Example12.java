import java.util.Scanner;

class UnderAgeException extends Exception
{
	public UnderAgeException(String msg)
	{
		super(msg);
	}
}
class OverAgeException extends Exception
{
	public OverAgeException(String msg)
	{
		super(msg);
	}
}

class Aplicant
{
	int age;
	
	Scanner sc = new Scanner(System.in);
	
	public void input()
	{
		System.out.println("Enter your age");
		age = sc.nextInt();
		
	}
	public void verify() throws OverAgeException, UnderAgeException
	{
		if(age<18)
		{
			UnderAgeException ua = new UnderAgeException("Hey your age is less than 18 you are not allowed ");
			System.out.println(ua.getMessage());
			
			throw ua;
		}
		else if(age>60)
		{
			OverAgeException oa = new OverAgeException("hey your age is more than 60, you are not allowed ");
			System.out.println(oa.getMessage());
			
			throw oa;
			
		}
		else
		{
			System.out.println("You are eligible");
		}
	}
	
}


class Rto
{
	public void init()
	{
		Aplicant ap = new Aplicant();
		try {
			ap.input();
			ap.verify();
		}
		catch(UnderAgeException|OverAgeException e)
		{
			try {
				ap.input();
				ap.verify();
			}
			catch(UnderAgeException|OverAgeException e1)
			{
				System.out.println();
				System.out.println(":: Don't ever try again read rules ::");
				System.exit(0);
			}
		}
	}
}




public class Example12 {

	public static void main(String[] args)
	{
		 Rto r = new Rto();
		 r.init();
	}

}
