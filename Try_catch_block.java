package javapackage;

public class Try_catch_block {
	public static void main(String[] args) {
		int a=1;
		int b=0;
		try
		{
			System.out.println("try block");
		double c=a/b;
		System.out.println(c);
		System.out.println("try block end");//not coming inside the try block if 
		
	}
catch(ArithmeticException d)
{
	System.out.println("exception name");
}
	finally
	{
		System.out.println("ffff");
	}
}
}
