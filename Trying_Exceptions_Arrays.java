package javapackage;
import java.util.Arrays;
public class Trying_Exceptions_Arrays
{
	public static void main(String[] args)
	{
		String name[]=new String[3];
		name[0]="vyshu";
		name[1]="ram";
		name[2]="viyu";
		try
		{
		name[3]="vamshi";
		System.out.println(Arrays.toString(name));
		}
		catch(ArrayIndexOutOfBoundsException a)
		{
System.out.println("ArrayIndexOutOfBoundsException occured");
		}
	catch(ArithmeticException a)
	{
		System.out.println("ArrayIndexOutOfBoundsException occured");
	}
	}
}
