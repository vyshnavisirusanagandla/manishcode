package javapackage;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Anagram_Accepting_user_input {
static String name1;
static String name2;
	public static void main(String[] args) 
	{
		try
		{
Scanner s=new Scanner(System.in);
System.out.println("please enter the name");
name1=s.next();
if(!name1.matches("[a-zA-Z]+"))
{
	throw new InputMismatchException("invalid string enter again");
	
}
	}
catch( InputMismatchException a)
{
	System.out.println("enter the string");
	return;
}
System.out.println("enter string 1"+name1);
try
{
Scanner s=new Scanner(System.in);

System.out.println("please enter the name2");
name2=s.next();
if(!name2.matches("[a-zA-Z]+"))
{
throw new InputMismatchException("invalid string enter again");

}
}
catch( InputMismatchException a)
{
System.out.println("enter the string");
return;
}
System.out.println("enter string 2"+name2);
char[] c1=name1.toCharArray();
char[] c2=name2.toCharArray();
Arrays.sort(c1);
Arrays.sort(c2);
if(Arrays.equals(c1,c2))
{
	System.out.println("they are equal and anagram");
}
else
{
	System.out.println("they are not anagram");
}
}
}
