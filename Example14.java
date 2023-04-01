import java.io.BufferedReader;
import java.io.FileReader;

public class Example14 {

	public static void main(String[] args)
	{
		try(final BufferedReader br = new BufferedReader(new FileReader("Sample.txt")))
		{
			//br = new BufferedReader(new FileReader("Output.txt")); // C.E cannot be reassigned.
			 // variable br is final.
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
