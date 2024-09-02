// Declare and Display array in String
class P2
{
	public static void main(String args[])
	{ 
                System.out.println("Type 1");					
		String name[] = new String[5];			//Type 1 to declare array in String
		for(int i=0; i<name.length ;i++)
                System.out.println("position:-" +i+ "Element:-" + name[i]);


                System.out.println("Type 2");
		String name2[] = {"Sami","Saud","Amman","Affan"};			//Type 2 to declare the array in String
		for(int j=0; j<name2.length ;j++)
                System.out.println("position:-" +j+"Element:-" + name2[j]);

		

	}
}