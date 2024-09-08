//WAP to implement MULTILEVEL INHERITENCE 	


	
class Person 
{
	private int id;
	private String name;
	public Person (int id , String name)
	{
		this.id=id;
		this.name=name;
	} 
	
	public void Show()
	{
		System.out.println("Id:-"+this.id);
		System.out.println("Name:-"+this.name);
	}
}
 class Teacher extends Person
{
	private double salary;
	public Teacher (int id , String name ,double salary)
	{
		super(id,name);
		this.salary=salary;		
	} 
	
	public void Show()
	{
		super.Show();		
		System.out.println("Salary:-"+this.salary);
	}

}
 class Hod extends Person
{
	private String dept;
	public Hod (int id , String name , String dept)
	{
		super(id,name);
		this.dept=dept;		
	} 
	
	public void Show()
	{
		super.Show();		
		System.out.println("Department:-"+this.dept);
	}

}

class P9
{
	public static void main(String args[])
	{	
		Person p = new Person(1,"Sami");
		p.Show();
		
		Teacher t = new Teacher(1,"Saud",90000);
		t.Show();

		Hod h = new Hod(1,"Affan","Bscit");
		h.Show();

	}
}
