import java.io.*;
import java.nio.file.*;
class P22
{
	public static void main(String args[])
	{
		Console c = System.console();
		String fn = c.readLine("Enter Filename");
		Path p = Paths.get(fn);
		
		if(Files.exists(p))
		{
			try
			{	
				Files.delete(p);
				System.out.println(fn+"File DEleted");
			}
			catch(IOException e)
			{
				System.out.println("issue"+e);
			}

		}
		else
		{
			
				System.out.println("file not founded");

		}
	}
}