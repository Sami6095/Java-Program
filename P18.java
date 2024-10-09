import java.util.*;
class P18
{
	public static void main (String args[])
	{
		try
		{
			double num = Double.parseDouble(args[0]);
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