package javapackage;

public class Non_static_method {
	void add()
	{
		int a=1;
		int b=2;
		 int add=a+b;
		
		System.out.println("non static");
	}

	public static void main(String[] args)
	{
		Non_static_method m1=new Non_static_method();
		m1.add();
	
		}

	}


