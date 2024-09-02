//Wap to display the feature of Mobile using class and object.



class Mobile
{
	private String processor;
	private int memory , storage , battery, volume;
	
	public void SetData(String p , int m, int s, int b, int v)
	{
		processor=p;
		memory=m;
		storage=s;
		battery=b;
		volume=v;

	}
	public void ShowData()
	{
		System.out.println(processor +" "+memory+" "+storage+"  "+battery+" "+volume);		
	}
	public void Volumeup()
	{
		volume++;		
	}
	public void Volumedown()
	{
		volume--;		
	}
	
}
class P7
{
	public static void main(String args[])
	{
		Mobile m = new Mobile();
		m.SetData("Samsung",8,128,5000,10);
		m.ShowData();	
		m.Volumeup();		
		m.Volumedown();	

		Mobile a = new Mobile();
		a.SetData("Apple",12,156,6000,8);
		a.ShowData();	
		a.Volumeup();		
		a.Volumedown();			
	
	}


}