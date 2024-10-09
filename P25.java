import java.io.*;
import java.nio.file.*;
class P24
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
				Bufferedreader br = Files.newBufferedReader(p, StandardOpenOption.APPEND);
				String line = br.readLine();
				While( line != null)
				{	
					System.out.println(line);
					line = br.readLine();
				}
				br.close();			
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