//To read the name From user and Welcome the user using ifElse Statement



import java.io.*;
class P4
{
	public static void main(String args[])
	{ 
		System.out.println("Welcome  to GitHub");
		Console c = System.console();
		String name = new String(c.readLine("Enter name"));

		if (name.trim().equals(""))					//Trim is use for removing leading and traling Whitespace from string
		{
			System.out.println("You didnot Enter Name");
		}
		else
		{
			String msg = "Welcome" +" "+name;	
			System.out.println(msg);

		}
		

	}
}