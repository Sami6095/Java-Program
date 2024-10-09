import java.io.*;
import java.nio.file.*;
class P21
{
	public static void main(String args[])throws IOException
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
				
			Files.createFile(p);
			System.out.println(fn+"File created");
		
		}
	}
}