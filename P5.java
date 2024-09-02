//Wap to calculate the area and perimeter of rectangle
import java.io.*;
class Rectangle 
{
	private double Length , Breadth;						//Declaring the State or Varible
	public Rectangle(double Length , double Breadth)				//Declaring Parameterize Constructor
	{
		this.Length=Length;							//this is for similar Parameter name
		this.Breadth=Breadth;
	}
	public void ShowData()
	{
		System.out.println("The Length of the Rectangle is:-"+this.Length);
		System.out.println("The Breadth of the Rectangle is:-"+this.Breadth);
	}
	public void area()
	{
		double area = this.Length*this.Breadth;
		System.out.println("The Area of the Rectangle is:-"+area);
	}
	public void perimiter()
	{
		double perimiter = 2*this.Length*2*this.Breadth;
		System.out.println("The perimiter of the Rectangle is:-"+perimiter);
	}
	
	
}
class P5
{
	public static void main(String args[])
	{
		Console c = System.console();
		double Length = Double.parseDouble(c.readLine("Enter Length:-"));
		double Breadth = Double.parseDouble(c.readLine("Enter Breadth:-"));
		
		if ((Length>0.0)&&(Breadth>0.0))
		{
			Rectangle r = new Rectangle(Length,Breadth);			//Calling the Constructor and making the object
			r.ShowData();							//Using object to call Behaviour or Function
			r.area();
			r.perimiter();
		}
		else
		{
			System.out.println("Invalid Data");				
		}

	}


}