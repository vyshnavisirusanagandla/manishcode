package javapackage;

import java.util.InputMismatchException;

public class Single_try_multiple_catchs {
	public static void main(String[] args)
	{
		try
		{
	int div=10/10;
	System.out.println("division is "+div);
		}
		catch(ArithmeticException a)
		{
		System.out.println("Arithmetic Exception occured");
		}
		catch(InputMismatchException i)
		{
			System.out.println("input mis match exception occured");
		}

	}

}
