import java.util.Scanner;

class IllegalAge extends Exception
{
	IllegalAge(String msg)
	{
		super(msg);
	}
}
class Partha
{
	int age;
	Scanner sc = new Scanner(System.in);
	
	public void input()
	{
		System.out.println(":: Please enter your age ::");
		age = sc.nextInt();
		
	}
	public void verify() throws IllegalAge
	{
		if(age>18)
		{
			System.out.println(":: you are allowed to enter into these website ::");
		}
		else
		{
			IllegalAge i = new IllegalAge("::Your are not allowed because of age limit restrictions ::");
			System.out.println(i.getMessage());
			System.out.println("--------------------------------------------------------------------------------");
			
			throw i;
		}
	}
}

class Host
{
	Partha p = new Partha();
	
	public void init()
	{
		try 
		{
			p.input();
			p.verify();
		}
		catch(IllegalAge e)
		{
			try 
			{
				p.input();
				p.verify();
			}
			catch(IllegalAge e1)
			{
				System.out.println();
				System.out.println("::Hey you wanna see some 18+ stuff, you are not allowed ::");
				System.out.println();
			}
		}
		finally
		{
			System.out.println("Your connection to the Application was terminated. ");
		}
	}
}



public class Example13 {

	public static void main(String[] args) 
	{
		Host h = new Host();
		h.init();
	}

}
