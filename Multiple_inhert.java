package javapackage;
class  Amazon
{
static void meth1()
{
	System.out.println("meth1 is called");
		
}
	}

class  Ajio 
{
static void meth2() 
{
	System.out.println("meth2 is called");
		

	}
}

public class Multiple_inhert extends Ajio,Amazon  //multiple inheritance is not possible through extends keyword
{
 static	void meth3()
	{
		System.out.println("meth3 is called");
	}

	public static void main(String[] args)
	{
		meth2();

	}

}
