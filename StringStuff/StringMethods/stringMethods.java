package StringMethods;

import java.util.Scanner;

public class stringMethods 
{
	//Reverse swtichcase pig latin
	
	public static void main(String[]args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("What string would you like to work with?");
		String testString= in.nextLine();
		System.out.println("Your string is "+testString);
		String outString=switchCase(testString);
		System.out.println("Your swithced case string is "+outString);
		outString=reverseString(testString);
		System.out.println("Your reversed string is "+outString);
		outString=pigLatin(testString);
		System.out.println("Your pig latined string is "+outString);
		System.exit(1);
	}
	public static String switchCase (String myString)
	{
		int length=myString.length()-1;
		StringBuilder builder=new StringBuilder();
		String switchString="";
		char[] cArray;
		cArray=myString.toCharArray();
		for(int i=0;i<=length;i++)
		{
			char c=cArray[i];
			if(Character.isUpperCase(c))
			{
				c=Character.toLowerCase(c);
				builder.append(c);
			}
			else
			{
				c=Character.toUpperCase(c);
				builder.append(c);
			}
		}
		switchString=builder.toString();
		return switchString;
	}
	public static String reverseString(String myString)
	{
		
		char c;
		int length=myString.length()-1;
		char[] cArray=myString.toCharArray();
		StringBuilder builder=new StringBuilder();
		for(int i=length;i>=0;i--)
		{
			c=cArray[i];
			builder.append(c);
		}
		return builder.toString();
		
	}
	public static String pigLatin(String myString)
	{
		String [] stringArray=myString.split(" ");
		
		
		StringBuilder builder=new StringBuilder();
		
		for(int i=0;i<=stringArray.length-1;i++)
		{
			   if(stringArray[i]==" ")
			   {
				   builder.append(" ");
			   }
			   else
			   {
				   String s=stringArray[i];
					char[]cArray=s.toCharArray();
					char firstChar=cArray[0];
					int stringLength=s.length();
					for(int j=1;j<=stringLength-1;j++)
					{
						
						builder.append(cArray[j]);
					}
					builder.append(firstChar);
					builder.append("ay");
			   }
				
		}
		return builder.toString(); 
	}
}
