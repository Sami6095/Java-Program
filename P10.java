//	POLYMORPHISM CONCEPT OF OVERLOADING
/*      Create a class MedicalShop with two overloaded methods named discount:
        1) If we only pass amount then give 10% discount
       2) If we pass amount and percentage then given discount as per the percentage specified */


class Medicalshop
{
	public void Discount(double amt)
	{	
		double final_amt = amt * 0.90;
		System.out.println("Final amount is"+final_amt);
	}
	public void Discount(double amt,double percentage)
	{	
		double final_amt = amt *(1-percentage/100); 
		System.out.println("Final amount is"+final_amt);
	}

}
class P10
{
	public static void main(String args[])
	{
		Medicalshop m = new Medicalshop();
		m.Discount(100);
		m.Discount(100,15);

	}
}