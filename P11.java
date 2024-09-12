/*	POLYMORPHISM CONCEPT OF OVERIDING
WAP class Rbi says that bank should
give min 3.5% roi,
class Icici is offering 5.5% and
class Yes bank is offering 7.5%.*/




class Rbi
{
	public void roi()
	{
		System.out.println("Rbi--->roi- 3.5%");
	}
}
class Icic extends Rbi
{
	public void roi()
	{
		System.out.println("Icic--->roi- 5.5%");
	}
}
class Yes extends Rbi
{
	public void roi()
	{
		System.out.println("Yes--->roi- 7.5%");
	}
}
class P11
{
	public static void main(String args[])
	{
		Icic i = new Icic();
		i.roi();
		Yes y = new Yes();
		y.roi();	
	}

}