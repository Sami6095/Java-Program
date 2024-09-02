//Wap to take n number of Student Data like rollno,name,adress and marks and Display it 



import java.io.*;
class Student 
{
	private int rno , marks;	
	private String name , adress;					
				
	public Student(int rno , String name , String adress, int marks)				
	{
		this.rno=rno;							
		this.name=name;
		this.adress=adress;
		this.marks=marks;
	}
	public void ShowData()
	{
		System.out.println("The Student RollNo is:-"+this.rno);
		System.out.println("The Student Name is:-"+this.name);
		System.out.println("The Student Adress is:-"+this.adress);
		System.out.println("The Student marks is:-"+this.marks);
	}
	public void findgrade()
	{
		if (this.marks>80)
		{
			System.out.println("The Student " +name+"Grade is A");

		}
		else if (this.marks>60)
		{
			System.out.println("The Student " +name+"Grade is B");

		}
		else 
		{
			System.out.println("The Student " +name+"Grade is C");

		}
	}	
}
class P6
{
	public static void main(String args[])
	{
		Console c = System.console();
		int num = Integer.parseInt(c.readLine("Enter the Number of Students:-"));
		Student data[] = new Student[num];
		
		for(int i=0; i<num; i++)
		{
			int r = Integer.parseInt(c.readLine("Enter the RollNo of Student:-"));
			String n = c.readLine("Enter the Name of Student:-");
			String a = c.readLine("Enter the Adress of Student:-");
			int m = Integer.parseInt(c.readLine("Enter the Marks of Student:-"));
			data[i] = new Student(r,n,a,m);
		}
		for(int i=0; i<num; i++)
		{
			data[i].ShowData();
			data[i].findgrade();
			System.out.println("******************************");

		}
	}


}