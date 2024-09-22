/*WAP for printing songs and writing assignment using Threads  

class Assignment extends Thread
{
	public void run()
	{
		System.out.println("WRITTING WORK STARTED");
		for(int i=1; 1<=10 ; i++)
		{
			System.out.println("WRITTING "+ i);
			try 
			{
				Thread.sleep(3000);
			} 
			catch(Exception e){}		
			System.out.println("WRITTING WORK Ended");	
		}


	}
}
class Song extends Thread
{
	public void run()
	{
		System.out.println(" SONG STARTED");
		for(int i=1; 1<=20 ; i++)
		{
			System.out.println("SONG "+ i);
			try
		 	{
				Thread.sleep(1000);
			} 
			catch(Exception e){}	
			System.out.println(" SONG Ended");		
		}

	}
}
class P14
{
	public static void main(String args[])
	{
		Assignment a = new Assignment();
		Thread t1 = new Thread(a);
		t1.start();
		
		Song s = new Song();
 		Thread t2 = new Thread(s);	
		t2.start();

	}

}
	
	