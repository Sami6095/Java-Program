import java.io.*;
import java.nio.file.*;
class P20
{
	public static void main(String args[])
	{
		Console c = System.console();
		String fn = c.readLine("Enter Filename");
		Path p = Paths.get(fn);
		
		if(Files.exists(p))
		{
			System.out.println("File Already exist");
		}
		else
		{
			try
			{	
				Files.createFile(p);
				System.out.println(fn+"File created");
			}
			catch(IOException e)
			{
				System.out.println("issue"+e);
			}
		}
	}
}