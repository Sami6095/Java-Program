//WAP TO Find Square root of Number Using Scanner and Throw the Exception 

import java.util.*;
class P17
{
	public static void main (String args[])
	{
		Console c = System.console();
		try
		{
			System.out.println("Enter the integer");
			double num = c.readLIne(nextDouble());
			if(num<0)
				throw new Exception("Number Should not be -ve");
				double res = Math.sqrt(num);
				String msg = "Square root="+res;
				System.out.println(msg);
		}
		catch(InputMismatchException ime)
		{
			System.out.println("Please enter Number Only");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}