//WAP TO Find the Number Between 5 to 14



import java.util.*;
class P19
{
	public static void main (String args[])
	{
		try
		{
			int num = Integer.parseInteger(args[0]);
			if(num<5)||(num>14) 
				throw new Exception("Number Should be between 5 to 14");
			else
				System.out.println("Integer Enter is "+num);
				
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