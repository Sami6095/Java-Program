// To Declare a String and Display the string and Read the string From User and to display the word character



import java.io.*;		//use when we what some thing from user
class P1
{
	public static void main(String args[])
	{ 
		String S= "My name is Sami Ansari";				//To Declare the String
		System.out.println(S);
 		
		Console c = System.console();					//To read the Strin that User Want to display
		String name = new String(c.readLine("Enter Sentence"));
		System.out.println(name);

		char ch[] = name.toCharArray();					//Converting the String into Char and Storing in Array
		for(int i=0; i<ch.length;i++)					//Applying the ForLoop to toke the word from string
		System.out.println(ch[i]);


	}
}