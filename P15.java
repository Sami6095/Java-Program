//WAP for printing songs and writing assignment and download using Threads   implements




class Assignment implements Runnable
{
	public void run()
	{
		System.out.println("WRITTING WORK STARTED");
		for(int i=1; 1<=10 ; i++)
		{
			System.out.println("WRITTING "+ i);
			try 
			{
				Thread.sleep(5000);
			} 
			catch(Exception e){}
		}		
			System.out.println("WRITTING WORK Ended");	
	
	}
}
class Song implements Runnable
{
	public void run()
	{
		System.out.println(" SONG STARTED");
		for(int i=1; 1<=20 ; i++)
		{
			System.out.println("SONG "+ i);
			try
		 	{
				Thread.sleep(2000);
			} 
			catch(Exception e){}
		}	
			System.out.println(" SONG Ended");			

	}
}
class Download implements Runnable
{
	public void run()
	{
		System.out.println(" Download STARTED");
		for(int i=1; 1<=5; i++)
		{
			System.out.println("Download "+ i);
			try
		 	{
				Thread.sleep(10000);
			} 
			catch(Exception e){}
		}	
			System.out.println(" Download Ended");			

	}
}
class P15
{
	public static void main(String args[])
	{
		Assignment a = new Assignment();
		Thread t1 = new Thread(a);
		t1.start();
		
		Song s = new Song();
 		Thread t2 = new Thread(s);	
		t2.start();
		
		Download d = new Download();
 		Thread t3 = new Thread(d);	
		t3.start();
	
	}

}
	
	