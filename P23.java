import java.io.*;
import java.nio.file.*;
class P23
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
				BufferedWriter bw = Files.newBufferedWriter(p);
				PrintWriter pw = new PrintWriter(bw);	
				String data = c.readLine("Enter data to write");
				pw.println(data);
				pw.close();			
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