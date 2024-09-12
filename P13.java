// wap FOR INTERFACE CLASS 




interface  Dad
{
	public void MobileBills()
	{
		System.out.println("DAD WILL PAY THE MOBILE BILLS ");
	}
	
	public abstract void ElictricBill();
}
class Son implements Dad
{
	public void ElictricBill()
	{
		System.out.println("SON WILL PAY THE ELECTRIC BILLS ");		
	}
}
class P13
{
	public static void main(String args[])
	{
		Son s = new Son();
		s.MobileBills();
		s.ElictricBill();
	}
}