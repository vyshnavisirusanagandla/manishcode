package javapackage;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Nested_exceptionhandling {
	public static void main(String[] args) {
		try
		{
Scanner s1=new Scanner(System.in);
System.out.println("enter the 10 digit mobile number");
int number=s1.nextInt();
//System.out.println(Arrays.toString(s1));
		}
		catch(InputMismatchException i)
		{
			System.out.println("please enter only 10 digit mobile number");
		}
		/*try
		{
			int numb=s1.nextInt();
			System.out.println("second try block");
		}*/
	catch(ArithmeticException b)
		{
		System.out.println("please enter only number");
		}
		finally
		{
			System.out.println("finally block");
		}
	}

}
