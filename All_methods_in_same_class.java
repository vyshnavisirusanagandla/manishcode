package javapackage;

public class All_methods_in_same_class
{
	public static void add()
	{
		System.out.println("1");
	}
	private static void sub()
	{
		System.out.println("2");
	}
	protected static void mul()
	{
		System.out.println("3");
	}
	 static void div()
	{
		System.out.println("4");
	}

	public static void main(String[] args) 
	{
		add();
		sub();
		mul();
		div();
//all the methods are accesseed by its method name
	}

}
