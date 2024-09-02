// Declare and Display array in integer
class P1
{
	public static void main(String args[])
	{ 
                System.out.println("Type 1");					
		int data[] = new int[5];			//Type 1 to declare array in integer
		for(int i=0; i<data.length ;i++)
                System.out.println("position:-" +i+ "Element:-" + data[i]);


                System.out.println("Type 2");
		int data2[] = {10,30,20,40,40};			//Type 2 to declare the array in integer
		for(int j=0; j<data2.length ;j++)
                System.out.println("position:-" +j+"Element:-" + data2[j]);

		

	}
}